import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string = new String[5];
        for(int i=0; i<5; i++){
            string[i] = scanner.nextLine();
        }
        for(int i=0; i<5; i++) {
            System.out.print("Длина строки № " + i + " (\"" + string[i] + "\"): ");
            try {
                if (string[i].isEmpty()) throw new NullPointerException("Введена пустая строка!");
                System.out.println(string[i].length());
            }
            catch (NullPointerException e) {
                System.out.println("Ошибка! " + e.getMessage());
            }
            finally {
                System.out.println("Обработка строки завершена\n");
            }
        }
        int number = 0;
        while(true){
            System.out.print("Введите номер строки для вывода или нажмите Enter для выхода из программы: ");
            String stringNumber = scanner.nextLine();

            try {
                number = Integer.parseInt(stringNumber);
            }
            catch (NumberFormatException e){
                System.exit(0);
            }

            try {
                System.out.println("Строка № " + number + ": \"" + string[number] + "\".");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Ошибка! " + e.getMessage());
            }
            finally {
                System.out.println("Вывод строки завершён.\n");
            }
        }
    }
}