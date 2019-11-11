package com.NetCracker;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public int[] getXY(){
        int number1 = this.getX();
        int number2 = this.getY();
        return new int[] {number1, number2};
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return '('+
                this.x+
                ","+
                this.y+
                ')';
    }
    public double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }

    public double distance(MyPoint another){
        return Math.sqrt((another.x-this.x)*(another.x-this.x)+(another.y-this.y)*(another.y-this.y));
    }

    public double distance(){
        return Math.sqrt((this.x)*(this.x)+(this.y)*(this.y));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x &&
                y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + x;
        result = 31*result + y;
        return result;
    }
}
