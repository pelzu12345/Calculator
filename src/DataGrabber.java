import java.util.Scanner;

public class DataGrabber {
    private int firstNumber;

    private enum TypeOfMathematicalOperation {ADD, SUBTRACTION, MULTIPLICATION, DIVISION}

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


    public void grabNumbersData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        secondNumber = scanner.nextInt();
    }

    public void grabTypeOfMathematicalOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of operation");
        String typeOperator = scanner.next();
        TypeOfMathematicalOperation typeOfMathematicalOperation = null;
        switch (typeOfMathematicalOperation) {
            case ADD:
                break;
            case SUBTRACTION:
                break;
            case MULTIPLICATION:
                break;
            case DIVISION:
                break;

        }

    }


}


