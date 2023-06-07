package dashbikash.authkeycloakspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AuthKeycloakSpringApplication {
        
        @GetMapping("/hello")
        public ResponseEntity hello(){
            
            return ResponseEntity.ok("Hello KeyCloak");
        }
        
	public static void main(String[] args) {
		SpringApplication.run(AuthKeycloakSpringApplication.class, args);
	}

}
