package com.stackroute;

public class Checkconsecutive {
    public String checkNumbers(String str){

        String[] a1=str.split(",");
        System.out.println(a1);
        int n=a1.length;
        for(String s1:a1) {
            if (n < 7) {
                return (s1 + " non consecutive numbers");
            } else
                {
                    for(int i=0;i<n;i++)
                    {
                        if((a1[i]+1)==a1[i]){
                            System.out.println(a1);
                        }
                    }
            }
        }


        return (a1 + " are consecutive numbers");
       // return null;
    }
}
//Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier, assume the digits are a string and use split()
//
// Input: 98,96,95,94,93
//
// Output: 98,96,95,94,93 non consecutive numbers
//
//
//
// Input: 54,53,52,51,50,49,48
//
// Output : 54,53,52,51,50,49,48 are consecutive numbers
//
//
//
// Input: 1,2,3,4,5,6,6
//
// Output: 1,2,3,4,5,6,6 non consecutive numbers