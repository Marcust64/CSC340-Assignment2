
package Assignment2.example.APIdemo;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Marcus Thompson
 */
@org.springframework.web.bind.annotation.RestController
public class RestApiController {
    /**
     * Hello, Mr. Nimbus API endpoint.
     *
     * @return response string.
     */
    @GetMapping("/hello")
    public String hello() {
    return "Hello, Mr. Nimbus";
    }
    /**
     * Greeting API endpoint.
     *
     * @return response string.
     */
    @GetMapping("/greeting")
    public String greeting() {
        return "Wubalubadubdub";
    }
}
