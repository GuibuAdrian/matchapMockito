package ar.com.matchapp.model;

public class Gambler {
    private String name;
    private int id;

    public Gambler(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }

    public int getId() { return id; }
}
