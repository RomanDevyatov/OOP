package com.NetCracker;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        this.length=1.0f;
        this.width=1.0f;
    }
    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    public float getLength(){
        return this.length;
    }
    public void setLength(float length){
        this.length=length;
    }
    public float getWidth(){
        return this.width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    public String toString(){
        return "Rectangle[length="+String.format ("%.9f", this.length)+", width="+String.format ("%.9f", this.width)+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.length, length) == 0 &&
                Float.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Float.floatToIntBits(length);
        result = 31 * result + Float.floatToIntBits(width);
        return result;
    }

}
