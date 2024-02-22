class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] ans=new int[2];
        int i=1;
        //adding first value of array into hashmap then iterating through array 
        //to get every ele and compare if hashMap contains target-array ele
        //then just adding its index into ans array and return the ans array
        hashMap.put(nums[0],0);
        while (i<nums.length){
            if(hashMap.containsKey(target-nums[i])){
                   ans[0]=hashMap.get(target-nums[i]);
                   ans[1]=i;
                   break;
            }
            else{
                hashMap.put(nums[i],i);
                i++;
            }
        }  
        return ans;      
    }
}