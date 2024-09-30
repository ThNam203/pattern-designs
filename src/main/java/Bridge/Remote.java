package Bridge;

public class Remote {
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) device.disable();
        else device.enable();
    }

    public void volumeDown() {
        int volume = device.getVolume() > 5 ? device.getVolume() - 5 : 0;
        device.setVolume(volume);
    }

    public void volumeUp() {
        int volume = device.getVolume() < 95 ? device.getVolume() + 5 : 100;
        device.setVolume(volume);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1 % 101);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() == 0 ? 100 : device.getChannel() - 1);
    }
}
