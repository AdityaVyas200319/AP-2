import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; 
            }
            set.add(num);
        }
        return false; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution(); 

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums2)); 
    }
}
