package Dev.abhi.bookmyshow.repostitories;

import Dev.abhi.bookmyshow.models.Actor;
import Dev.abhi.bookmyshow.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
    City findCitiesByName(String name);
}
