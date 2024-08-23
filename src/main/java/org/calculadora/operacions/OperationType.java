package org.calculadora.operacions;

public class OperationType implements OperationCalc{

    Operation op = new Operation();
    StringBuilder numeroBuilder = new StringBuilder();
    OperationAritmetic operationArit ;
    boolean firstPar = true;


    public OperationType(){

        this.operationArit = new OperationAritmetic(op);
    }

    @Override
    public void operacionCalc(String operation) {
        for (int i = 0; i < operation.length(); i++) {
            char caracter = operation.charAt(i);
            if (Character.isDigit(caracter) || caracter == '.') {
                numeroBuilder.append(caracter);
            } else if (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/') {
                op.setOperator(caracter);
                if (firstPar) {
                    op.setValueOne(Double.parseDouble(numeroBuilder.toString()));
                    numeroBuilder.setLength(0);
                    firstPar = false;
                }
            }
        }

        op.setValueTwo(Double.parseDouble(numeroBuilder.toString()));

        double resultado = op.getOperator() == '+' ? operationArit.operationSum() :
                op.getOperator() == '-' ? operationArit.operationResta() :
                        op.getOperator() == '*' ? operationArit.operationMultiply() :
                                op.getOperator() == '/' ? operationArit.operationDivision() :
                                        Double.NaN;
        op.setResult(resultado);

        if (Double.isNaN(op.getResult())) {
            throw new IllegalArgumentException("Operación no válida");
        }

        System.out.println("El resultado de " + op.getValueOne() + " " + op.getOperator() + " " + op.getValueTwo() + " = " + op.getResult());
    }
}