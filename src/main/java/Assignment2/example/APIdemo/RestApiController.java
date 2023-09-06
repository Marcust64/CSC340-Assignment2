
package Assignment2.example.APIdemo;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Marcus Thompson
 */
@org.springframework.web.bind.annotation.RestController
public class RestApiController {
    @GetMapping("/hello")
    public String hello() {
    return "Hello, Mr. Nimbus";
    }
    @GetMapping("/greeting")
    public String greeting() {
        return "Wubalubadubdub";
    }
}
