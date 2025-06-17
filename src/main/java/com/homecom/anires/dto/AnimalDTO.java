package com.homecom.anires.dto;

import lombok.Builder;

@Builder
public record AnimalDTO(String type, String name, int age) {
}
