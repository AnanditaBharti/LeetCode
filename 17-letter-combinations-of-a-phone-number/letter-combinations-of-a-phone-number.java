class Solution {
    public void backtrack(String digits, int index, StringBuilder curr, List<String> list){
        if(index == digits.length()){
            list.add(curr.toString());
            return;
        }
        int num = digits.charAt(index) - '0';

        // System.out.println(num);

        String map = null;
        switch (num){
            case 2:
                map = "abc";
                break;
            case 3:
                map = "def";
                break;
            case 4:
                map = "ghi";
                break;
            case 5:
                map = "jkl";
                break;
            case 6:
                map = "mno";
                break;
            case 7:
                map = "pqrs";
                break;
            case 8:
                map = "tuv";
                break;
            case 9:
                map = "wxyz";
                break;

        }

        for(char c: map.toCharArray()){
            curr.append(c);
            backtrack(digits, index + 1, curr, list);
            curr.deleteCharAt(index);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        backtrack(digits, 0, new StringBuilder(), list);
        return list;
    }
}