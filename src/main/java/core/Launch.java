package core;

import org.json.JSONObject;

public class Launch {
    public static void main(String[] args) {
        System.out.println("..stub_demo start");

        String data = "{\"number_1\": 700, \"number_2\": 200}";
        JSONObject jsonObject = new JSONObject(data);
        int result = jsonObject.getInt("number_1");
        System.out.println(result);

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

    public static String parseJson() {
        return "";
    }
}
