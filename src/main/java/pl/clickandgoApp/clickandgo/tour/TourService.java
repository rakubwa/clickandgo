package pl.clickandgoApp.clickandgo.tour;

import pl.clickandgoApp.clickandgo.Tour;

import java.util.List;

public interface TourService {

    Tour createTour(TourDto tourDto);

    List<TourDto> getAvailableTours();
}
