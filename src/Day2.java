import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Anagram code
public class Day2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        Map< Character,Integer> hm = new HashMap< Character,Integer>();
        for (char c: a.toCharArray()) hm.merge(c, 1, Integer::sum);
        for (char c: b.toCharArray()) hm.merge(c, -1, Integer::sum);
        int[] fal = new int[1];
        hm.forEach((id, name) -> { fal[0] = name.intValue()!=0?1:0; });
        System.out.println(fal[0]!=0?"false":"true");
    }
}
