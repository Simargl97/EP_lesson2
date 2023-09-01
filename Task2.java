
import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите строку: ");
            String userInput = scanner.nextLine();

            try {
                if (userInput.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя");
                }

                // Далее можно продолжать работу с введенной строкой, если она не пустая
                System.out.println("Вы ввели: " + userInput);
            } catch (Exception e) {
                System.err.println("Ошибка: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }

