package ru.geekbrains.homework5;
import java.util.Scanner;

public class Cat extends Animal {
    Cat() {
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние для бега коту: ");
        int runDis = sc.nextInt();
        if (runDis <= 200)
            System.out.println("Кот пробежал " + runDis);
        else
            System.out.println("Кот так далеко не побежит");
    }

    void jump() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту для прыжка коту: ");
        int jumpDis = sc.nextInt();
        if (jumpDis <= 2)
            System.out.println("Кот подпрыгнул на " + jumpDis);
        else
            System.out.println("Кот не может так высоко подпрыгнуть");
        sc.close();

    }
}
