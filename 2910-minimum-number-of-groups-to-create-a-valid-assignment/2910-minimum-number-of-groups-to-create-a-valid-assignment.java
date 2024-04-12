class Solution {
    public int minGroupsForValidAssignment(int[] balls) {
        Map<Integer, Integer> f=new HashMap<>();
        for(int num: balls) {
            f.put(num, f.getOrDefault(num, 0) + 1);
        }
        int minf=Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> e: f.entrySet()) {
            minf=Math.min(minf, e.getValue());
        }
        minf++;
        int res=-1;
        while(minf>=1) {
            res=check(f, minf);
            if(res!=-1) return res;
            minf--;
        }
        return balls.length;
    }
    int check(Map<Integer, Integer> f, int m) {
        int r=0;
        for(Map.Entry<Integer, Integer> e: f.entrySet()) {
            if(e.getValue()%m==0) {
                r+=(int)Math.ceil((double)e.getValue()/m);
            }else if(e.getValue()/m>=m-1-e.getValue()%m){
                r+=e.getValue()/m+1;
            }else return -1;
        }
        return r;
    }
}