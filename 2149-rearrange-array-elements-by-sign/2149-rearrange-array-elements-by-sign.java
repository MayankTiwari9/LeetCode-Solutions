class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0)
                posList.add(nums[i]);
            else
                negList.add(nums[i]);
        }
        
        int idx = 0;
        int posIdx = 0;
        int negIdx = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(i < posList.size())
                nums[idx++] = posList.get(posIdx++);
            
            if(i < negList.size())
                nums[idx++] = negList.get(negIdx++);
        }
        
        return nums;
    }
}