package com.cte;

public class Pilot {
    int id;
    String name;
    String[] flightSkills;
    boolean coPilot;

    public Pilot(int id, String name, boolean coPilot, String ... flightSkills) {
        this.id = id;
        this.name = name;
        this.flightSkills = flightSkills;
        this.coPilot = coPilot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFlightSkills() {
        return flightSkills;
    }

    public void setFlightSkills(String[] flightSkills) {
        this.flightSkills = flightSkills;
    }

    public boolean isCoPilot() {
        return coPilot;
    }

    public void setCoPilot(boolean coPilot) {
        this.coPilot = coPilot;
    }
}
