package PrototypePattern;

public class CharacterStats implements CharacterStatsPrototype {
    private int health;
    private int atkDamage;

    public CharacterStats(int health, int atkDamage) {
        this.health = health;
        this.atkDamage = atkDamage;
    }

    // prototype constructor
    public CharacterStats(CharacterStats prototype) {
        this.health = prototype.health;
        this.atkDamage = prototype.atkDamage;
    }

    @Override
    public CharacterStats clone() {
        return new CharacterStats(this);
    }

    public int getHealth() {
        return health;
    }

    public int getAtkDamage() {
        return atkDamage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAtkDamage(int atkDamage) {
        this.atkDamage = atkDamage;
    }
}
