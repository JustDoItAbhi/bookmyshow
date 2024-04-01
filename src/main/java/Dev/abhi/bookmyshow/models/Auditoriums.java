package Dev.abhi.bookmyshow.models;

import Dev.abhi.bookmyshow.models.constants.AuditoriumFreatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditoriums extends BaseModel {
    private String name;
    private int Capecity;
    @OneToMany
    private List<Shows>shows;
    @OneToMany
    private List<Seats>seatss;
    @ElementCollection// used when enum is in multiple  ir, a datastructure as List,etc
    @Enumerated(EnumType.STRING)// create a relationship between the entity class and enum in DB
    private List<AuditoriumFreatures>auditoriumFreatures;
}
