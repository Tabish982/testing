package com.testing.testing.stringcodingpractise;

public class Reverse {

    public static void main(String[] args) {

      /*  String str = "tabish";
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        } */

//        String str ="tabish azim";
//        String[] s = str.split(" ");
//
//        for (int i=0; i<s.length; i++){
//            StringBuilder sb = new StringBuilder(s[i]);
//            String reversedWord = sb.reverse().toString();
//            System.out.print(reversedWord+" ");
//        }

//        String str = " tabish azim";
//        String[] strr= str.split(" ");
//        for(String wrd : strr){
//            StringBuilder sb = new StringBuilder(wrd);
//            String reverseWord = sb.reverse().toString();
//            System.out.print(reverseWord+" ");
//        }

//        String str = "my name is tabish azim";
//        for(int i=str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }

        //1. reverse each word in whole string by brute force
        String str = "my name is tabish azim";
        String[] words =  str.split(" ");
        for(String word : words){
            for(int i=word.length()-1; i>=0; i--){
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }


        System.out.println();
        System.out.println("----------------------------");



        //2. reverse each word in whole string by using string builder
        String strr = "i am a java developer";
        String[] st =  strr.split(" ");
        for(String word: st){
            StringBuffer sb = new StringBuffer(word);
            String revWord = sb.reverse().toString();
            System.out.print(revWord+" ");
        }

        System.out.println();
        System.out.println("----------------------------");


        //3. reverse each word and remove digits in a whole string by using string builder
        String ss = "java is a 7 programming 8 language";
        String[] s = ss.split(" ");
        for(int i=0; i<=s.length-1; i++){
            String s1 = s[i].replaceAll("\\d", " ");
            StringBuilder sb = new StringBuilder(s1);
            String rev = sb.reverse().toString();
            System.out.print(rev+" ");
        }

        System.out.println();
        System.out.println("----------------------------");

        //4.reverse each word and remove digits in a whole string using brute force approach
        String tt = "we are 6 a good coder 4";
        String[] su = tt.split(" ");
        for(int i=0; i<=su.length-1; i++){
            String s2= su[i].replaceAll("\\d"," ");
            for(int j=s2.length()-1; j>=0; j--){
                System.out.print(s2.charAt(j));
            }
            System.out.print(" ");
        }





    }
}
