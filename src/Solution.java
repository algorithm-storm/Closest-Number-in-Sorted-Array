public class Solution {


   public static void main(String [] args){

       int[] data = {1,4,6,8};
        Solution a = new Solution();
        System.out.print(a.closestNumber(data,3));

    }


    /*
     * @param A: an integer array sorted in ascending order
     * @param target: An integer
     * @return: an integer
     */
    public int closestNumber(int[] A, int target) {
        // write your code here

        if( A == null){
            return -1;
        }
        int index = firstClosetNumber(A,target);

        if(index == 0){
            return 0;
        }
        if(index == A.length){
            return index -1;
        }
        if(target - A[index-1] < A[index] - target){
            return index -1;
        }
        else {
            return index;
        }
    }

    private int firstClosetNumber(int[] A, int target){

        int start = 0;
        int end = A.length - 1;
        while(start +1 < end){
            int mid = (end - start) / 2 + start;
            if(A[mid] == target){
                end = mid;
            }
            if(A[mid]< target){
                start = mid;
            }
            if(A[mid]> target){
                end = mid;
            }
        }
        if(A[start] >= target){
            return start;
        }
        if(A[end] >= target){
            return end;
        }
        return A.length;
    }
}
