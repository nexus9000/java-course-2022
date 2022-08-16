package com.ibm.java_course_2022.calculator;

import org.jetbrains.annotations.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTools {
    Calculator calculator;
    //constructor DI
    public CalculatorTools(Calculator calculator){
        this.calculator = calculator;
    }
    public void runCalculator(){
        Scanner sc = new Scanner(System.in);
        doLogic(sc, calculator);
    }

    private void doLogic(@NotNull Scanner sc, Calculator calculator){
        while(true) {
            System.out.println("Choose math operation[type 1 or 2,...] or type [9 for exit]");
            System.out.println("1.Multiply" +"\n" +"2.Divide" +
                    "\n"+"3.Sum"+"\n"+ "4.Minus");
            try {
                int choice = sc.nextInt();//choice entered by user
                if (choice == 9) {
                    System.out.println("Program was finished!");
                    return;
                }
                System.out.println("Enter a first operand!");
                int operand1 = sc.nextInt();
                System.out.println("Enter a second operand!");
                int operand2 = sc.nextInt();

            long result  = 0L;
            switch (choice) {
                case 1: {
                    result = calculator.doMultiply(operand1, operand2);
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    result = calculator.doSum(operand1, operand2);
                    break;
                }
                case 4:
                    break;

                default: {
                    System.out.println("Undefined operation");
                }
            }//end switch
             System.out.printf("%s %d %n", "result of operation is:", result);
            }catch(InputMismatchException ime){
                System.err.println("You didn't enter a number");
                System.exit(0x57);
                //test
                //test2
            }
        }//end while
    }

}
