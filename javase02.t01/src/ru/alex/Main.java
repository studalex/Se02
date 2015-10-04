package ru.alex;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen(10, Color.RED);
        Pen pen2 = new Pen(10, Color.RED);
        Pen pen3 = new Pen(10, Color.RED);

        System.out.println("Транзетивность:");
        System.out.println("pen1.equals(pen3) = " + pen1.equals(pen3));
        System.out.println("pen2.equals(pen3) = " + pen2.equals(pen3));
        System.out.println("pen1.equals(pen2) = " + pen1.equals(pen2));
        System.out.println();

        System.out.println("Симметричность:");
        System.out.println("pen1.equals(pen2) = " + pen1.equals(pen2));
        System.out.println("pen2.equals(pen1) = " + pen2.equals(pen1));
        System.out.println();

        System.out.println("Рефлексивность:");
        System.out.println("pen1.equals(pen1): " + pen1.equals(pen1));
        System.out.println();

        System.out.println("Ненулевая ссылка:");
        System.out.println("pen1.equals(null) = " + pen1.equals(null));
        System.out.println();

        System.out.println("pen1.hashCode(): " + pen1.hashCode());
        System.out.println("pen2.hashCode(): " + pen2.hashCode());
        pen2.setCost(15);
        System.out.println("pen1.hashCode():  " + pen1.hashCode());
        System.out.println("pen2.hashCode():  " + pen2.hashCode());
        System.out.println();

        System.out.println("Pen to String: " + pen1.toString());
    }
}
