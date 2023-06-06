class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0, e=numbers.length-1;
        while(s< e){
            int a = numbers[s], b = numbers[e];
            if(a+b> target) { e--; }
            else if(a+b < target) { s++; }
            else { break; }
        }
        return new int[] {s+1, e+1};
    }
}