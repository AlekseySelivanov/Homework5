package ru.geekbrains.homework5;
import java.util.Scanner;

public class Dog extends Animal {
    Dog() {
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние для бега собаке: ");
        int runDis = sc.nextInt();
        if (runDis <= 500)
            System.out.println("Собака пробежала " + runDis);
        else
            System.out.println("Собака так далеко не побежит");
    }


    void swim() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние для плаванья собаке: ");
        int swimDis = sc.nextInt();
        if (swimDis <= 10)
            System.out.println("Собака проплыла " + swimDis);
        else
            System.out.println("Собака не может так далеко плыть");
    }

    void jump() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту для прыжка собаке (до 0,5 м): ");
        float jumpDis = sc.nextFloat();
        if (jumpDis <= 0.5f)
            System.out.println("Собака подпрыгнула на " + jumpDis);
        else
            System.out.println("Собака не может так высоко подпрыгнуть");
    }
}
