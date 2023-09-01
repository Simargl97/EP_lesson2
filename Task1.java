import java.util.Scanner;

public class Task1 {
    public static float getFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float userInput = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число (типа float): ");

            if (scanner.hasNextFloat()) {
                userInput = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
                scanner.nextLine(); // Очищаем буфер ввода
            }
        }

        scanner.close();
        return userInput;
    }

    public static void main(String[] args) {
        float floatValue = getFloatFromUser();
        System.out.println("Вы ввели: " + floatValue);
    }
}
