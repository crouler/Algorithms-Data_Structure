package com.company;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String tmp;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Введите строку символов: ");
            tmp = sc.nextLine();

           if (tmp.length()!=0) break;
        }

        Dequeue deq = new Dequeue(tmp.length());

        for (int i = 0; i < tmp.length(); i++) {
            deq.pushFront(tmp.charAt(i));
        }

        System.out.println("Перевернутая строка:  ");
        deq.print();

















    }
}
