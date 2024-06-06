import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkYear(2024);
        checkYear(2020);
        checkYear(2019);
        checkYear(2028);
        checkYear(2017);

        printDeviceVersion(1, 2020);
        printDeviceVersion(0,2024);
        printDeviceVersion(1,2024);

        int deliveryDays = calculateDistance(56);
        if(deliveryDays > 0){
            System.out.println("Количество дней " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(year + " - год является високосным");
        } else {
            System.out.println(year + " - год не является високосным");
        }
    }

    public static void printDeviceVersion(int deviceOS, int deviceYear){
        if (deviceYear < 0) {
            System.out.println("Год не может быть меньше 0!");
        } else {
            int currentYear = LocalDate.now().getYear();
            var type = deviceOS == 1 ? "Android" : "IOS";
            var appType = deviceYear < 2015 ? "облегченную " : "";
            System.out.println("Установите " + appType + " версию для системы " + type);

        }
    }

    public static int calculateDistance (int distance) {
        if(distance > 100) {
            return -1;
        }
        int deliveryDays = 1;
        if(distance > 20){
            deliveryDays++;
        }
        if(distance > 60){
            deliveryDays++;
        }
        return deliveryDays;
    }


}