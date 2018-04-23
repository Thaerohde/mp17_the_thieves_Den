package at.RefugeesCode.mp17_the_thieves_Den;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/")
public class HomeEndpoint {

    @GetMapping
    String page(){
        return "home";
    }
}
