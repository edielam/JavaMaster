package com.masterclass;

public class NumberOfDaysInMonth {
        // write your code here
        public static boolean isLeapYear(int year){
            if(year<1 || year >9999){
                return false;
            }
            else if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
                return true;
            }
            return false;
        }
        public static int getDaysInMonth(int month, int year){
            if (month <1 || month > 12){
                return -1;
            }
            if (year <1 || year > 9999){
                return -1;
            }
            int days;
            switch(month){
                case 2:
                    if(isLeapYear(year)){
                        days = 29;
                    } else
                        days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                default:
                    days = -1;
                    break;
            }
            return days;
        }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,1924));
    }
}

