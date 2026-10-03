class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1){return false; }
        HashSet<Integer> check_d = new HashSet<>();
        for(int n : nums){
            if(check_d.contains(n)){
                return true;
            } else{
                check_d.add(n);
            }
        }
        return false;
    }
}