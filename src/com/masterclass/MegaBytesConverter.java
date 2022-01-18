package com.masterclass;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
		int mb = 0;
		int rem = 0;
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		}
		else
		{
			mb = kiloBytes / 1024;
			rem = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = "+ mb +" MB and "+ rem +" KB");
		}
    }
    public static void main(String[] args){
		printMegaBytesAndKiloBytes(2500);
    }
}
