package com.ibm.javacourse2022.run;

import com.ibm.javacourse2022.run.calculator.CalculatorTools;
import org.apache.log4j.Logger;

public class RunApp {
    final static Logger logger = Logger.getLogger(RunApp.class);
    public static void main(String...arg){
         CalculatorTools ct = new CalculatorTools();
         logger.info("Calculator was started");
         ct.runCalculator();
         logger.info("Application was stopped!");
    }
}
