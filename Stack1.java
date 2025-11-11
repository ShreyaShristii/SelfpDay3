import java.util.*;
public class Stack1 {
    public static void main(String args[]){
Stack<Character> stack=new Stack<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter String to check ");
String s=sc.nextLine();
char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++){
    if(ch[i]=='{' || ch[i]=='[' || ch[i]=='('){
        stack.push(ch[i]);
    }
    else{
        if(stack.isEmpty()) System.out.println("False");
        char top=stack.pop();
        if((ch[i]==']'&&top=='[')|| (ch[i]==')'&&top==')')||(ch[i]=='}'&&top=='{') )
System.out.println("true");
    }
}
System.out.println(stack.isEmpty());
    }
}
