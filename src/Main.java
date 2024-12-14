import java.time.LocalDate;

public class Main {

    public static int printTask(int taskNumber) {
        taskNumber += 1;

        System.out.println();
        System.out.println("Task number " + taskNumber);
        System.out.println();
        return taskNumber;
    }

    public static boolean leapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void determinantOS(int clientOS, int currentYear) {

        if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS");
        }
        if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android");
        }
        if (clientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для IOS");
        }
        if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для Android");
        }
    }

    public static int calculateDaysDelivery(int distance) {
        int notDeliveri = 0;
        if (distance <= 20) {
            return 1;
        }
        if (distance >= 20 && distance <= 60) {
            return 2;
        }
        if (distance >= 60 && distance <= 100) {
            return 3;
        } else {
            return notDeliveri;
        }
    }

    public static void main(String[] args) {
        printTask(0);

        int year = 2012;
        if (leapYear(year)) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - невисокосный");
        }

        printTask(1);

        int currentYear = LocalDate.now().getYear();
        determinantOS(0, currentYear);

        printTask(2);

        int deliveryDays = calculateDaysDelivery(73);
        if (deliveryDays != 0) {
            System.out.println("Доставка займет " + deliveryDays + " деня (день)");
        } else {
            System.out.println("Доставки нет");
        }
    }
}