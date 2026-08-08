import java.util.*;
class Solution 
{
    List<String> result = new ArrayList<>();
    String[] map = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs", 
        "tuv",
        "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
        {
            return result;
        }
        backtrack(digits,0,new StringBuilder());
        return result;

    }
    private void backtrack(String digits, int index, StringBuilder current){
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = map[digit];

        for(int i = 0; i<letters.length(); i++)
        {
            current.append(letters.charAt(i));

            backtrack(digits, index+1, current);

            current.deleteCharAt(current.length()-1);
        }

    }
}