package old;

import java.util.Scanner;
/*
* The given program finds if the left half and the right half of a given string is
* same or not. If the string is odd length then it is automatically rejected. For
* even length strings, we perform the check
*
* Sample i/p :
* abbaabba
* o/p :
*true
*
* Sample i/p :
* ababaabb
 * o/p :
 * false
* */
public class Day1 {
    public static void main(String[] args) {
        /*       ****first way****       */
        Scanner scanner=new Scanner(System.in);
        //take input string
        String input=new String();
        input=scanner.nextLine();
        char chars[]=new char[input.length()];
        //convert it to char array
        chars=input.toCharArray();
        int split=chars.length/2;
        int flag=1;
        if(chars.length%2==0){//even length string
            //check if its equal
            for (int i=0;i<split;i++){
                if(chars[i]==chars[i+split]&&flag==1){
                    int x=i+split;
                    /*System.out.println("i i+split chars[i] chars[i+split] "+i
                            +" "+x+" "+chars[i]+" "+chars[i+split]);*/
                    flag=1;
                }
                else {
                    flag=0;
                }
            }
        }else {//odd length string
            flag=0;
        }

        //print true, false or invalid
        if(chars.length==0){
            System.out.println("invalid(length 0)");
        } else {
        if(flag==1){
            System.out.println("true");
        }
        else if(flag==0){
            System.out.println("false");
        }}

        /*       ****second way****       */
        //take input
        input=scanner.nextLine();
        split=input.length()/2;
        //for even length
        if(input.length()%2==0&&input.length()!=0){
            String firstHalf;
            String secondHalf;
            firstHalf=input.substring(0,split);
            secondHalf=input.substring(split,input.length());
            /*System.out.println("input firstHalf secondHalf "+input+" "+firstHalf+" " +
                    ""+secondHalf);*/
            //check if equal
            if (firstHalf.equalsIgnoreCase(secondHalf)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }else{//odd length
            System.out.println("false");
        }

    }
}
