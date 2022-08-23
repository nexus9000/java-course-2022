package com.ibm.javacourse2022.run.calculator;





import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTools {
    Calculator calculator;
    //constructor DI
    public CalculatorTools(Calculator calculator){
        this.calculator = calculator;
    }
    public void runCalculator(){

        doLogic(calculator);
    }

    private void doLogic(Calculator calculator){
        Number operand1, operand2;
        Scanner sc = new Scanner(System.in);

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
                 operand1 = readInput(sc);
                System.out.println("Enter a second operand!");
                operand2 = readInput(sc);

            Number result  = 0L;
            switch (choice) {
                case 1: {
                    result = calculator.doMultiply(operand1, operand2);
                    break;
                }
                case 2: {
                    result = calculator.doDivide(operand1, operand2);
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
             //System.out.printf("%s %d %n", "result of operation is:", result);
             System.out.println("result of operation is: "+result);
            }catch(InputMismatchException ime){
                System.err.println("You didn't enter a number");
                sc = new Scanner(System.in);
                //System.exit(0x57);

            }
        }//end while
    }

    public Number readInput( Scanner sc){
        try {
            long result = sc.nextLong();
            return result;
        }catch (InputMismatchException ime){
            double result = sc.nextDouble();
            return result;
        }
    }


}
