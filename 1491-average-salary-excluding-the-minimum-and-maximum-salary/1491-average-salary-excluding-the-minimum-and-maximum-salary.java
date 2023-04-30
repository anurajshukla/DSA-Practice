class Solution {
    public double average(int[] salary) {
        if(salary.length == 2) return 0;
        Arrays.sort(salary);
        double sum=0;
        for(int i=1; i<salary.length-1; i++) {
            sum = sum + salary[i];
        }
        return sum/(salary.length-2);
    }
}