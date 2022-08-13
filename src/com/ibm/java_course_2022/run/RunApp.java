package com.ibm.java_course_2022.run;

import com.ibm.java_course_2022.calculator.Calculator;
import com.ibm.java_course_2022.calculator.CalculatorTools;

import java.util.Scanner;

/**
 * @author Georgi.Stoev@ibm.com
 * @version 1.0
 * This class is entry point of the our app
 */
public class RunApp {


    public static void main(String []arg){
        Calculator calc = new Calculator();
        CalculatorTools ct = new CalculatorTools(calc);
        ct.runCalculator();

    }


}
