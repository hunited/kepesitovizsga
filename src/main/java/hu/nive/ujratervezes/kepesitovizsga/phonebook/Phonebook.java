package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (output == null || output.isEmpty() || contacts == null) {
            throw new IllegalArgumentException("Something was wrong");
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
            writeFile(contacts, writer);
        } catch (IOException ioException) {
            throw new IllegalArgumentException("Can not write file");
        }
    }

    private void writeFile(Map<String, String> contacts, BufferedWriter writer) throws IOException {
        for (Map.Entry row : contacts.entrySet()) {
            writer.write(row.getKey() + ": " + row.getValue() + "\n");
        }
    }

}
