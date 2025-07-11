public class RemoveDupromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        Solution solution = new Solution();
        int newLength = solution.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int inspos=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                inspos++;
                nums[inspos]=nums[i];
                
            }
                     
        }
        return inspos+1;
    }
}
