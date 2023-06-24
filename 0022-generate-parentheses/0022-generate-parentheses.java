class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack("", n, n, list);
        return list;
    }
    public void backtrack(String s, int st, int e, List<String> list) {
        if(st > e) { return; }
        if(st > 0) { backtrack(s + "(", st-1, e, list); }
        if(e > 0) { backtrack( s + ")", st, e-1, list); }
        if(st ==0 && e==0) { list.add(s); }
    }
}