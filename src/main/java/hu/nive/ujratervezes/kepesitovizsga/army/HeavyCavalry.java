package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int counter = 0;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        if (counter == 0) {
            counter++;
            return damage * 3;
        } else {
            return damage;
        }
    }

    @Override
    public void sufferDamage(int damage) {
        hitPoints -= damage / 2;
    }

}
