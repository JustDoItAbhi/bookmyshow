package Dev.abhi.bookmyshow.models;

import Dev.abhi.bookmyshow.models.constants.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeats extends BaseModel {
    private int price;
    @ManyToOne
    private Shows shows;
    @ManyToOne
    private Seats seats;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus seatStatus;
}
