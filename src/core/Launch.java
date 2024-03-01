package core;

public class Launch {
    public static void main(String[] args) {
        System.out.println("..stub_demo start");

        String valueFromCmd = "";
        if (args.length > 0) {
            valueFromCmd = args[0];
        } else {
            System.out.println("No value provided in command line");
        }

        NumberSquare numberSquare = new NumberSquare();
        int number = numberSquare.returnNumberSquare(Integer.parseInt(valueFromCmd));
        System.out.println("the square of the number is: " + number);
    }
}
