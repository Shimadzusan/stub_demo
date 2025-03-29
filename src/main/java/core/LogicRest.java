package core;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LogicRest {
    InfluxDBLogic influx = new InfluxDBLogic();
    @PostMapping("/sendNumber")
    public String sendNumber(@RequestBody String requestBody) {
        System.out.println("requestBody: " + requestBody);

        JSONObject jsonObject = new JSONObject(requestBody);
        int number = jsonObject.getInt("number_1");
        String result = "";

        String operation = jsonObject.getString("operation");
        switch (operation) {
            case "square":
                NumberSquare numberSquare = new NumberSquare();
                int square = numberSquare.returnNumberSquare(number);
                result = "{\"result\":" + square + "}";
                influx.sendData("square", number);
                break;

            case "square_root":
                SquareRoot squareRoot = new SquareRoot();
                double root = squareRoot.returnNumberSquareRoot(number);
                result = "{\"result\":" + root + "}";
                influx.sendData("square_root", number);
                break;
        }
        return result;
    }
}
