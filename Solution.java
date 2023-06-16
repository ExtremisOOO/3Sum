class Solution {
    public static  List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        int j,k,target = 0;
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>(); 

        for (int i = 0; i < nums.length; i++) {
            j=i+1;
            k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }else if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        output.addAll(s);
        return output;
    }
}