package PrototypePattern;

public class MageCharacter extends Character {
    private String type;

    public MageCharacter(String name, String type, int health, int atkDamage) {
        this.name = name;
        this.type = type;
        this.characterStats = new CharacterStats(health, atkDamage);
    }

    // prototype constructor
    public MageCharacter(MageCharacter prototype) {
        this.name = prototype.name;
        this.type = prototype.type;
        this.characterStats = prototype.characterStats.clone();
    }

    @Override
    public Character clone() {
        return new MageCharacter(this);
    }

    public String getType() {
        return type;
    }
}
