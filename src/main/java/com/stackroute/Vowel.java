package com.stackroute;

public class Vowel
{
    public String[] check(String[] str1) {
        // int len=str1.length;
        String str22 = " ";
        String str3 = " ";
        String[] strf = new String[str1.length];
        int count = 0;
        String[] str23 = new String[0];
        for (String str2 : str1) {
            char ch = str2.charAt(0);
            //char ch = str2[0];


            String str11 = String.valueOf(ch) + str2.substring(1).replaceAll("[AEIOUaeiou]", "");
            strf[count] = str11;
            count++;
//System.out.println(str11);

//String[] arr=new String[]{str11};


        }


        return strf;

    }
}
