import Bridge.AdvancedRemote;
import Bridge.Remote;
import Bridge.TV;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {
    @Test
    void testTVIsEnabled() {
        TV tv = new TV();
        assertFalse(tv.isEnabled());
        tv.enable();
        assertTrue(tv.isEnabled());
        tv.disable();
        assertFalse(tv.isEnabled());
    }

    @Test
    void testTVSetChannel() {
        TV tv = new TV();
        tv.setChannel(10);
        assertEquals(10, tv.getChannel());
    }

    @Test
    void testTVSetVolume() {
        TV tv = new TV();
        tv.setVolume(30);
        assertEquals(30, tv.getVolume());
    }

    @Test
    void testRemoteTogglePower() {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        assertFalse(tv.isEnabled());
        remote.togglePower();
        assertTrue(tv.isEnabled());
        remote.togglePower();
        assertFalse(tv.isEnabled());
    }

    @Test
    void testRemoteVolumeUp() {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        remote.volumeUp();
        assertEquals(55, tv.getVolume());

        remote.volumeUp();
        assertEquals(60, tv.getVolume());
    }

    @Test
    void testRemoteVolumeDown() {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        remote.volumeDown();
        assertEquals(45, tv.getVolume());

        remote.volumeDown();
        assertEquals(40, tv.getVolume());
    }

    @Test
    void testRemoteChannelUp() {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        tv.setChannel(50);
        remote.channelUp();
        assertEquals(51, tv.getChannel());
    }

    @Test
    void testRemoteChannelDown() {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        tv.setChannel(1);
        remote.channelDown();
        assertEquals(0, tv.getChannel());

        remote.channelDown();
        assertEquals(100, tv.getChannel());
    }

    @Test
    void testAdvancedRemoteMute() {
        TV tv = new TV();
        AdvancedRemote remote = new AdvancedRemote(tv);

        tv.setVolume(30);
        remote.mute();
        assertEquals(0, tv.getVolume());
    }

    @Test
    void testAdvancedRemoteUnMute() {
        TV tv = new TV();
        AdvancedRemote remote = new AdvancedRemote(tv);

        tv.setVolume(30);
        remote.mute();
        remote.unMute();
        assertEquals(30, tv.getVolume());
    }
}
