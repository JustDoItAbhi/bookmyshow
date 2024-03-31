package Dev.abhi.bookmyshow.models;

import Dev.abhi.bookmyshow.models.constants.MovieFeatures;
import jakarta.persistence.*;

import java.util.List;

public class Movie extends  BaseModel {
    private String  name ;
    private String discription;

    @ManyToMany
    private List<Actor> actors;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeatures>movieFeatures;
}
