package Dev.abhi.bookmyshow.Controllre;

import Dev.abhi.bookmyshow.dtos.cityRequestDto;
import Dev.abhi.bookmyshow.models.City;
import Dev.abhi.bookmyshow.repostitories.CityRepository;
import Dev.abhi.bookmyshow.services.CityServices;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
private CityServices cityServices;
@PostMapping ("/city")
public ResponseEntity createCity(@RequestBody cityRequestDto cityRequestDto){
    try{
        String cityName = cityRequestDto.getName();
        if(cityName==null || cityName.isBlank()||cityName.isEmpty()){
            throw new Exception("city name is not added ");
        }
        City savedCity=cityServices.saveCity(cityName);
        return ResponseEntity.ok(savedCity);
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return null;
}
@DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable ("id")int cityid){
    boolean isDeleted=cityServices.deleteCity(cityid);
    return ResponseEntity.ok(isDeleted);
}
@GetMapping("/city/{name}")
    public  ResponseEntity findcityname(@PathVariable("name")String cityName){
    City savedcity= cityServices.getCityByName(cityName);
    return ResponseEntity.ok(savedcity);
}
}
