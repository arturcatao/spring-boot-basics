package com.arturcatao;

public record SoftwareEngineerRequest(
        String name,
        String password,
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
