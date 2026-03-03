/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class StringSandbox1 {
    public static void main(String[] args) {
    	String s1 = new String("Java Programming with Strings.");
        String s2 = new String("There is more to the String class in Java than a standard C Language C-String.");
        String s3 = new String((s1.concat(" ")).concat(s2));
    	System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        if(s3.contains("class")) {
            System.out.println("Yes, the string contains the term \"class\".");
        } else {
            System.out.println("No, the string does not contain the term \"class\".");
        }
    }
}
