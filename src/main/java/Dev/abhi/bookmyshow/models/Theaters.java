package Dev.abhi.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theaters extends BaseModel {
private String name;
private String address;
@OneToMany
private List<Auditoriums> audis;
}
