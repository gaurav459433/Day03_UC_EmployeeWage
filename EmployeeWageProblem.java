package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        int a = random.nextInt(2);
        if(a == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }

}
