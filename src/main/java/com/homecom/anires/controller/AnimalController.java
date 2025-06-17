package com.homecom.anires.controller;

import com.homecom.anires.dto.AnimalDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/animal")
public class AnimalController {

    @GetMapping
    public ResponseEntity<AnimalDTO> getAnimal() {
        return ResponseEntity.ok(AnimalDTO.builder().type("Dog").name("Sirius").age(3).build());
    }
}
