class Solution {
    public void sortColors(int[] nums) {
       int lo=0;
       int high=nums.length-1;
       int mid=0;
        int temp;
        while(mid<=high)
        {
            switch(nums[mid]){
                case 0:
                    {
                        temp=nums[lo];
                        nums[lo]=nums[mid];
                        nums[mid]=temp;
                        lo++;
                        mid++;
                        break;
                    }
                case 1:
                    {
                        mid++;
                        break;
                    }
                case 2:
                    {
                        temp=nums[mid];
                        nums[mid]=nums[high];
                        nums[high]=temp;
                        high--;
                        break;
                    }
            }
                
        }// soring 0,1,2 using duch flag algoritm
    }
}
