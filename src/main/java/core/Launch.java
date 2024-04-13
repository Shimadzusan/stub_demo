package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
public class Launch {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("..stub_demo start");
//        SpringApplication.run(Launch.class, args);

        String filePath = "C:\\Users\\worker\\Desktop\\tem_java_task.txt"; // Replace with the actual file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String s = line;
                String[] s_array = s.split(";");

                if(s_array.length >= 3) {
                    System.out.println(s_array[0] + ";" + s_array[1]);
                }
                else {
                    System.out.println(line);
                }
                // You can process each line here as needed
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
