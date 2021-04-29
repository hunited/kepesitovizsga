package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private final DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "SELECT `breed` FROM `dinosaur` WHERE `expected` < `actual` ORDER BY `breed` ASC;"
             )) {
            return getDinosaurs(statement);
        } catch (SQLException se) {
            throw new IllegalStateException("Something went wrong", se);
        }
    }

    private List<String> getDinosaurs(PreparedStatement statement) throws SQLException {
        List<String> result = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String name = resultSet.getString("breed");
                result.add(name);
            }
        }
        return result;
    }

}
