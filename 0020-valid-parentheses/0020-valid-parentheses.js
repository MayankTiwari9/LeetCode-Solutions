/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack = [];
    for(let i=0;i<s.length;i++){
        if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[' ){
            stack.push(s.charAt(i));
        }
        else{
            if(stack.length == 0){
                return false;
            }
            else if(matching(stack[stack.length-1], s.charAt(i)) == false)
                return false;
            else
                stack.pop();
        }
    }
        return stack.length == 0;
};

let matching = function(a,b){
    return ((a == '{' && b == '}') ||(a == '(' && b == ')') || (a == '[' && b == ']'));
}