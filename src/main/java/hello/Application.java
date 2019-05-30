package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home_page() {
        return "Java Application Platform Demo";
    }

    @RequestMapping("/test")
    public String test_page() {
        return "Test page";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
