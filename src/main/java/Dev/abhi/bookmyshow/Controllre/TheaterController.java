package Dev.abhi.bookmyshow.Controllre;

import Dev.abhi.bookmyshow.dtos.TheaterRequestDtos;
import Dev.abhi.bookmyshow.services.TheaterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheaterController {
@Autowired
    private TheaterServices theaterServices;

@PostMapping("/theatre")
public ResponseEntity createTheatre(@RequestBody
                                   TheaterRequestDtos theaterRequestDtos){
    return ResponseEntity.ok(
            theaterServices.saveTheater(
                  theaterRequestDtos.getName(),
                    theaterRequestDtos.getAddress(),
                    theaterRequestDtos.getCityId()
                    )
    );
}
}
