package com.NetCracker;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius=1.0;
        this.color="red";
    }
    public Circle(double radius){
        this.radius=radius;
        this.color="red";
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String toString(){
        return "Circle[radius="+String.format ("%.9f", this.radius)+", color="+this.color+"]";
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + (int)Double.doubleToLongBits(radius);
        result = 31*result + color.hashCode();
        return result;
    }

}
