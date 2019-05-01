package gt.edu.umg.ingenieria.sistemas.so2.kuberneteshelloworldlocal;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesHelloWorldLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesHelloWorldLocalApplication.class, args);
	}
    
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello world. Now it is " + new Date();
    }

}
