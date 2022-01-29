package com.masterclass;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int kilo = 5 * bigCount;
        boolean test = kilo+smallCount >= goal;
        if(bigCount< 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if(test){
            if(goal ==kilo || goal == smallCount){
                return true;
            }
            if(goal == 5 && bigCount>0){
                return true;
            }
            if(smallCount == 0 && goal%5 !=0){
                return false;
            }
            if ( smallCount >= (goal -kilo )){
                if(kilo - goal < 5 && smallCount <(goal -(kilo-5) )){
                    return false;
                }
                else {
                    return true;
                }
            }
            if((goal - smallCount) % 5 != 0){
                if(bigCount == 0){
                    return true;
                }

                else if(goal - kilo <= smallCount){
                    if(goal - kilo <0){
                        if(smallCount + kilo > goal){
                            return true;
                        }
                        return false;
                    }
                    else {
                        return true;
                    }
                }
                else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(canPack(2, 10, 18));
    }
}