package echo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
public class EchoController {
    private final int id = new SecureRandom().nextInt(1000) + 1;


    @Value("${application.configValue}")
    private String configValue;

    @Value("${application.secretValue}")
    private String secretValue;

    @GetMapping("/echo/{request}")
    String echo(@PathVariable("request") String request) {
        String configInfo = "configValue=" + configValue + "; secretValue=" + secretValue;
        return "echo: \"" + request + "\" from id=" + id + "; " + configInfo;
    }

}
