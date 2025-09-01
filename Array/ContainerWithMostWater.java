public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int n =heights.length;
        int area=0;
        int MaxArea=0;
        int left =0,right =n-1;
        while(left<right){
            int height = Math.min(heights[left],heights[right]);
            int breadth=right-left;
            area=height*breadth;
             MaxArea=Math.max(area,MaxArea);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(MaxArea);
    }
}
