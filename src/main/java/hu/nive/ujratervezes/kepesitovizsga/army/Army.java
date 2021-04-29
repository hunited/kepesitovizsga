package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private final List<MilitaryUnit> military = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        military.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit militaryUnit : military) {
            militaryUnit.sufferDamage(damage);
        }
        military.removeIf(militaryUnit -> militaryUnit.getHitPoints() < 25);
    }

    public int getArmyDamage() {
        int result = 0;
        for (MilitaryUnit militaryUnit : military) {
            result += militaryUnit.doDamage();
        }
        return result;
    }

    public int getArmySize() {
        return military.size();
    }

}
