package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }




    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        }); 
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                    standardCalculator.subtract(-Double.MAX_VALUE,Double.MAX_VALUE);
                }
        });
    }
    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationOperation(){
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        });  
    }

    @Test
    @DisplayName("Test Division of Two Integers")
    void testDivisionOperation(){
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        }); 
    }

    @Test

   @DisplayName("Test Division Divide By Zero Scenario")

   void testDivisionDivideByZero(){
       Assertions.assertThrows(ArithmeticException.class,new Executable(){
           @Override
           public void execute() throws Throwable{
               standardCalculator.divide(10,0);
           }
       });
   }

}
