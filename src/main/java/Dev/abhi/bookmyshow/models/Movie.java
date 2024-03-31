package Dev.abhi.bookmyshow.models;

import Dev.abhi.bookmyshow.models.constants.MovieFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Movie extends  BaseModel {
    private String  name ;
    private String discription;

    @ManyToMany
    private List<Actor> actors;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeatures>movieFeatures;
}
