package BuilderPattern;

public class Server {

    // defaults
    private ServerEnvironment environment = ServerEnvironment.DEVELOPMENT;
    private int memory = 4;
    private int cpuCores = 4;
    private boolean hasSecurity = false;
    private boolean hasLogging = false;
    private boolean hasMonitoring = false;

    public void setEnvironment(ServerEnvironment environment) {
        this.environment = environment;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public void setSecurity(boolean hasSecurity) {
        this.hasSecurity = hasSecurity;
    }

    public void setLogging(boolean hasLogging) {
        this.hasLogging = hasLogging;
    }

    public void setMonitoring(boolean hasMonitoring) {
        this.hasMonitoring = hasMonitoring;
    }

    @Override
    public String toString() {
        return "Server [environment=" + environment + ", memory=" + memory + " GB, cpuCores=" + cpuCores +
                ", hasSecurity=" + hasSecurity + ", hasLogging=" + hasLogging + ", hasMonitoring=" + hasMonitoring + "]";
    }
}
