package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
public class Launch {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("..stub_demo start");
        SpringApplication.run(Launch.class, args);
    }

}
