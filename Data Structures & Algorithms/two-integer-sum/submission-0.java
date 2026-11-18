class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();

        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target && i != j){
                    arr.add(i);
                    arr.add(j);

                    return new int[]{arr.get(0), arr.get(1)};
                }
            }
        }

        return new int[]{};
    }
}
