package old;

import java.util.Scanner;

/*
 * Program to extract ony alphabets from String
 *
 *Sample i/p :
 *da$#jdn. jS.sd .345 s2123
 * o/p :
 *dajdnjSsds
 *
 * */
public class ExtractAlpha {
    public String getOnlyAlpha(String s){
        String ret="";
        ret=s.replaceAll("[^A-Za-z]+", "");
        return ret;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=new String();
        s=scanner.nextLine();
        ExtractAlpha extractAlpha=new ExtractAlpha();
        System.out.println(extractAlpha.getOnlyAlpha(s));
    }
}
