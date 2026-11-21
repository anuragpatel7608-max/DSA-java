//Geeks for Geeks (Find the number of rotation in rotated array)

class RotationCount {

    public static int rotationCount(int[] nums){

        int s =0,e=nums.length-1;
        //finding the peak (pivot)
        
        while(s<=e){
            int mid =s+(e-s)/2;
            if(mid < e && nums[mid] > nums [mid+1]){
                return mid;
            }if(mid > s && nums[mid] < nums[mid-1]){
                return mid-1;
            }if(nums[mid] <= nums[s]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums ={5,6,0,1,2,3,4};
        //Number Rotations is pivot index +1;
        int numberOfRotation =rotationCount(nums) +1;
    }

}
