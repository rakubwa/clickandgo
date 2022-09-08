package pl.clickandgoApp.clickandgo.tour;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.clickandgoApp.clickandgo.Tour;

import java.util.List;
@RequiredArgsConstructor
@Service
public class TourServiceImpl implements TourService{

    private final TourRepository tourRepository;

    @Override
    public Tour createTour(TourDto tourDto) {
        return null;
    }

    @Override
    public List<TourDto> getAvailableTours() {
        return tourRepository.findAll() .stream()
                .map(TourEntity::toDto)
                .toList();
    }
}
