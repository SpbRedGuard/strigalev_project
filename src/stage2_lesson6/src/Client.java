import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 1345;

    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);

        try {
              socket = new Socket(SERVER_ADDRESS, SERVER_PORT); // клиент получает адрес сервера и порт
            System.out.println("Подключен к серверу " + socket.getRemoteSocketAddress());
            DataInputStream in = new DataInputStream(socket.getInputStream()); // инициализация потока вывода данных от сервера
            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // инициализация потока вывода данных от сервера



            // Поток на чтение
            Thread threadReader = new Thread(() -> {
                try {
                    while (true) {
                        out.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            threadReader.setDaemon(true);
            threadReader.start();

            while (true) {
                String str = in.readUTF();
                if (str.equals("/close")) {
                    System.out.println("Потеряно соединение с сервером");
                    out.writeUTF("/close");
                    break;
                } else {
                    System.out.println("Сервер " + str);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

}
