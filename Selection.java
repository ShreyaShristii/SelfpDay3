import java.util.*;

public class Selection{
    public static void main(String[] args) {
        int[] arr={23,10,11,45,2,90,23,-1,0};
       
        for(int i=0;i<arr.length;i++){
 int minIndex=i;
 for(int j=i+1;j<arr.length;j++){
if(arr[j]<arr[minIndex]){
    minIndex=j;
}
 }
 if(minIndex!=i){
    swap(arr,i,minIndex);
 }
        }
            System.out.println(Arrays.toString(arr));  
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}