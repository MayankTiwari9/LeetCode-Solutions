class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            boolean canHaveGreatest = true;
            for (int j = 0; j < candies.length; j++) {
                if (candies[i] + extraCandies < candies[j]) {
                    canHaveGreatest = false;
                    break;
                }
            }
            list.add(canHaveGreatest);
        }

        return list;
    }
}