package elfhazardwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SampleWebApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
}
