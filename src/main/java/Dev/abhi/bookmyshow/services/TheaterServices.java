package Dev.abhi.bookmyshow.services;

import Dev.abhi.bookmyshow.models.City;
import Dev.abhi.bookmyshow.models.Theaters;
import Dev.abhi.bookmyshow.repostitories.TheatersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TheaterServices {
    @Autowired
private TheatersRepository theatersRepository;
@Autowired
private CityServices cityServices;

public Theaters getTheaterByName(String TheaterName){
    Theaters theaters=theatersRepository.findTheatersByName(TheaterName);
    return theaters;
}
public Theaters getTheaterById(int theaterId){
   return theatersRepository.findById(theaterId).get();
}
public Theaters saveTheater(String name,String address, int cityId){

    Theaters theaters=new Theaters();
    theaters.setName(name);
    theaters.setAddress(address);
    theaters.setId(cityId);
    Theaters savedTheatre=theatersRepository.save(theaters);

    City city=cityServices.getCityById(cityId);
    List<Theaters> theatersList=city.getTheatersList();
    theatersList.add(savedTheatre);
    city.setTheatersList(theatersList);
    cityServices.saveCity(city);
    return savedTheatre;

}
}
