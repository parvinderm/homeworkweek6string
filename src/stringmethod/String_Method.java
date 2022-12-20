package stringmethod;

public class String_Method {
    public static void main(String[] args) {       //Declare Main Method
           String name = "Parvinder";
           String name1 = "Multani";    //Declare String

        System.out.println("Length of String is:"+name.length());   //Print Length of String
        //returns the char value at the given index number
        System.out.println("The char value at index 5 is : "+name.charAt(5));
        //Combines specified string at the end of this string
        System.out.println(name.concat(name1));
        //returns the String in lowercase letter
        System.out.println("Uppercase :"+name.toLowerCase());
        //returns the String to Uppercase letter
        System.out.println("Uppercase :"+name.toUpperCase());
        //Check if this String is empty
        System.out.println("If the String is empty:"+name.isEmpty());
        //check if this String start with given prefix
        System.out.println("String starts with given prefix :"+name.startsWith("P"));
        //Check if this String ends with given suffix
        System.out.println("String ends with given suffix:"+name.endsWith("r"));
        //returns true if characters are found in the String
        System.out.println("If chars found in the String:"+name.contains("P"));
        //Compares the content of two given String
        System.out.println("Compare two Strings:"+name.equals("name1"));
        //return index of given character value
        System.out.println("Index of given character:"+name.indexOf("v"));
        //returns a string replacing all the old char to new char
        System.out.println("Replacing old char to new char:"+name.replace("P","H"));
        //returns a part of the String
        System.out.println("A part of the string :"+name.substring(3));
        //converts this string into character array
        System.out.println("string into character : "+name.toCharArray());

        String name2 = "      Parvinder Multani    ";
        //eliminates leading and trailing spaces
        System.out.println(name2);
        System.out.println("eliminates :"+name2.trim());


    }
}