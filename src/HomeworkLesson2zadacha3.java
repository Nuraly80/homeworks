import java.util.Scanner;

public class HomeworkLesson2zadacha3 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = text.nextInt();


        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Високосный год. Количество дней: 366");
        } else {
            System.out.println("Обычный год. Количество дней: 365");
        }
    }
}
