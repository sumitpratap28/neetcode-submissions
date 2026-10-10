class Solution {
    public int[] twoSum(int[] numbers, int target) {
       
        //[1,2,3,4]
       // 3
       // value return karni hai 1,2

        
        int left =0;
        int right =numbers.length-1;

        while(left<right){

            int val = numbers[left]+numbers[right];

            if(val ==target){

                return new int[]{left+1,right+1};
            }
            if(val>target){

                right--;
            }
            if(val<target){
                left++;
            }

        }


        return new int[]{-1,-1};

    }
}
