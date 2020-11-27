import java.io.DataInputStream; // класс DataInputStream для считывания из потока данные примитивных типов
import java.io.DataOutputStream; // класс DataOutputStream для записи из потока данные примитивных типов
import java.io.IOException; // класс для обработки операций исключений ввода-вывода (завершилась неудачно или прервана)
import java.net.ServerSocket; // класс ServerSocket используется серверными приложениями для получения порта и прослушивания клиентских запросов
import java.net.Socket; // класс представляет собой сокет, который клиент и сервер используют для связи друг с другом
import java.util.Scanner; // класс Scanner используется для получения (считывания) данных введенных пользователем

public class Server {

    public static void main(String[] args) {
        Socket clientSocket = null; // создали объект сокета клиента с пустым значением
        Scanner scanner = new Scanner(System.in); // создаели переменную для считавания с консоли

        try (ServerSocket serverSocket = new ServerSocket(1345)) {  //Создан сервер с портом 1522
            System.out.println("Сервер запущен");

            clientSocket = serverSocket.accept(); // клиенту присваивается порт сервера
            System.out.println("Клиент подключился" + clientSocket.getRemoteSocketAddress()); // возвращение адреса клиентского подключения
            DataInputStream in = new DataInputStream(clientSocket.getInputStream()); // инициализация потока вывода данных от клиента
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream()); // инициализация потока ввода данных от клиента

            /* Поток на чтение */
            Thread threadReader = new Thread(() -> { // открыли поток на чтение
                try { // обернули его в try-catch
                    while (true) {
                        out.writeUTF(scanner.nextLine()); //выводит поток с консоли в кодировке UTF-8
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            threadReader.setDaemon(true); // демонический поток прерывает threadReader ??
            threadReader.start(); // поток threadReader начал работу

            while (true) { // реализация закрытия программы со стороны клиента
                String str = in.readUTF();
                if (str.equals("/close")) {
                    System.out.println("Клиент покинул сервер");
                    out.writeUTF("/close");
                    break;
                } else {
                    System.out.println("Клиент " + str);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}

