package com.kodilla;

public class Palindrome {

    public static boolean checkWord(String word){
        String result = "";
        for(int i = word.length()-1; i >= 0; i--){
            result += word.charAt(i);
        }
        System.out.println(result);

        boolean isPalindrome;
        if (result.equalsIgnoreCase(word)) {
            isPalindrome = true;
        }else{
            isPalindrome = false;
        }
        return isPalindrome;
    }
}

class Main {

    public static void main (String[] args) throws java.lang.Exception{

        System.out.println(Palindrome.checkWord("Robert"));
        System.out.println(Palindrome.checkWord("Anna"));
    }
}
