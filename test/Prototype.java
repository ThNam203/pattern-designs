import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import Prototype.Character;
import Prototype.MageCharacter;
import Prototype.WarriorCharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Prototype {
    private MageCharacter prototypeFireMage;
    private MageCharacter prototypeIceMage;
    private WarriorCharacter prototypeWarrior;

    @BeforeEach
    public void setUp() {
        // create prototypes
        prototypeFireMage = new MageCharacter("EternalFlame", "Fire", 100, 50);
        prototypeIceMage = new MageCharacter("IcyLight", "Ice", 200, 30);
        prototypeWarrior = new WarriorCharacter("TheUndefeated", 300, 40);
    }

    @Test
    public void testMageClone() {
        Character fireMage = prototypeFireMage.clone();
        Character iceMage = prototypeIceMage.clone();

        // ensure class of the cloned objects
        assertThat(fireMage, instanceOf(MageCharacter.class));
        assertThat(iceMage, instanceOf(MageCharacter.class));

        // ensure they are referring to different objects
        assertNotSame(prototypeFireMage, fireMage, "Cloned object should be a different instance");
        assertNotSame(prototypeIceMage, iceMage, "Cloned object should be a different instance");

        // ensure properties equality
        assertEquals(prototypeFireMage.getName(), fireMage.getName(), "Cloned mage should have the same name");
        assertEquals(prototypeIceMage.getName(), iceMage.getName(), "Cloned mage should have the same name");

        assertEquals(prototypeFireMage.getType(), ((MageCharacter)fireMage).getType(), "Cloned mage should have the same type");
        assertEquals(prototypeIceMage.getType(), ((MageCharacter)iceMage).getType(), "Cloned mage should have the same type");

        assertEquals(prototypeFireMage.getCharacterStats().getAtkDamage(), fireMage.getCharacterStats().getAtkDamage(), "Cloned mage should have the same stats");
        assertEquals(prototypeFireMage.getCharacterStats().getHealth(), fireMage.getCharacterStats().getHealth(), "Cloned mage should have the same stats");
        assertEquals(prototypeIceMage.getCharacterStats().getAtkDamage(), iceMage.getCharacterStats().getAtkDamage(), "Cloned mage should have the same stats");
        assertEquals(prototypeIceMage.getCharacterStats().getHealth(), iceMage.getCharacterStats().getHealth(), "Cloned mage should have the same stats");
    }

    @Test
    public void testWarriorClone() {
        Character warrior = prototypeWarrior.clone();

        assertThat(warrior, instanceOf(WarriorCharacter.class));
        assertNotSame(prototypeWarrior, warrior, "Cloned object should be a different instance");
        assertEquals(prototypeWarrior.getName(), warrior.getName(), "Cloned warrior should have the same name");
        assertEquals(prototypeWarrior.getCharacterStats().getHealth(), warrior.getCharacterStats().getHealth(), "Cloned warrior should have the same stats");
        assertEquals(prototypeWarrior.getCharacterStats().getAtkDamage(), warrior.getCharacterStats().getAtkDamage(), "Cloned warrior should have the same stats");
    }

    @Test
    public void testCharacterStatsDeepCopy() {
        WarriorCharacter warrior = (WarriorCharacter) prototypeWarrior.clone();
        MageCharacter mage = (MageCharacter) prototypeFireMage.clone();

        // modify the cloned stats
        warrior.getCharacterStats().setHealth(1000);
        warrior.getCharacterStats().setAtkDamage(100);

        mage.getCharacterStats().setHealth(500);
        mage.getCharacterStats().setAtkDamage(200);

        // Ensure the original stats remain unchanged
        assertNotSame(prototypeWarrior.getCharacterStats(), warrior.getCharacterStats(), "Stats should be deep copied, not shared");
        assertEquals(300, prototypeWarrior.getCharacterStats().getHealth(), "Original health should remain unchanged");
        assertEquals(40, prototypeWarrior.getCharacterStats().getAtkDamage(), "Original attack damage should remain unchanged");

        assertNotSame(prototypeFireMage.getCharacterStats(), mage.getCharacterStats(), "Stats should be deep copied, not shared");
        assertEquals(100, prototypeFireMage.getCharacterStats().getHealth(), "Original health should remain unchanged");
        assertEquals(50, prototypeFireMage.getCharacterStats().getAtkDamage(), "Original attack damage should remain unchanged");
    }
}
