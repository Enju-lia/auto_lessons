package ru.stqa.pft.sandbox;

public class Square {
    public double r;

    public Square(double r) {
        this.r = r;
    }

    public double area() {
        return this.r * this.r;
    }
}