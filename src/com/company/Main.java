package com.company;

public class Main {

    public static void main(String[] args) {
        Week raspisanie = Week.MONDAY;
        switch (raspisanie) {
            case MONDAY:
                System.out.println("Дуйшомбу куну техникалык сабак болот");
                break;
            case TUESDAY:
                System.out.println("Шейшемби куну пратикалык сабак болот");
                break;
            case WEDNESDAY:
                System.out.println("Шаршемби куну англис тил сабагы болот");
                break;
            case THURSDAY:
                System.out.println("Бейшемби куну софт скиллс сабагы болот");
                break;
            case FRIDAY:
                System.out.println("Жума куну экстра сэшн болот");
                break;
            case SATURDAY:
                System.out.println("Ишемби куну кайталоо сабагы болот");
                break;
            case SUNDAY:
                System.out.println("Жекшемби куну дем алуу кун");
        }
    }
}
