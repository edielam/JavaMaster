package com.javam;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    @Override
    public String toString(){
        String res = "Player{name='"+getName()+"', hitPoints="+getHitPoints()+", strength="+getStrength()+", weapon='"+getWeapon()+"'}";
        return res;
    }

    @Override
    public List<String> write() {
        List<String> players = new ArrayList<>();
        players.add(0, this.name);
        players.add(1, ""+this.hitPoints);
        players.add(2, ""+this.strength);
        players.add(3, this.weapon);
        return players;
    }

    @Override
    public void read(List<String> obj) {
        if(obj.size() > 0 && obj != null){
            this.name = obj.get(0);
            this.hitPoints = Integer.parseInt(obj.get(1));
            this.strength = Integer.parseInt(obj.get(2));
            this.weapon = obj.get(3);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
