package Dev.abhi.bookmyshow.models;

import Dev.abhi.bookmyshow.models.constants.PaymentModes;
import Dev.abhi.bookmyshow.models.constants.PaymnetStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class Payments extends BaseModel{
    private LocalDateTime paymentTime;
    private double AMOUNT;
    private String referredId;
    @ManyToOne
    private Ticket ticket;

    @Enumerated(EnumType.STRING)
    private PaymnetStatus paymnetStatus;
    @Enumerated(EnumType.STRING)
    private PaymentModes paymentModes;
}
