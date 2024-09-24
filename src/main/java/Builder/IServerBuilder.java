package Builder;

public interface IServerBuilder {
    void reset();
    Server build();

    IServerBuilder setEnvironment(ServerEnvironment env);
    IServerBuilder setMemory(int numOfGBRam);
    IServerBuilder setCpuCores(int numOfCore);
    IServerBuilder setSecurity();
    IServerBuilder setLogging();
    IServerBuilder setMonitoring();
}
