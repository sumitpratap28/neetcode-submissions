class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int left =0;
        int right = matrix[0].length*matrix.length-1;
        int r=0;
        int c=0;

     while(left<=right){

        int mid = left+(right-left)/2;
        
        r = mid/matrix[0].length;
        c = mid%matrix[0].length;

      int val = matrix[r][c];
      
      if(val==target){

        return true;
      }
      
      if(val>target){

       right--;
      }
       
      
      if(val<target){

        left++;
      }



      }
    return false;

    }
}
