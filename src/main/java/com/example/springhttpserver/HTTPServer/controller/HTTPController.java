package com.example.springhttpserver.HTTPServer.controller;

import com.example.springhttpserver.HTTPServer.dto.TimeDto;
import com.example.springhttpserver.HTTPServer.service.TimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HTTPController {
    private final TimeService timeService;

    @GetMapping("/api/time")
    public TimeDto time() {
        return timeService.getCurrentTime();
    }

}
