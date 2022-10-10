public class Main {
    public static void main(String[] args) {
        //Домашнее задание 6
        System.out.println("Домашнее задание 6");
        { //Задача 1
            System.out.println("Задача 1");
            int clientOS = 1;
            int deviceYear = 2020;
            if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке");
            else System.out.println("Установите версию приложения для Android по ссылке");
        }
        { //Задача 2
            System.out.println("Задача 2");
            int clientOS = 0;
            int deviceYear = 2020;
            if (clientOS == 0 && deviceYear >= 2015) {System.out.println("Установите версию приложения для iOS по ссылке");
            }else if (clientOS == 0 && deviceYear < 2015) {System.out.println("Установите облегчённую версию приложения для iOS по ссылке ");
            }
            if (clientOS == 1 && deviceYear >= 2015) {System.out.println("Установите версию приложения для Андроид по ссылке");
            }else if (clientOS == 1 && deviceYear < 2015) {
                System.out.println("Установите облегчённую версию приложения для Андроид по ссылке ");
            }
        }
        { //Задача 3
            System.out.println("Задача 3");
            int year = 2021;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {System.out.println(year + " является високосным");
            }else {System.out.println(year + " не является високосным");
            }
        }
        { //Задача 4
            System.out.println("Задача 4");
            int deliveryDistance = 95;
            int deliveryDay = 1;
            if (deliveryDistance > 20) {deliveryDay ++;
            }
            if (deliveryDistance > 60) {deliveryDay++;
            }
            System.out.println("Потребуется дней: "+ deliveryDay);
        }
        { //Задача 5
            System.out.println("Задача 5");
            int monthNumber = 13;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Месяц "+ monthNumber +" принадлежит к сезону зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц "+ monthNumber +" принадлежит к сезону весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц "+ monthNumber +" принадлежит к сезону лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц "+ monthNumber +" принадлежит к сезону осень.");
                    break;
                default:
                    System.out.println(monthNumber +" - нет такого месяца");
            }
        }
    }
}