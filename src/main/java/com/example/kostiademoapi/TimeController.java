package com.example.kostiademoapi;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class TimeController {
    @GetMapping("/get")
    public TimeObject getTime() {
        TimeObject time = new TimeObject();
        LocalDateTime now = LocalDateTime.now();
        time.year = now.getYear();
        time.month = now.getMonth().getValue();
        time.day = now.getDayOfMonth();
        time.hour = now.getHour();
        time.minute = now.getMinute();
        time.second = now.getSecond();
        return time;
    }

    @PostMapping("/post")
    public TimeObject postTime(@RequestBody @Valid TimeObject input) {
        return input;
    }
}