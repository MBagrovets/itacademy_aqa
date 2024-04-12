package Lecture8HT.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// написала отдельно 3 Main метода, для того, чтобы видеть 3 разных варианта использования Exceptions

// 1. Создайте класс-исключение и наследуйте RuntimeException.
// Выбросьте исключение при помощи throw и убедитесь что приложение упадет

/*public class MainFileReader {
    class ThrowTryCatch extends RuntimeException {
        public void main(String[] args) throws RuntimeException {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                int x = Integer.parseInt(scanner.nextLine());
                if (x != 0) {
                    throw new RuntimeException();
                }
            }
        }
    }
}*/

// 2. Поменяйте родительский класс с RuntimeException на Exception
// для класса-исключения и обработайте исключение в try-catch

/*public class MainFileReader {
class ThrowTryCatch extends Exception {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Это не ноль");
                }
            }
        }
    }
}}*/

//3. Добавьте в try строку FileReader fileReader = new FileReader("любой пусть");
//И добавьте второй блок catch для обработки FileNotFoundException

public class MainFileReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/main/java/Lecture8HT/Exceptions/fileForExceptions1.txt");
            Scanner scanner = new Scanner(fileReader);
        } catch (FileNotFoundException e) {   //если файла нет
            //e.printStackTrace();  вывод дефолтного сообщения об ошибке - stack trace
            System.out.println("File is not found");
        }
        System.out.println("Код после блока исключений");
    }
}




