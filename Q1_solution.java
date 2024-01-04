class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> counter = new HashMap<>();
        for(int num : nums){
            counter.put(num, counter.getOrDefault(num, 0)+1);
        }
        for(int c : counter.values()){
            if(c == 1)
                return -1;
            ans+= Math.ceil((double)c/3);
        }
        return ans;
    }
    
}
