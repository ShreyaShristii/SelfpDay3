//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Give:_");
//         String str=s.nextLine();
//         StringBuilder sb=new StringBuilder(str);
//         for(int i=sb.length()-1;i>=0;i--){
//             System.out.print(sb.charAt(i));
//         }
//     }
// }
import java.util.*;
public class Reverse{
    public static void  main(String args[]){
        int[] a={23,0,1,-215,43,21,10};
        // int min=a[0];
        // for(int i=1;i<a.length;i++){
        //     if(min>a[i]){
        //         min=a[i];
        //     }
        // }
        // System.out.print(min);
        // for(int i=0;i<a.length-1;i++){
        //    int min=a[i];
        //    for(int j=i+1;j<a.length;j++){
        //     if(a[j]<min){
        //         min=a[j];
        //     a[i]=min;
        //     }
        //    }
        // }
        // System.out.print(Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}