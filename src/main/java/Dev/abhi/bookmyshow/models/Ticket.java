package Dev.abhi.bookmyshow.models;

import Dev.abhi.bookmyshow.models.constants.TicketStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

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
