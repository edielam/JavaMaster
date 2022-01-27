package com.masterclass;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount< 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if((5*bigCount)+smallCount >= goal){
            if((5*bigCount) < goal){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 14));
    }
}