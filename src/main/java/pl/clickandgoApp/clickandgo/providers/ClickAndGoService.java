package pl.clickandgoApp.clickandgo.providers;

import pl.clickandgoApp.clickandgo.ClickAndGo;

import java.util.List;
import java.util.Optional;

public interface ClickAndGoService {

    Optional<ClickAndGo> getClickAndGo(String category);

    List<String> getAvailableCategories();
}
