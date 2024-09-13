package BuilderPattern;

public enum ServerEnvironment {
    PRODUCTION("Production"),
    TESTING("Testing"),
    DEVELOPMENT("Development");

    private final String environmentName;

    ServerEnvironment(String environmentName) {
        this.environmentName = environmentName;
    }

    @Override
    public String toString() {
        return environmentName;
    }
}
