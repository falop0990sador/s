package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] jobs = new String[3];
        jobs[0] = "pilot";
        jobs[1] = "rogrammer";
        jobs[2] = "ENGINEER";

        int[] salary = new int[3];
        salary[0] = 500;
        salary[1] = 600;
        salary[2] = 650;
        //списка строки
        List<Integer> names = new ArrayList<>();
        names.add(12);
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.nextLine();
        switch (name) {
            case "alisher":
                System.out.println("salom Alisher");
                break;
            case "oybek":
                System.out.println("salom oybek");
                break;
            case "yusuf":
            System.out.println("salom yusuf");
            break;
            default:
                System.out.println("tanimadim");
        }
        if (name == "alisher"){
            System.out.println("salom alisher");
        }else{

        }

    }
}
