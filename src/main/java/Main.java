import javax.sound.sampled.Port;
import java.io.*;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    private static final int PORT = 9090;
    public static void main(String[] args) {
        Server server = new Server();

        server.listen(PORT);    }

}