class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        Arrays.fill(output,1);
        int pre=1,post=1;
        for(int i=0;i<nums.length;i++){
            output[i]=pre;
            pre=nums[i]*pre;
        }
        for(int i=nums.length-1;i>=0;i--){
            output[i]=output[i]*post;
            post=nums[i]*post;
        }
        return output;
    }
}
