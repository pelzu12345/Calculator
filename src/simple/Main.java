package simple;

public class Main {
    public static void main(String[] args) {
        DataGrabber dataGrabber=new DataGrabber() ;
        dataGrabber.grabNumbersData();

        System.out.println(dataGrabber);

        Calculator calculator=new Calculator();
        calculator.calculate(dataGrabber);
        System.out.println(Math.addExact(1,1));

    }
}
