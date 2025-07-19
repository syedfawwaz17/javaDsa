public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution solution = new Solution();
        int result = solution.maxArea(height);
        System.out.println("Maximum area of water container: " + result);
    }
}
    class Solution {
        public int maxArea(int[] height) {
            int max_area=0;
            int l=0,h=height.length-1;
            while(l<h){
                int ch = Math.min(height[l],height[h]);
                int width=h-l;
                int area = ch*width;

                max_area=Math.max(area,max_area);


                if(height[l]<height[h])
                    l++;
                else
                    h--;
            }
            return max_area;
        }
    }