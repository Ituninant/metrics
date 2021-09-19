package ru.itanton.metrics.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {

    @GetMapping("api/v1/ping")
    public Map<String, String> ping() {
        return Map.of("ping", "done");
    }

}
