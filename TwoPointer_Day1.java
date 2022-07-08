import java.util.*;

class TwoPointer_Day1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 5, 3, 4 };
        int target = 6;
        for (int num : twoSum(nums, target)) {
            System.out.println(num);
        }
    }
    // Time Complexity : O(n^2)
    // Space Complexity: O(1)
    // public static int[] twoSum(int[] nums, int target) {
    // int firstNumIndex = 0;
    // int secondNumIndex = 0;
    // for(firstNumIndex=0;firstNumIndex<nums.length-1;firstNumIndex++){
    // for(secondNumIndex=firstNumIndex+1;secondNumIndex<nums.length;secondNumIndex++){
    // if(nums[firstNumIndex]+nums[secondNumIndex]==target){
    // return new int[]{firstNumIndex,secondNumIndex};
    // }
    // }
    // }
    // return new int[]{-1,-1};
    // }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] twoSum(int[] nums, int target) {
        int index = 0;
        Map<Integer, Integer> indexToNumMap = new HashMap<>();
        for (index = 0; index < nums.length; index++) {
            if (indexToNumMap.containsKey(target - nums[index])) {
                return new int[] { indexToNumMap.get(target - nums[index]), index };
            }
            indexToNumMap.put(nums[index], index);
        }
        return new int[] { -1, -1 };
    }
}
