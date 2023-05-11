class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a =0;
        for(String s: operations) {
            if(s.contains("--")) {a--;}
            else if(s.contains("++")) {a++; }
        }
        return a;
    }
}