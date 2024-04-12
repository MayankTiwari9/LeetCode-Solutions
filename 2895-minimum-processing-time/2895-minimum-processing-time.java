class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime); 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        for(int t : tasks){
            pq.offer(t);
        }
        int ans = 0;
        int max = 0;
        int i = 0;
        while(!pq.isEmpty()){
            max = Math.max(max,(pq.poll()+processorTime.get(i)));
            max = Math.max(max,(pq.poll()+processorTime.get(i)));
            max = Math.max(max,(pq.poll()+processorTime.get(i)));
            max = Math.max(max,(pq.poll()+processorTime.get(i)));
            i++;
            ans = Math.max(ans,max);
        }
        return ans;
    }
}