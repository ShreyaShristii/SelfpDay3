public class BinarySearch {
    public static void main(String args[]){
        int[] arr={23,45,122,125,200,345,1111,5332};
        int left=0;
        int right=arr.length-1;
        int target=5332;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>target){
                
                right=mid-1;
            }
            else{
               left=mid+1; 
            }
        }
        //System.out.println()
    }
}
