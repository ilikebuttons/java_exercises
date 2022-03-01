package com.teksystems;

public class JavaArrays {
    // Write a program that creates an array of integers with a length of 3.
    // Assign the values 1, 2, and 3 to the indexes.
    // Print out each array element.
        /*int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
            System.out.println(ints[i]);
        }*/

    // Write a program that returns the middle element in an array.
    // Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        /*int[] ints = {13, 5, 7, 68, 2};
        int half = (int)(ints.length / 2);
        System.out.println(ints[half]);*/

    // Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
    // Print out the array length. Make a copy using the clone( ) method.
    // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
        /*String[] strings = {"red", "green", "blue", "yellow"};
        System.out.println(strings.length);
        String[] stringsClone = strings.clone();
        System.out.println(Arrays.toString(stringsClone));*/

    // Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.
    // Print out the value at the first index and the last index using length - 1 as the index.
    // Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
    // Notice the type of exception which is produced. Now try to assign a value to the array index 5.
    // You should get the same type of exception.
        /*int[] ints = {6, 55, 3, 2, 1};
        System.out.println("first index: " + ints[0] + ", last index: " + ints[ints.length - 1]);
        //System.out.println("last index: " + ints[ints.length]); // index out of bounds
        //ints[5] = 3; // index out of bounds*/

    // Write a program where you create an integer array with a length of 5.
    // Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
        /*int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        System.out.println(Arrays.toString(ints));*/

    // Write a program where you create an integer array of 5 numbers.
    // Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
        /*int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * 2;
        }
        System.out.println(Arrays.toString(ints));*/

    // Write a program where you create an array of 5 elements.
    // Loop through the array and print the value of each element, except for the middle (index 2) element.
        /*int[] ints = {1, 2, 3, 4, 5};
        for (int i = 0; i < ints.length; i++) {
            if (i == (int)(ints.length / 2))
                continue;
            System.out.println(i);
        }*/

    // Write a program that creates a String array of 5 elements and swaps the first element with the middle
    // element without creating a new array.
        /*String[] strings = {"this", "is", "a", "string", "array"};
        int half = (int)(strings.length / 2);
        String temp = strings[0];
        strings[0] = strings[half];
        strings[half] = temp;
        System.out.println(Arrays.toString(strings));*/

    // Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
    // Print the array in ascending order, print the smallest and the largest element of the array.
    // The output will look like the following:
    //   -Array in ascending order: 0, 1, 2, 4, 9, 13
    //   -The smallest number is 0
    //   -The biggest number is 13
        /*int[] ints = {4, 2, 9, 13, 1, 0};
        int temp = 0;
        int highest = ints[0];
        int lowest = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > highest) {
                highest = ints[i];
                continue;
            }
            if (ints[i] < lowest) {
                lowest = ints[i];
            }
        }
        System.out.println("Array in ascending order: " + Arrays.toString(Arrays.stream(ints).sorted().toArray()));
        System.out.println("The smallest number is " + lowest);
        System.out.println("The biggest number is " + highest);*/

    // Create an array that includes an integer, 3 strings, and 1 double.
    // Print the array.
        /*Object[] mixed = {1, "one", "two", "three", 1.2534};
        for (Object item:mixed) {
            System.out.println(item.toString());
        }*/
}
