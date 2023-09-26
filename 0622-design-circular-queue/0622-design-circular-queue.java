class MyCircularQueue {
    ArrayList<Integer> arr;
    int size;

    public MyCircularQueue(int k) {
        arr = new ArrayList<>();
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(arr.size() < size){
            arr.add(0,value);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean deQueue() {
        if(arr.size() > 0){
            arr.remove(arr.size()-1);
            return true;
        }else{
            return false;
        }
    }
    
    public int Front() {
        if(arr.size() > 0) 
            return arr.get(arr.size()-1);
        else
            return -1;
    }
    
    public int Rear() {
        if(arr.size() > 0) 
            return arr.get(0);
        else
            return -1;
    }
    
    public boolean isEmpty() {
        return (arr.size() == 0);
    }
    
    public boolean isFull() {
        return (arr.size() == size);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */