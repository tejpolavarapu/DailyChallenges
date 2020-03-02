package old;

import java.util.Scanner;
/*
* Program to find the HCF of two #'s
*
* Sample i/p :
* 36 24
* o/p :
* 12
*
* Sample i/p :
* 27 101
* o/p :
* 1
*
* */
public class Day2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1, num2, hcf=-1;
        //take two #'s from console
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        //put the smallest # in num1
        if(num1>=num2){
            int x=num1;
            num1=num2;
            num2=x;
        }
        //flag=0 => hcf not found
        int flag=0;
        for (int i=num1;i>0;i--){//run from num1 till 1 for hcf
            //if # % i is 0 => # is divisible by i
            if((num1 % i) == 0 && (num2%i) == 0 && flag==0){
                hcf=i;//hcf found
                flag=1;//set flag to 1
                /*break; //we can use break if we dont wanna use flag*/
            }
        }
        //output hcf
        System.out.println(hcf);
    }
}
