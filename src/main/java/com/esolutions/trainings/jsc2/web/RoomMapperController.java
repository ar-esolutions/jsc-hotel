package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.Guest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomMapperController {

    @GetMapping(value = "/floors/{floor}/rooms/{room}")
    public Guest getGuestNumber(@PathVariable int floor, @PathVariable int room ){
        return new Guest(0);
    }
}
