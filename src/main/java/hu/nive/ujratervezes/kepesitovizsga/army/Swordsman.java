package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean shield = true;

    public Swordsman(boolean armory) {
        super(100, 10, armory);
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        if (shield) {
            shield = false;
        } else {
            if (this.armory) {
                hitPoints -= damage / 2;
            } else {
                hitPoints -= damage;
            }
        }
    }

}
