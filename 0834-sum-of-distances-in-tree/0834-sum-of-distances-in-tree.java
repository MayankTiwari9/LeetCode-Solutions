class Solution {
    int[] res;
    int[] cnt;
    ArrayList<HashSet<Integer>> list;
    
    private void solveDFS(int root, int pre){
        for(int i : list.get(root)){
            if(i == pre)
                continue;
            
            solveDFS(i, root);
            cnt[root] += cnt[i];
            res[root] += res[i] + cnt[i];
        }
        
        cnt[root]++;
    }
    
    private void solveDFS2(int root, int pre){
        for(int i : list.get(root)){
            if(i == pre)
                continue;
            
            res[i] = res[root] - cnt[i] + cnt.length - cnt[i];
            solveDFS2(i, root);
        }
    }
    
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        list = new ArrayList<HashSet<Integer>>();
        
        for(int i = 0; i < n; i++)
            list.add(new HashSet<Integer>());
        
        for(int[] edge : edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        
        res = new int[n];
        cnt = new int[n];
        
        solveDFS(0, -1);
        solveDFS2(0, -1);
        
        return res;
    }
}