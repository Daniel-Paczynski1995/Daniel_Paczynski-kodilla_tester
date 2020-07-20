package basic_assertion;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int multiplicationResult = calculator.multiplication(a, b);
        boolean correct = ResultChecker.assertEquals(40, multiplicationResult);
        if (correct) {
            System.out.println("Metoda mutiplication działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda multiplication nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}


