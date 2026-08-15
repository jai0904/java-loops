import java.util*;
class nest_max
{
 public static void main(String args[])
 {
 int a,b,c;
 Scanner ob=new Scanner(System.in);
 System.out.print("enter the no of A");
 a=ob.nextInt();
 System.out.print("enter no of B");
 b=ob.nextInt();
 System.out.print("enter no of C");
 c=ob.nextInt();
 if(a>b)
  {
  if(a>c)
   System.out.print("a is max");
   else
     System.out.print("c is max");
	}
	else if(b>c)
	System.out.print("b is max");
	else
	System.out.print("c is max");
	
	System.out.print("\n\n");
	}
}
