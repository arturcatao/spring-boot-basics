package com.arturcatao.dto;

import com.arturcatao.entity.SoftwareEngineer;

public record SoftwareEngineerDto(
        String id,
        String name,
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
