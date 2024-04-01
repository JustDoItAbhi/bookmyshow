package Dev.abhi.bookmyshow.models;

import Dev.abhi.bookmyshow.models.constants.SeatStatus;
import Dev.abhi.bookmyshow.models.constants.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seats extends BaseModel{

    private int row1;

    private int coll;
    private String seat_Number;

    @Enumerated(EnumType.STRING)

    private SeatType seat_Type;
    @Enumerated(EnumType.STRING)
    private SeatStatus seat_Status;
}
