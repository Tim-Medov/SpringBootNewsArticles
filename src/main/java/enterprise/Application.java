
package enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        // Link to resource: http://localhost:8080/home
        SpringApplication.run(Application.class, args);
    }
}
