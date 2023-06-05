class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int a = coordinates[1][0] - coordinates[0][0];
        int b = coordinates[1][1] - coordinates[0][1];
        for(int i=1; i<coordinates.length; i++){
            int x = coordinates[i][0] - coordinates[i-1][0];
            int y = coordinates[i][1] - coordinates[i-1][1];
            if(y * a != x * b) return false;
        }  
        return true;
    }
}