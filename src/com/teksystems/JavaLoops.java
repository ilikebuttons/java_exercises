package com.teksystems;

public class JavaLoops {
    // 1.)
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/

    // 2.)
        /*int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i += 10;
        }*/

    // 3.)
        /*int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);*/

    // 5.)
        /*for (int i = 1; i <= 100; i++) {
            if (i > 25 && i < 75) continue;
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }*/

    // 6.)
        /*for (int week = 1; week <= 2; week++) {
            System.out.println("Week " + week + ":\n");
            for (int day = 1; day <= 5; day++) {
                System.out.println("Day " + day + "\n");
            }
        }*/

    // 7.)
        /*for (int i = 10; i <= 200; i++) {
            String test = Integer.toString(i);
            int left = 0;
            int right = test.length() - 1;
            boolean isPal = true;
            while (isPal) {
                if (test.charAt(left) != test.charAt(right)) {
                    isPal = false;
                }
                left++;
                right--;
                if (right <= left) {
                    break;
                }
            }
            if (isPal) {
                System.out.print(i + ", ");
            }
        }*/

    // 8.)
        /*
        // Print Fibonacci values until value is reached
        int left = 0;
        int right = 1;
        int next;
        while (right < 50) {
            System.out.print(left + ", ");
            next = left + right;
            left = right;
            right = next;
        }
        System.out.print(left);*/
        /*
        // Modified to print n number of iterations
        int i = 0;
        int left = 0;
        int right = 1;
        int next;
        while (i < 15) {
            System.out.print(left + ", ");
            next = left + right;
            left = right;
            right = next;
            i++;
        }
        System.out.print(left);
        */

    // 9.)
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
        }*/
}
