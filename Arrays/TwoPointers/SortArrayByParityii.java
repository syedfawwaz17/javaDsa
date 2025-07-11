public class SortArrayByParityii {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        Solution solution = new Solution();
        int[] sortedArray = solution.sortArrayByParityII(nums);
        System.out.print("Sorted array by parity II: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
    
}
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0,odd=1;
        while(even<nums.length && odd<nums.length){
            if(nums[even]%2==0)
            even +=2;
            else if(nums[odd]%2!=0)
            odd += 2;
            else{
                int temp = nums[even];
                nums[even]=nums[odd];
                nums[odd]=temp;
                even += 2;
                odd += 2;
            }
            
        }
        return nums;
    }
}