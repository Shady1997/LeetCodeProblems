package problem4;

public class Problem4_Main {

    public static void main(String[] args) {

    }

    private String longestCommonPrefix(String[] strs){
        String stringCommon="";
       for(int i=0;i<strs[0].length();i++)
       {
           String temp=strs[0].substring(0,i);
           for(int j=0;j<strs.length;j++)
           {
               if(temp.equals(strs[j].substring(0,i)))
                     stringCommon=temp;
               else  stringCommon="";
           }
       }
    }
}
