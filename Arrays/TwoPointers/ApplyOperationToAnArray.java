public class ApplyOperationToAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 0, 4};
        Solution solution = new Solution();
        int[] result = solution.applyOperations(nums);
        System.out.print("Array after applying operations: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}

class Solution {
    public int[] applyOperations(int[] nums) {
        int res[] = new int[nums.length];
        
        for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            nums[i-1]=nums[i-1]*2;
            nums[i]=0;
            
        }

        }
        int index = 0;
      
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                res[index]=nums[i];
                index++;
            }
        }
        for(int i = index; i < nums.length ; i++){
            res[i] = 0;
        }
        

        
        return res;
        
    }
    
}
