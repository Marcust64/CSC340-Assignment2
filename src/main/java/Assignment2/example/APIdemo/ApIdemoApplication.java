package Assignment2.example.APIdemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApIdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIdemoApplication.class, args);
                character();
                System.exit(0);
	}
        
        public static void character(){
         try {
            String url = "https://rickandmortyapi.com/api/character/108";
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jSonName = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jSonName);
            
            //gets characters name 
            String name = root.findValue("name").asText();
            //gets the characters type of species
            String type = root.findValue("type").asText();
            
            System.out.println("Name: " + name);
            System.out.println("Type: " + type);

        } catch (JsonProcessingException ex) {
            System.out.println("error in character information");
        }
}
}
