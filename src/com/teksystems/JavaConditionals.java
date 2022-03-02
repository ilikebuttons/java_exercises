package com.teksystems;

public class JavaConditionals {
    // 1.)
        /*int i = 7;
        i = 15;
        if (i < 10) {
            System.out.println("Less than 10");
        }*/

    // 2.)
        /*int x = 7;
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }*/

    // 3.)
        /*int x = 15;
        x = 50;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }*/

    // 4.)
        /*int x = 15;
        x = 5;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }*/

    // 5. & 6.)
        /*System.out.print("Enter a score: ");
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.next());
        if (grade > 100 || grade < 0) {
            System.out.println("Score out of range.");
        } else if (grade > 90) {
            System.out.println("A");
        } else if (grade > 80) {
            System.out.println("B");
        } else if (grade > 70) {
            System.out.println("C");
        } else if (grade > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }*/

    // 7.)
        /*System.out.print("Enter a value from 1-7: ");
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.next());
        switch (i) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Out of range");
        }*/
}
