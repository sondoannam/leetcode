import java.util.HashMap;

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int k = target - nums[i];
            if (map.containsKey(k) && map.get(k) != i) {
                return new int[]{i, map.get(k)};
            }
        }

        return new int[]{-1, -1};
    }
}
