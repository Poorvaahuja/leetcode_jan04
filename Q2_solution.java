class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0, result =0; // initialized the value to be returned
        Map<Integer, Integer> preSum = new HashMap<>(); //created a hashmap to keep the frequency of each cumulative sum
        preSum.put(0,1); // initialize the map with the base case: a cumulative sum of 0 has occurred once.
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(preSum.containsKey(sum -k)){ // for each cumulative sum, if the value sum-k, already occurs, increase its count
                result += preSum.get(sum -k); // add that frequency count to the final answer
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) +1);
        }
        return result; //ultimately got the number of subarrays which can sum upto k
    }
}
