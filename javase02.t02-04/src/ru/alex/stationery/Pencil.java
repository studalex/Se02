package ru.alex.stationery;
import java.awt.*;

public class Pencil extends WritingUtensils {
    public enum Type {
        COLOR,
        GRAPH
    }

    public Type getType() {
        return type;
    }

    private Type type;

    public Pencil() {
        super();
        this.type = Type.GRAPH;
    }

    public Pencil(int cost, String name, Color color, Type type) {
        super(cost, name, color);
        this.type = type;
    }
}
