package pl.clickandgoApp.clickandgo.tour;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
public class TourDto {
    private String cityFrom;
    private String cityTo;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private Double priceForAdult;
    private Double priceForChild;
    private Integer totalNumberOfAdults;
    private Integer totalNumberOfChildren;
}



/*
    skąd (Miasto, Lotnisko)
    dokąd (Miasto, Hotel, Lotnisko)
    data wyjazdu
    data powrotu
    ilość dni
typ: (BB, HB, FB, AI - http://zw.lt/rozmaitosci/wyzywienie-w-hotelach-co-oznaczaja-bb-hb-fb-ai-ov-zpr/)
        cena za dorosłego
        cena za dziecko
        promowana
        ilość miejsc dorosłych
        ilość miejsc dla dzieci
*/
