package pl.clickandgoApp.clickandgo.tour;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TourEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cityFrom;
    private String cityTo;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private Double priceForAdult;
    private Double priceForChild;
    private Integer totalNumberOfAdults;
    private Integer totalNumberOfChildren;


    public TourEntity(String cityFrom, String cityTo, LocalDate departureDate, LocalDate arrivalDate,
                      Double priceForAdult, Double priceForChild, Integer totalNumberOfAdults,
                      Integer totalNumberOfChildren) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.totalNumberOfAdults = totalNumberOfAdults;
        this.totalNumberOfChildren = totalNumberOfChildren;
    }

    public TourDto toDto() {
        return new TourDto(this.cityFrom, this.cityTo, this.departureDate, this.arrivalDate, this.priceForAdult,
                this.priceForChild, this.totalNumberOfAdults, this.totalNumberOfChildren);
    }
}
