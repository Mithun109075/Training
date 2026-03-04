package day5;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();

        //1.length()
        System.out.println("Length:"+str.length());
        //2.toUppercase()
        System.out.println("Upper case:"+str.toUpperCase());
        //3.toLowerCase()
        System.out.println("Lower case:"+str.toLowerCase());
        //4.charAt()
        System.out.println("character at index:"+str.charAt(2));
        //5.substring(begin,end
        System.out.println("substring:"+str.substring(0,4));
        //6.concat or '+'
        String str1="Alien Force";
        System.out.println("concat:"+str.concat(str1));
        System.out.println("using+"+str+str1);
        //7.equals()
        System.out.println("Equals:"+str.equals("Ben 10"));
        //8.equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("ben 10"));
        //9.replace(old,new)
        System.out.println(str.replace("10","Ten"));
        //10.trim()
        String speed=" "+str+" ";
        System.out.println(speed.trim());
        //11.startsWith()
        System.out.println(str.startsWith("B"));
        //12.endsWith()
        System.out.println(str.endsWith("B"));
        //13.indexof()
        System.out.println(str.indexOf('e'));
        //14.compareTo()
        System.out.println(str.compareTo("Ben 10"));
        //15.split()
        String[] words=str.split(" ");
        for(String word: words){
            System.out.println(word);
        }
        //16.isLetter() 17.isDigit()
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
                System.out.println(c+" is a letter");
            }
            else if(Character.isDigit(c)){
                System.out.println(c+" is a Digit");
            }
            else{
                System.out.println(c+ "Neither a letter nor a digit");
            }
        }

    }
}
