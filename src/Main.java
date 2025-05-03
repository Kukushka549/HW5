public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        byte clientOS = 1;
        short clientDeviceYear = 2013;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        int year = 2021;

        if (year < 1584) {
            System.out.println("В то время високосный год ещё не придумали.");
        }else if ((year %4 == 0 && year %100 !=0)||year %400 == 0){
            System.out.println("Это високосный год");
        }else System.out.println("Это невисокосный год");

        byte deliveryDistance = 95;
        byte deliveryDays = 1;

        if (deliveryDistance > 0) {
            if (deliveryDistance > 100) {
                System.out.println("Вне зоны доставки.");
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + (deliveryDays + 2));
            }
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + (deliveryDays + 1));
            }
            if (deliveryDistance <= 20 && deliveryDistance > 0) {
                System.out.println("Потребуется дней: " + deliveryDays);
            }
        }else {System.out.println("Некорректное число");}

        byte monthNumber = 5;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Это зимний месяц.");
                break;
            case 3, 4, 5:
                System.out.println("Это весенний месяц.");
                break;
            case 6, 7, 8:
                System.out.println("Это летний месяц.");
                break;
            case 9, 10, 11:
                System.out.println("Это осенний месяц.");
                break;
            default:
                System.out.println("Не понимаю какой это месяц... Введите число из промежутка 1-12");
        }
    }

}