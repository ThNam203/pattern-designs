package PrototypePattern;

abstract public class Character implements CharacterPrototype {
    protected String name;
    protected CharacterStats characterStats;

    public String getName() {
        return name;
    }

    public CharacterStats getCharacterStats() {
        return characterStats;
    }

    abstract public Character clone();
}

