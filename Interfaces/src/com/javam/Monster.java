package com.javam;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString(){
        String res = "Monster{name='"+getName()+"', hitPoints="+getHitPoints()+", strength="+getStrength()+"'}";
        return res;
    }

    @Override
    public List<String> write() {
        List<String> players = new ArrayList<>();
        players.add(0, this.name);
        players.add(1, ""+this.hitPoints);
        players.add(2, ""+this.strength);
        return players;
    }

    @Override
    public void read(List<String> obj) {
        if(obj.size() > 0 && obj != null){
            this.name = obj.get(0);
            this.hitPoints = Integer.parseInt(obj.get(1));
            this.strength = Integer.parseInt(obj.get(2));
        }
        else{
            System.out.println("Invalid");
        }
    }
}
