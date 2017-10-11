package fr.fillatre.springboot.issue;

import com.example.config.ShutdownApplicationListener;
import com.example.config.StartupApplicationListener;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .listeners(new StartupApplicationListener(Application.class),
                        new ShutdownApplicationListener(Application.class))
                .run(args);
    }
}
