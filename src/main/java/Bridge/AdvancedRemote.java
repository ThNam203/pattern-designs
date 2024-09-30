package Bridge;

import java.util.Objects;

public class AdvancedRemote extends Remote {
    Integer beforeMuteVolume = null;

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        if (device.getVolume() == 0) return;
        this.beforeMuteVolume = device.getVolume();
        device.setVolume(0);
    }

    public void unMute() {
        if (device.getVolume() > 0) return;
        device.setVolume(Objects.requireNonNullElse(this.beforeMuteVolume, 5));
    }
}
