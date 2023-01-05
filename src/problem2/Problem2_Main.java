package problem2;

import java.util.Arrays;

public class Problem2_Main {

    // TODO: check palindrom
    public static void main(String[] args) {
        System.out.println(checkPalindrom(123));
    }
    private static boolean checkPalindrom(int number){
        if(number>=Math.pow(-2.0,31) && number<=Math.pow(2.0,31)-1)
        {
            String temp=Integer.toString(number);
            char temp1[]=new char[temp.length()];
            for(int i=0;i<temp.length();i++)
            {
                temp1[i]=temp.charAt(temp.length()-1-i);
            }
            String temp2= String. valueOf(temp1);
            System.out.println(temp);
            System.out.println(temp2);
            if(temp.equals(temp2))
                return true;
            else
                return false;
        }
        else
        {System.out.println("Number out of accepted range");}
        return false;
    }

}
