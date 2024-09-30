package Bridge;

public class TV implements Device {
    boolean enabled = false;
    int channel = 0;
    int volume = 50;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setVolume(int percentage) {
        this.volume = percentage;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
