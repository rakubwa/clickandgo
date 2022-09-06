package pl.clickandgoApp.clickandgo;

import lombok.AllArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.clickandgoApp.ClickAndGoApplication;

@RestController
@RequestMapping("/clickandgo")
@AllArgsConstructor
public class ClickAndGoController {

    private ClickAndGoServiceSelector clickAndGoServiceSelector;

    @GetMapping
    public ClickAndGo getClickAndGo(@Nullable @RequestParam String category) throws ClickAndGoException {
        return null;
    }



}
