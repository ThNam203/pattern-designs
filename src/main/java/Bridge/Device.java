package Bridge;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    void setChannel(int channel);
    int getChannel();
    void setVolume(int percentage);
    int getVolume();
}
