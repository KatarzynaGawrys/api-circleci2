package pl.zajecia.apicircleci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @GetMapping("/hello")
    public String get() {
        return "hello devops";
    }
}
