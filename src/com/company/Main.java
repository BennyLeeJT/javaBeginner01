package com.company;

//delete line shortcut key is ctrl shift \

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        int age = 30;
//        age = 35;
//        System.out.println("Hello Mars");
//        System.out.println("age is now : " + age);

//        byte age = 30;
//        Date now = new Date();

//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println("x is " + x);
//        System.out.println("y is " + y);

//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println("point2 is " + point2);
//        System.out.println("point1 is " + point1);

//        String message = new String("Hello Mars"); // this is redundant because there is a shorter way to initialize string literal
//        String message = "Hello Mars";
            String message = "Hello Mars" + "!!";
//        message.endsWith();
            System.out.println(message.endsWith("!!")); // returns boolean
            System.out.println(message.startsWith("!!")); // returns boolean
            System.out.println(message.length()); // returns length good to check when needed
            System.out.println(message.indexOf("M")); // returns the index starting from 0
            System.out.println(message.indexOf("Saturn")); // if put in something it doesnt have, it returns -1


//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        System.out.println(numbers); // if you do this, it will print the memory address, not the value of the numbers array
//        System.out.println(Arrays.toString(numbers));

//        this is the long way

        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println("numbers.length = " + numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        sorting an array
        int[] numbers2 = {5, 4, 2, 1, 3};
        System.out.println("numbers2 before sorted ascending = " + numbers2); // this prints the memory address, not the value
        System.out.println("numbers2 before sorted ascending & after converted to string = " + Arrays.toString(numbers2)); // this prints the value after string conversion

        Arrays.sort(numbers2);
        System.out.println("numbers2 after sorted ascending & after converted to string = " + Arrays.toString(numbers2)); // this prints the memory address, not the value

//        multi dimensional array, put more square brackets
        int[][] numbersMatrix = new int[2][3];
        numbersMatrix[0][0] = 1; // initialize 1st row zeroth index, 1st column to 1 zeroth index

        System.out.println(Arrays.toString(numbersMatrix)); // can't use this as it will print the addresses of the rows and columns
//        for multi dimensional array have to use another method
        System.out.println(Arrays.deepToString(numbersMatrix));
//        this is long way to create
        int[][] numbersMatrix2 = { {1, 2, 3,}, {4, 5, 6} };
//        short way

//        can also go 3 dimensional
        int[][][] numbersMatrix3 = new int[2][3][5];
        System.out.println(Arrays.deepToString(numbersMatrix2));

//        int x = 1;
//        int y = 2;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);

//        int x = 1;
//        int y = x++; // ++ as SUFFIX means x will be copied to y FIRST, then increment.
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);

        int x = 1;
        int y = ++x; // ++ as PREFIX means x will be increased FIRST, then copied to y.
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
