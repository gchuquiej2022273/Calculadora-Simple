package org.calculadora.operacions;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class OperationTypeTest {

    @Test
    public void operacionCalc_testSuma() {

        Operation op = mock(Operation.class);
        OperationAritmetic operationArit = mock(OperationAritmetic.class);


        OperationType operationType = new OperationType() {
            @Override
            public void operacionCalc(String operation) {
                super.operacionCalc(operation);
            }
        };


        when(op.getOperator()).thenReturn('+');
        when(op.getValueOne()).thenReturn(5.0);
        when(op.getValueTwo()).thenReturn(3.0);

        when(operationArit.operationSum()).thenReturn(8.0);


        operationType.operacionCalc("5+3");


        verify(op).setValueOne(5.0);
        verify(op).setValueTwo(3.0);
        verify(op).setOperator('+');
        verify(op).setResult(8.0);
    }


    @Test
    public void operacionCalc_testResta() {

        Operation op = mock(Operation.class);
        OperationAritmetic operationArit = mock(OperationAritmetic.class);


        OperationType operationType = new OperationType() {
            @Override
            public void operacionCalc(String operation) {
                super.operacionCalc(operation);
            }
        };


        when(op.getOperator()).thenReturn('-');
        when(op.getValueOne()).thenReturn(10.0);
        when(op.getValueTwo()).thenReturn(4.0);
        when(operationArit.operationResta()).thenReturn(6.0);


        operationType.operacionCalc("10-4");


        verify(op).setValueOne(10.0);
        verify(op).setValueTwo(4.0);
        verify(op).setOperator('-');
        verify(op).setResult(6.0);
    }

    @Test
    public void operacionCalc_testMultiplicacion() {
        Operation op = mock(Operation.class);
        OperationAritmetic operationArit = mock(OperationAritmetic.class);

        OperationType operationType = new OperationType() {
            @Override
            public void operacionCalc(String operation) {
                super.operacionCalc(operation);
            }
        };

        when(op.getOperator()).thenReturn('*');
        when(op.getValueOne()).thenReturn(4.0);
        when(op.getValueTwo()).thenReturn(5.0);
        when(operationArit.operationMultiply()).thenReturn(20.0);


        operationType.operacionCalc("4*5");

        verify(op).setValueOne(4.0);
        verify(op).setValueTwo(5.0);
        verify(op).setOperator('*');
        verify(op).setResult(20.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void operacionCalc_testOperacionInvalida() {

        Operation op = mock(Operation.class);
        OperationAritmetic operationArit = mock(OperationAritmetic.class);


        OperationType operationType = new OperationType() {
            @Override
            public void operacionCalc(String operation) {
                super.operacionCalc(operation);
            }
        };


        when(op.getOperator()).thenReturn('/');
        when(op.getValueOne()).thenReturn(10.0);
        when(op.getValueTwo()).thenReturn(0.0);
        when(operationArit.operationDivision()).thenThrow(new ArithmeticException("No se puede dividir por cero"));


        operationType.operacionCalc("10/0");
    }
}
