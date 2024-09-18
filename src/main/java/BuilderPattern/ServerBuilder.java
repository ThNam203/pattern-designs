package BuilderPattern;

public class ServerBuilder implements IServerBuilder {
    Server server = new Server();
    @Override
    public void reset() {
        server = new Server();
    }
    @Override
    public Server build() {
        return this.server;
    }
    @Override
    public IServerBuilder setEnvironment(ServerEnvironment env) {
        this.server.setEnvironment(env);
        return this;
    }
    @Override
    public IServerBuilder setMemory(int numOfGBRam) {
        this.server.setMemory(numOfGBRam);
        return this;
    }
    @Override
    public IServerBuilder setCpuCores(int numOfCore) {
        this.server.setCpuCores(numOfCore);
        return this;
    }
    @Override
    public IServerBuilder setSecurity() {
        this.server.setSecurity(true);
        return this;
    }
    @Override
    public IServerBuilder setLogging() {
        this.server.setLogging(true);
        return this;
    }
    @Override
    public IServerBuilder setMonitoring() {
        this.server.setMonitoring(true);
        return this;
    }
}
