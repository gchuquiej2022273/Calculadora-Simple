package org.calculadora.operacions;

public class Operation {

    private double valueOne;
    private double valueTwo;
    private char operator;
    private double result;

    public Operation(){}

    public Operation(double valueOne, double valueTwo, char operator, double result) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.operator = operator;
        this.result = result;
    }

    public double getValueOne() {

        return valueOne;
    }

    public void setValueOne(double valueOne) {

        this.valueOne = valueOne;
    }

    public double getValueTwo() {

        return valueTwo;
    }

    public void setValueTwo(double valueTwo) {

        this.valueTwo = valueTwo;
    }

    public char getOperator() {

        return operator;
    }

    public void setOperator(char operator) {

        this.operator = operator;
    }

    public double getResult() {

        return result;
    }

    public void setResult(double result) {

        this.result = result;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "valueOne=" + valueOne +
                ", valueTwo=" + valueTwo +
                ", operator=" + operator +
                ", result=" + result +
                '}';
    }
}
