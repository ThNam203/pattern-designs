import Server;
import ServerBuilder;
import ServerDirector;
import ServerEnvironment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Builder {
    private ServerBuilder builder;
    private Server server;

    @BeforeEach
    void setUp() {
        builder = Mockito.mock(ServerBuilder.class);
        server = new Server();

        when(builder.setEnvironment(any(ServerEnvironment.class))).thenReturn(builder);
        when(builder.setCpuCores(anyInt())).thenReturn(builder);
        when(builder.setMemory(anyInt())).thenReturn(builder);
        when(builder.setLogging()).thenReturn(builder);
        when(builder.setSecurity()).thenReturn(builder);
        when(builder.setMonitoring()).thenReturn(builder);
        when(builder.build()).thenReturn(server);
    }

    @Test
    public void testProductionServer() {
        Server result = ServerDirector.ProductionServer(builder);

        verify(builder).reset();
        verify(builder).setEnvironment(ServerEnvironment.PRODUCTION);
        verify(builder).setCpuCores(64);
        verify(builder).setMemory(128);
        verify(builder).setLogging();
        verify(builder).setSecurity();
        verify(builder).setMonitoring();
        verify(builder).build();

        assertEquals(server, result);
    }

    @Test
    void testTestServer() {
        Server result = ServerDirector.TestServer(builder);

        verify(builder).reset();
        verify(builder).setEnvironment(ServerEnvironment.TESTING);
        verify(builder).setCpuCores(32);
        verify(builder).setMemory(64);
        verify(builder).setLogging();
        verify(builder).setMonitoring();
        verify(builder).build();

        assertEquals(server, result);
    }

    @Test
    void testDevelopmentServer() {
        Server result = ServerDirector.DevelopmentServer(builder);

        verify(builder).reset();
        verify(builder).setEnvironment(ServerEnvironment.TESTING);
        verify(builder).setCpuCores(16);
        verify(builder).setMemory(32);
        verify(builder).setLogging();
        verify(builder).build();

        assertEquals(server, result);
    }
}
