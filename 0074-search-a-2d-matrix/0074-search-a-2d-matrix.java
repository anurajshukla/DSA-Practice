class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length, m=matrix[0].length;
        int s = 0, e= (n*m)-1, mid=0;
        while(e>=s) { 
        mid = s + (e-s)/2;
        if(matrix[mid/m][mid%m] == target) { return true;}
        if(matrix[mid/m][mid%m] < target) { s = mid +1;}
        else { e = mid -1;}
        }
        return false;     
}
}