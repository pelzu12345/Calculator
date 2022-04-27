package simple;

import java.util.Scanner;

public class DataGrabber {
    private int firstNumber;

    private String typeOfMathematicalOperation ;
    ;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getTypeOfMathematicalOperation() {
        return typeOfMathematicalOperation;
    }

    public void setTypeOfMathematicalOperation(String typeOfMathematicalOperation) {
        this.typeOfMathematicalOperation = typeOfMathematicalOperation;
    }

    public DataGrabber(int firstNumber, String typeOfMathematicalOperation, int secondNumber) {
        this.firstNumber = firstNumber;
        this.typeOfMathematicalOperation = typeOfMathematicalOperation;
        this.secondNumber = secondNumber;
    }

    public DataGrabber() {
    }

    public void grabNumbersData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        secondNumber = scanner.nextInt();
        System.out.println("Enter the type od operation + - * / ");
        typeOfMathematicalOperation = scanner.next();
    }


    @Override
    public String toString() {
        return "simple.DataGrabber{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", TypeOfOperation=" + typeOfMathematicalOperation +

                '}';
    }

}


