package Dev.abhi.bookmyshow.repostitories;

import Dev.abhi.bookmyshow.models.Actor;
import Dev.abhi.bookmyshow.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
