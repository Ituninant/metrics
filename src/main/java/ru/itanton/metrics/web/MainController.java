package ru.itanton.metrics.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itanton.metrics.db.User;
import ru.itanton.metrics.db.UserRepository;

import javax.annotation.PostConstruct;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final UserRepository userRepository;

    @PostConstruct
    private void init() {
        userRepository.save(User.builder()
                .firstName("test")
                .lastName("test")
                .build());
    }

    @GetMapping("api/v1/ping")
    public Map<String, String> ping() {
        return Map.of("ping", "done");
    }

    @GetMapping("api/v1/ping/db/{id}")
    public User pingDb(@PathVariable("id") Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id=" + id + " not found!"));
    }

}
