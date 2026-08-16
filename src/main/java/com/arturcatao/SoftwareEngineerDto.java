package com.arturcatao;

import jakarta.validation.constraints.NotBlank;

public record SoftwareEngineerDto(
        @NotBlank String id,
        @NotBlank String name,
        String techStack
) {

    public SoftwareEngineerDto(SoftwareEngineer swe) {
        this(
                swe.getId().toString(),
                swe.getName(),
                swe.getTechStack()
        );
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String techStack() {
        return techStack;
    }
}
