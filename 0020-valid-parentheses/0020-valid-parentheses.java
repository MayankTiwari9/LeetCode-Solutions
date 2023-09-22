class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i); 
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty() == true){
                    return false;
                }
                else if(matching(stack.peek(), c) == false){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    static boolean matching(char a, char b){
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }
}