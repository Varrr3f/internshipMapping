package controller;

import mapping.MapStructSpring;
import org.springframework.stereotype.Controller;
import repository.ApplicationRepository;

@Controller
public class ApplicationController {

    private MapStructSpring mapStructSpring;

    private ApplicationRepository applicationRepository;

    public ApplicationController(MapStructSpring mapStructSpring, ApplicationRepository applicationRepository) {
        this.mapStructSpring = mapStructSpring;
        this.applicationRepository = applicationRepository;
    }
}
