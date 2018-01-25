package com.sis.project.utils;

public enum GenderEnum {
    MALE("Muško"),
    FEMALE("Žensko");

    private String gender;

    private GenderEnum(String gender)
    {
        this.gender = gender;
    }

    public String getGender()
    {
        return gender;
    }

}
