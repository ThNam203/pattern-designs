package BuilderPattern;

public class ServerDirector {
    public static Server ProductionServer(ServerBuilder builder) {
        builder.reset();

        return builder
                .setEnvironment(ServerEnvironment.PRODUCTION)
                .setCpuCores(64)
                .setMemory(128)
                .setLogging()
                .setSecurity()
                .setMonitoring()
                .build();
    }

    public static Server TestServer(ServerBuilder builder) {
        builder.reset();

        return builder
                .setEnvironment(ServerEnvironment.TESTING)
                .setCpuCores(32)
                .setMemory(64)
                .setLogging()
                .setMonitoring()
                .build();
    }

    public static Server DevelopmentServer(ServerBuilder builder) {
        builder.reset();

        return builder
                .setEnvironment(ServerEnvironment.TESTING)
                .setCpuCores(16)
                .setMemory(32)
                .setLogging()
                .build();
    }
}
