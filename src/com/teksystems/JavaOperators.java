package com.teksystems;

public class JavaOperators {
    // 1.)
        /*int[] ints = {1, 8, 33, 78, 787, 33987};
        for (int i : ints) {
            System.out.println(Integer.toBinaryString(i));
        }*/

    // 2.)
        /*String[] bytes = {"0010", "1001", "00110100", "01110010", "001000011111", "001011000110011"};
        for (String b : bytes) {
            b = b.replaceFirst("^0+", "");
            System.out.println(b);
            char[] chars = b.toCharArray();
            int result = 0;
            for (int i = 0; i < chars.length; i++) {
                result += chars[i] == '1' ? Math.pow((double)2, i) : 0;
            }
            System.out.println(result);
        }*/

    // 3.)
        /*String[] strings = {"2", "9", "17", "88"};
        for (String s : strings) {
            System.out.println("Before bit shift: " + s);
            int i = Integer.parseInt(s, 2);

        }*/

    // 4.)
        /*int[] ints = {150, 225, 1555, 32456};
        for (int i : ints) {
            System.out.println(Integer.toBinaryString(i));
            byte b = Integer.toBinary(i);
        }*/

    // 10010110
    // 0010010110

    // 11100001
    // 0011100001

    // 11000010011
    // 0011000010011

    // 111111011001000
    // 00111111011001000



    // 5.)
        /*
        int x1 = 7;                  // 00111
        int y1 = 17;                 // 10001
        int z1 = x1 & y1;            // 00001 = 1
        System.out.println(z1);

        int x2 = 7;                  // 00111
        int y2 = 17;                 // 10001
        int z2 = x2 | y2;            // 10111 = 23
        System.out.println(z2);
*/

    // 6.)
        /*int i = 2;
        System.out.println("Before: " + i);
        i++;
        System.out.println("After: " + i);*/

    // 7.)
        /*int i = 2;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);*/

    // 8.)
        /*int x = 5;
        int y = 8;
        // int sum = ++x + y;
        int sum = x++ + y;
        System.out.println(sum);*/

}
