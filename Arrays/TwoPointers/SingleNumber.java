import java.util.HashMap;
// Problem: https://leetcode.com/problems/single-number/
// Time Complexity: O(n)
// Space Complexity: O(n)
// Approach: Use a HashMap to count occurrences of each number
// If a number appears only once, return it
// Note: This solution assumes that there is exactly one number that appears only once
// and all other numbers appear exactly twice.

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Sol solution = new Sol();
        System.out.println("Single number is: " + solution.singleNumber(nums));
    }
}

class Sol {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else
            map.put(num,1);
        }

        for(int num : nums){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}