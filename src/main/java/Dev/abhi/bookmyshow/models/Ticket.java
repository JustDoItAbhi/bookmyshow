package Dev.abhi.bookmyshow.models;

import Dev.abhi.bookmyshow.models.constants.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@Entity

public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    private Double totalAmount;
    @OneToMany
    private List<ShowSeats> showSeats;
    @ManyToOne
    private Shows shows;
    @Enumerated(EnumType.STRING)
private TicketStatus ticketStatus;
}
