package Prototype;

public class WarriorCharacter extends Character {
    public WarriorCharacter(String name, int health, int atkDamage) {
        this.name = name;
        this.characterStats = new CharacterStats(health, atkDamage);
    }

    // prototype constructor
    public WarriorCharacter(WarriorCharacter prototype) {
        this.name = prototype.name;
        this.characterStats = prototype.characterStats.clone();
    }

    @Override
    public Character clone() {
        return new WarriorCharacter(this);
    }
}
