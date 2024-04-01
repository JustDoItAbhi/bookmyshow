package Dev.abhi.bookmyshow.repostitories;

import Dev.abhi.bookmyshow.models.Actor;
import Dev.abhi.bookmyshow.models.Auditoriums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository

public interface AuditoriumsRepository extends JpaRepository<Auditoriums,Integer> {
}
