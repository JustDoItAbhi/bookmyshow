package Dev.abhi.bookmyshow.services;

import Dev.abhi.bookmyshow.models.City;
import Dev.abhi.bookmyshow.repostitories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CityServices {
 @Autowired
    private CityRepository cityRepository;
    public City saveCity(String cityName){
        City city=new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }
    public boolean deleteCity(int cityid){
        cityRepository.deleteById(cityid);
        return true;
    }
    public City getCityByName(String cityName){
        City city=cityRepository.findCitiesByName(cityName);
        return city;
    }
}
