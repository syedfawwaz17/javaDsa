public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        Solution solution = new Solution();
        int[] sortedArray = solution.sortArrayByParity(nums);
        System.out.print("Sorted array by parity: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
        int odd=nums.length-1;
        while(even<odd){
            if(nums[even]%2!=0 && nums[odd]%2==0){
                int temp = nums[even];
                nums[even]=nums[odd];
                nums[odd]=temp;

            
            }
            if(nums[even]%2==0)
                even++;
            if(nums[odd]%2!=0)
                odd--;
        }

        return nums;
    }

    
}
