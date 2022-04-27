package simple;

public class Calculator implements SimpleCalculator{



    @Override
    public void calculate(DataGrabber dataGrabber) {
        Operations operations = new Operations();
        String tempString =dataGrabber.getTypeOfMathematicalOperation().toLowerCase();
        if (tempString.contains("addition")||tempString.contains("+")){
            operations.addition(dataGrabber);
        }else if (tempString.contains("subtraction")||tempString.contains("-")){
            operations.subtraction(dataGrabber);
        }else if (tempString.contains("multiplication")||tempString.contains("*")){
            operations.multiplication(dataGrabber);
        }else if (tempString.contains("division")||tempString.contains("/")){
            operations.division(dataGrabber);

        }
    }
    private class Operations {
        private void addition(DataGrabber dataGrabber){

            System.out.println(Math.addExact(dataGrabber.getFirstNumber(),dataGrabber.getSecondNumber()) );
        }
        private void subtraction(DataGrabber dataGrabber){
            System.out.println(Math.subtractExact(dataGrabber.getFirstNumber(),dataGrabber.getSecondNumber()));
        }
        private void multiplication(DataGrabber dataGrabber){
            System.out.println(Math.multiplyExact(dataGrabber.getFirstNumber(),dataGrabber.getFirstNumber()));
        }
        private void division(DataGrabber dataGrabber){
            System.out.println(Math.floorDiv(dataGrabber.getFirstNumber(), dataGrabber.getSecondNumber()));
        }
    }
}
