package com.ibm.java_course_2022.run;

import java.util.Scanner;

/**
 * @author Georgi.Stoev@ibm.com
 * @version 1.0
 * This class is entry point of the our app
 */
public class RunApp {
//primitive type varibles
public static int result = 1_000_000;//32bits variable for result global global and static 2^32 -2 0000 0 +2 00000
public static long op5; //64bits 2^64
public static byte op1 = -128;// 2^8  -128 0 +127   primitive
public static short op2; //2^16 0-65535 16bits
public static float op3 = 0.33F;//32bits floating point 0.3333
public static double op4 = 0.44;//64bits floating point
public static char op6 = 'C'; //16bits 0-65535 ' '
public static boolean op7 = true;//true or false

public String literal ;//non-static " "

    public static void main(String []arg){
        System.out.println("Please, enter first operand:");
        Scanner sc = new Scanner(System.in);
        int operand1 = sc.nextInt();//operand1 is a local variable
        System.out.println("Please, enter second operand:");
        int operand2 = sc.nextInt();//operand1 is a local variable
        result = doSum(operand1, operand2);
        System.out.println("Result of the sum is: "+result);

    }

    /**
     *
     * @param operand1
     * @param operand2
     * @return operand1 + operand2
     */
    public static int doSum(int operand1, int operand2){
        return operand1 + operand2;
    }

    /**
     *
     * @param operand1
     * @param operand2
     * @return
     */
    public static int doMinus(int operand1, int operand2){
        return operand1 - operand2;
    }
}
