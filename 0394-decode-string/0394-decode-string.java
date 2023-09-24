class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int currentNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(currentNum);
                strStack.push(currentStr);
                currentNum = 0;
                currentStr = new StringBuilder();
            } else if (ch == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder decodedStr = new StringBuilder(strStack.pop());
                for (int i = 0; i < repeatTimes; i++) {
                    decodedStr.append(currentStr);
                }
                currentStr = decodedStr;
            } else {
                currentStr.append(ch);
            }
        }

        return currentStr.toString();
    }
}