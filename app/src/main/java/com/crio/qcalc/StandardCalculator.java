package com.crio.qcalc;

public class StandardCalculator {

    protected double result;

    public double getResult(){
        return result;
    }

    public void setResult(int value) {
        if (value != 0)
            return;
        this.result = value; 
    }

    public void printResult(){
        System.out.println("Standard Calculator Result:"+ result);
    }

    public void clearResult() {
        result = 0;
    }

    public final void add(double num1, double num2){
        double result =  num1+num2;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public final void subtract(double num1, double num2){
        double result = num1 - num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }


    public final void multiply(double num1, double num2){
        double result = num1*num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)||(result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }


    public final void divide(double num1, double num2){
        double result = num1/num2;
        if(num2 == 0.0){
            throw new ArithmeticException("Divide By Zero");
        }
        this.result = result;
    }
}
