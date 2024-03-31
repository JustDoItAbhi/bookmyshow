package Dev.abhi.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Shows extends BaseModel {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Auditoriums auditoriums;
    @OneToMany
    private List<ShowSeats> showSeatsList;
}
