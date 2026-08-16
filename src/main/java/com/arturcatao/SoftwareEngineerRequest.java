package com.arturcatao;

import jakarta.validation.constraints.NotBlank;

public record SoftwareEngineerRequest(
        @NotBlank String name,
        @NotBlank String password,
        String techStack
) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String techStack() {
        return techStack;
    }

    @Override
    public String password() {
        return password;
    }
}
