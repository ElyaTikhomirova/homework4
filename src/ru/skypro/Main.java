package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1

        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");

        }

        System.out.println();
        int i = 10;
        for (i = 10; i>=1; i--){
            System.out.print(i + " ");
        }

        // Задание 2

        System.out.println();
        for (int friday = 6; friday<=30; friday = friday + 7){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        // Задание 3

        System.out.println();
        int start = 1822;
        int end = 2122;
        for (int comet = 0; comet <= end; comet = comet + 79){
            if (comet >= start)
            System.out.println(comet);

        }


    }
}
