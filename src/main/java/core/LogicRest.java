package core;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicRest {
    @PostMapping("/sendNumber")
    public String sendNumber(@RequestBody String requestBody) {
        System.out.println("requestBody: " + requestBody);

        JSONObject jsonObject = new JSONObject(requestBody);
        int number = jsonObject.getInt("number_1");
        String result = "{\"result\":" + (number * number) + "}";
        System.out.println(result);

        return result;
    }
}
