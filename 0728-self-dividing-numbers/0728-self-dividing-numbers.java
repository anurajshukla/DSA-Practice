class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(checkDivision(i)){
                l.add(i);
            }
        }
        return l;
    }

    public boolean checkDivision (int num){
        int n = num;
        while(n != 0){
            int r = n%10;
            if(r == 0 || num%r != 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}