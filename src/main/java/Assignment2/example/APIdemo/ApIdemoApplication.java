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
	}
        
        public static void character(){
         try {
            String url = "https://rickandmortyapi.com/api/character/108";
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jSonName = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jSonName);
            
            String name = root.findValue("name").asText();
            
            String gender = root.findValue("price_usd").asText();
            
            System.out.println("Coin: " + name);
            System.out.println("Price: " + gender);

        } catch (JsonProcessingException ex) {
            System.out.println("error in character information");
        }
}
}
