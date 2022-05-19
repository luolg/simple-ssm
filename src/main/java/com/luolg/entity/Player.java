package com.luolg.entity;

public class Player {
    private long id;
    private String name;
    private String  team;
    private int number;


    public Player() {
    }

    public Player(long id, String name, String team, int number) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", number=" + number +
                '}';
    }
}
