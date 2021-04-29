package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int damage;
    protected boolean armory;

    protected MilitaryUnit(int hitPoints, int damage, boolean armory) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.armory = armory;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isArmory() {
        return armory;
    }

    public abstract int doDamage();

    public abstract void sufferDamage(int damage);

}
