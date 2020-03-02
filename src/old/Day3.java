package old;

import java.util.Scanner;
/*
 * Program to find the LCM of two #'s
 *
 *Sample i/p :
 *360 240
 *o/p :
 *720
 *
 *Sample i/p :
 *2104 11
 *o/p :
 *23144
 *
 * */
public class Day3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2, lcm = 0;
        //take two #'s from console
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        //find highest #
        if(num1>=num2)
            lcm=num1;
        else
            lcm=num2;
        //start checking for lcm from highest # b/w num1 and num2
        for(int i=0; i>-1;i++){
            if(lcm%num1==0&&lcm%num2==0){
                break;
            }
            else lcm++;
        }
        System.out.println(lcm);
    }
}
