package Dev.abhi.bookmyshow.repostitories;

import Dev.abhi.bookmyshow.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ActorRepository extends JpaRepository<Actor,Integer> {
}
