package com.masterclass;

public class Point{
    private int x;
    private int y;

    public Point(){
	    this(0, 0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
	    return this.x;
    }
    public int getY(){
	    return this.y;
    }
    public void setX(int value){
	    this.x = value;
    }
    public void setY(int value){
	    this.y = value;
    }
    public double distance(){
        double dist =((this.x)*(this.x))+((this.y)*(this.y));
        dist = Math.sqrt(dist);
        return dist;
    }
    public double distance(int x, int y) {
        double dist = ((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y));
        dist = Math.sqrt(dist);
        return dist;
    }
    public double distance(Point B){
        double dist =((B.x-this.x)*(B.x-this.x))+((B.y-this.y)*(B.y-this.y));
        dist = Math.sqrt(dist);
        return dist;
    }
}
