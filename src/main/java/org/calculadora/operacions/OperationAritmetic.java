package org.calculadora.operacions;

public class OperationAritmetic extends Operation{


    private Operation op;

    public OperationAritmetic(Operation op) {
        this.op = op;
    }

    Double operationSum(){
        double resultado =  op.getValueOne() + op.getValueTwo();
        return resultado;
    }

    Double operationResta(){
        double resultado =  op.getValueOne() - op.getValueTwo();
        return resultado;
    }

    Double operationMultiply(){
        double resultado =  op.getValueOne() * op.getValueTwo();
        return resultado;
    }

    Double operationDivision() {
        double resultado = op.getValueTwo() != 0 ? op.getValueOne() / op.getValueTwo() : Double.NaN;

        if (Double.isNaN(op.getResult()) && op.getOperator() == '/') {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        return resultado;
    }

}
