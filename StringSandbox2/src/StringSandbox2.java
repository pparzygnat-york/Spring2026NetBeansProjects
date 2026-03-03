/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class StringSandbox2 {
    public static void main(String[] args) {
    	String s1 = new String("Java Programming with Strings.");
        String s2 = new String("There is more to the String class in Java than a standard C Language C-String.");
        String s3 = new String((s1.concat(" ")).concat(s2));
        String find = "Yes";
    	System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        if(s3.contains(find)) {
            System.out.println("Yes, the string contains the term \"" + find + "\".");
        } else {
            System.out.println("No, the string does not contain the term \"" + find + "\".");
        }
        
        /**
         * Given values print line-by-line the letter and its index (sample below).
         * Index: 0
         * Letter: B
         * Index: 1
         * ..
         * Letter: Z
         * Index: 25
         */
        String values = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Letter: " + values.charAt(i));
            System.out.println("Index: " + i);
        }
        
        
    }
    
}
