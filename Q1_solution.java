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
// Initialized the value to be returned as zero(ans), iterating through the values in array, added the count in the hashmap, now for frequencies in the hashmap, added the ceil value in ans as if the count is not divisible by 2 or 3 still they can be removed by doing 3-4 operations. If the count of any key is 1, then there is no way to remove it, thus returned -1.
