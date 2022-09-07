package pl.clickandgoApp.clickandgo.tour;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.clickandgoApp.clickandgo.Tour;

import java.util.List;

@RestController
@RequestMapping("/tours")
@AllArgsConstructor
public class TourController {
    @GetMapping
    public List<TourDto> getAvailableTours(){
        return List.of();
    }



}
