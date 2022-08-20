package com.ibm.java_course_2022.calculator;

public class Calculator {
    /**
     * @param operand1
     * @param operand2
     * @return operand1 + operand2
     */


    //OOP - overloading (static polymorphism)
    public Number doSum(Number operand1, Number operand2) {

        if(operand1 instanceof Double){
            return operand1.doubleValue() + operand2.doubleValue();
        }
        else if(operand2 instanceof Double){
            return operand1.doubleValue() + operand2.doubleValue();
        }
       else if (operand1 instanceof Long && operand2 instanceof Long) {
            return operand1.longValue() + operand2.longValue();
        } else if (operand1 instanceof Double && operand2 instanceof Double) {
            return operand1.doubleValue() + operand2.doubleValue();
        }
        throw new RuntimeException("NaN");

    }



    /**
     * @param operand1
     * @param operand2
     * @return
     */
    public Number doMinus(Number operand1, Number operand2) {
        if (operand1 instanceof Long && operand2 instanceof Long) {
            return operand1.longValue() - operand2.longValue();
        } else if (operand1 instanceof Double && operand2 instanceof Double) {
            return operand1.doubleValue() - operand2.doubleValue();
        }
        throw new RuntimeException("NaN");
    }


    /**
     * @param operand1
     * @param operand2
     * @return operand1/operand2
     */
    public Number doDivide(Number operand1, Number operand2) {
        if (operand1 instanceof Long && operand2 instanceof Long) {
            return operand1.longValue() / operand2.longValue();
        } else if (operand1 instanceof Double && operand2 instanceof Double) {
            return operand1.doubleValue() / operand2.doubleValue();
        }
        throw new RuntimeException("NaN");
    }


    /**
     * @param operand1
     * @param operand2
     * @return operand1*operand2
     */
    public Number doMultiply(Number operand1, Number operand2) {
        if (operand1 instanceof Long && operand2 instanceof Long) {
            return operand1.longValue() * operand2.longValue();
        } else if (operand1 instanceof Double && operand2 instanceof Double) {
            return operand1.doubleValue() * operand2.doubleValue();
        }
        throw new RuntimeException("NaN");
    }
}

