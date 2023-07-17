
package ex4;

import java.util.Scanner;


public class Ex4 {
public int password(String s){
    int l=s.length();
    int cap=0,num=0;
    if(l<4)
        return 0;
    if(s.charAt (0) >= '0' && s.charAt (0) <= '9')
      return 0;
    for(int i=0;i<l;i++){
	if (s.charAt (i) == ' ' || s.charAt (i) == '/')
	  return 0;
	if (s.charAt (i) >= 'A' && s.charAt (i) <= 'Z')
	  cap++;
	if (s.charAt (i) >= '0' && s.charAt (i) <= '9')
	  num++;
      }
    if (cap > 0 && num > 0)
        return 1;
    else
      return 0;
  
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ex4 e=new Ex4();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password");
        String s1=sc.next();
        int k=e.password(s1);
        if(k==1){
            System.out.println("password correct");
        }
        else{
            System.out.println("incorrect password");
        }
    }
    
}
