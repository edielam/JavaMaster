package com.masterclass;

public class PaintJob {
    public static int getBucketCount(double width, double height,
                                     double areaPerBucket,
                                     int extraBuckets){
        double area = width * height;
        int buckets = 0;
        if(width <=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }
        while(areaPerBucket < area){
            buckets++;
            area= area - areaPerBucket;
        }
        buckets++;
        return buckets - extraBuckets;
    }
    public static int getBucketCount(double width, double height,
                                     double areaPerBucket){
        double area = width * height;
        int buckets = 0;
        if(width <=0||height<=0||areaPerBucket<=0){
            return -1;
        }
        while(areaPerBucket < area){
            buckets++;
            area= area - areaPerBucket;
        }
        return buckets + 1;
    }
    public static int getBucketCount(double area,
                                     double areaPerBucket){
        int buckets =0;
        if(area<=0||areaPerBucket<=0){
            return -1;
        }
        while(areaPerBucket < area){
            buckets++;
            area= area - areaPerBucket;
        }
        return buckets + 1;
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75,3.25,2.5, 1));
    }
}
