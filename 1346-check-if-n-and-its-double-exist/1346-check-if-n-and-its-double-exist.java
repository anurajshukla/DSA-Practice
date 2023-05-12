class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            int a = 2*arr[i];
            int s=0, e=arr.length-1;
            while(e>=s) {
                int mid = s + (e - s) / 2;
                if (arr[mid] == a && mid != i)  {return true;}
                if (arr[mid] < a) {s = mid + 1;}
                else {e = mid - 1;}
            }
        }
        return false;
    }
}