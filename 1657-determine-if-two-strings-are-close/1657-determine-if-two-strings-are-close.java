class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        Set<Integer> set = new HashSet<>();
        int a[] = new int[26]; int b[] = new int[26];
        for(char c : word1.toCharArray()) {
            a[c - 'a']++;
            set.add(c - 'a');
        }
        for( char c : word2.toCharArray() ) {
            if(set.contains(c - 'a')) b[c - 'a']++;   
        }
        Arrays.sort(a); Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}