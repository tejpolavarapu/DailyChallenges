import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] ret = new int[2];
        for (int i = 0; i< nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                ret[0] = map.get(target-nums[i]);
                ret[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ret;
    }
    public static void main(String[] args) {
        Day1 day1 = new Day1();
        int[] arr = new int[2];
        arr = day1.twoSum(new int[] {2,7,11,15},9);
        System.out.println(Arrays.toString(arr));
    }
}
