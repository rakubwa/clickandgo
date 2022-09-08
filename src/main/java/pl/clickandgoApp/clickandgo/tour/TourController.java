package pl.clickandgoApp.clickandgo.tour;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tours")
@AllArgsConstructor
public class TourController {
    private final TourService tourService;
    @GetMapping
    public List<TourDto> getAvailableTours(){
        return tourService.getAvailableTours();
    }



}
