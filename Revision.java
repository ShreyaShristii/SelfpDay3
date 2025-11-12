import java.util.Scanner;
public class Revision {
public static void main(String args[]){
//fl();
string();
}
    static void fl(){
    Scanner sc=new Scanner(System.in);
    System.out.println("How many elemnts? ");
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int t=4;
    int f=-1;int l=-1;
    for(int i=0;i<n;i++){
        if(a[i]==t){
            if(f==-1)f=i;
            l=i;
        }
    }
    System.out.println("First :"+f+" last: "+l);}
    static void string(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println(s+" "+sb);
        String rs=sb.reverse().toString();
        if(s.equals(rs)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        }
    
    }
    

