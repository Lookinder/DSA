package com.lookinder;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Lookinder";
        char  target = 'n';
        System.out.println(LinearString(name,target));

    }
    static boolean LinearString(String str, char ch){
        if(str.length() == 0){
            return false;
        }
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == ch){
//                return true;
//            }
//        }
        for(char cha: str.toCharArray()){
            if(cha == ch){
                return true;
            }
        }
        return false;
    }
}
