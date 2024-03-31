package Dev.abhi.bookmyshow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="ACTOR")
public class Actor extends BaseModel{
@Column(name="ActorName")
    private String name;
}
