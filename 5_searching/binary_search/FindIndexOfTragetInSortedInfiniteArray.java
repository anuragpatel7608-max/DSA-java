// https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/

public class FindIndexOfTragetInSortedInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100};
        int target = 10;
        System.out.println(search(arr, target));
        

    }

    public static int search(int[] arr ,int target){
        int s =0,e=1,ans=-1;

        //finding the range the in which the target might be in between
        while(target > arr[e]){
            int newStart=e+1;
            //double the size of the box
            //e =previous end + sizeofBOx *2;
            e= e + ((e-s)+1)*2;
            s=newStart;
           
        }

        //finding the target in the finded range above
        while (s<=e) {
            int mid =s +(e-s)/2;
            if(target==arr[mid]){
                ans =mid;
                return ans;
            }else{
                if(target > arr[mid]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
        }

        return ans;
    }
}
