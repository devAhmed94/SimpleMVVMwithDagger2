package com.example.simplemvvmwithdagger2.pojo;

public class Player {
    private String name;
    private String club;
    private String position;

    public Player() {
    }

    public Player(String name, String club, String position) {
        this.name = name;
        this.club = club;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
