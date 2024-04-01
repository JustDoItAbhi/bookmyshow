package Dev.abhi.bookmyshow.Controllre;

import Dev.abhi.bookmyshow.services.TicketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired// create dependencey
    private TicketServices ticketServices;


    @GetMapping ("/hello")
    public ResponseEntity greet(){
     String greet = ticketServices.greet();
     return ResponseEntity.ok(greet);
 }
}
