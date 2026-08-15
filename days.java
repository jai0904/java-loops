import java.util
class days
{
 public static void main(String args[])
 {
 int day,yr,mth,wk,rday=0;
 Scanner ob=new Scanner(System .in);
 System .out.print("enter no of days");
 days=ob.nextint();
 if(day>=365)
 {
 yr=day/365;
 rday=day%365;
 System.out.print("\nyears:-"+yr);
 }
 if(day>=30)
 {
 mth=rday/30;
 rday=rday%30;
 System.out.print("\nMonth :-"+mth);
 }
 if(rday>=7)
 {
 wk=rday/7;
 rday=rday%7;
 System.out.print("\nWeeks:-"+wk);
 }
 if(rday>0)
    System.out.print("\nRemaining days:-"+rday);
	System.out.print("\n\n");
	}
}