package ru.nikolaev.springcourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Bitter sweet Symphony";
    }
}
