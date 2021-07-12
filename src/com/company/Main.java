package com.company;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Candidate> users = new TreeSet<Candidate>(Comparator.comparing(u -> u.getResumeRelevance(),Comparator.reverseOrder()));


        while(true) {
            System.out.println("Введите информацию о кандидате (для завершения введите пустую строку):\n" +
                    "  Фамилия Имя Отчество, пол, возраст, релевантность резюме, рейтинг:\n");
            String name = sc.next();
            String floor = sc.next();
            String age = sc.next();
            String resumeRelevance = sc.next();
            Integer rating = sc.nextInt();


            Candidate cn = new Candidate(name, floor, age, resumeRelevance, rating);
            users.add(cn);


            System.out.println("Если хотите закончить ввод данных, введите end (для продолжения введите любую клавишу)");
            String input = sc.next();
            if ("end".equals(input))
                break;
            {
            }

        }
        System.out.println(users);

    }
}
