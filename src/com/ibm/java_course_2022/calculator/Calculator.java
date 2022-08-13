package com.ibm.java_course_2022.calculator;

public class Calculator {
    /**
     *
     * @param operand1
     * @param operand2
     * @return operand1 + operand2
     */
    public int doSum(int operand1, int operand2){
        return operand1 + operand2;
    }

    /**
     *
     * @param operand1
     * @param operand2
     * @return
     */
    public int doMinus(int operand1, int operand2){
        return operand1 - operand2;
    }

    /**
     *
     * @param operand1
     * @param operand2
     * @return operand1/operand2
     */
    public int doDivide(int operand1, int operand2){
        return operand1/operand2;
    }

    /**
     *
     * @param operand1
     * @param operand2
     * @return operand1*operand2
     */
    public int doMultiply(int operand1, int operand2){
        return operand1*operand2;
    }
}
