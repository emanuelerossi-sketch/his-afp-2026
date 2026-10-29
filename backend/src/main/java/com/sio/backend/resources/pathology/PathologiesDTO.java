package com.sio.backend.resources.pathology;

import jakarta.validation.constraints.NotBlank;

import java.time.Instant;

public record PathologiesDTO(
        @NotBlank
        String code,

        @NotBlank
        String description
) {}
