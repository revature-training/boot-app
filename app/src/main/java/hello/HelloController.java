package hello;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.ServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping(value="/healthz", method=RequestMethod.GET)
    public String healthz() {
        return "such healthz";
    }    
 
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }    

    @RequestMapping(value="/cat", method=RequestMethod.GET)
    public String cat() throws UnknownHostException {
    	
        String hostIP = InetAddress.getLocalHost().getHostAddress();
       
        return "ALLO! " + hostIP;
    }
    
}
