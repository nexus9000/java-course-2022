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
    //OOP - overloading (static polymorphism)
    public Number doSum (Number operand1, Number operand2){
       if(operand1 instanceof Long && operand2 instanceof Long){
           return operand1.longValue() + operand2.longValue();
       }else if(operand1 instanceof Double && operand2 instanceof Double){
           return operand1.doubleValue() + operand2.doubleValue();
       }
           throw new RuntimeException("NaN");

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
