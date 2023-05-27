class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> s1 = new HashSet();
        int max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!s1.add(s.charAt(right))) {
                s1.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}