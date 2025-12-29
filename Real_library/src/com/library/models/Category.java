package com.library.models;

public enum Category {

    BUSINESS("Business Books"),
    PSYCHOLOGY("Psychology Books"),
    SCIENCE("Science & Technology"),
    SELF_HELP("Self-Help & Personal Development");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
