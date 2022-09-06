package pl.clickandgoApp.clickandgo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.clickandgoApp.clickandgo.providers.ClickAndGoService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClickAndGoServiceSelector {

    private List<ClickAndGoService> clickAndGoServiceList;

    public Optional<ClickAndGo> getRandomTourByCategory(String category) throws ClickAndGoException {
        if (category != null) {
            return clickAndGoServiceList.stream()
                    .filter(clickAndGoService -> clickAndGoService.getAvailableCategories().contains(category))
                    .map(clickAndGoService -> clickAndGoService.getClickAndGo(category))
                    .findFirst()
                    .orElseThrow(() -> new ClickAndGoException(" "));


        }
        return Optional.of(new ClickAndGo(" ", " "));
    }


}




