import java.util.Scanner;
class Circle
{
	public static void main(String args[])
	{
	   
	   Scanner sc=new Scanner(System.in);
	   Double radius=0.0;
	   System.out.println("enter radius");
	   radius=sc.nextDouble();

	   double area=0.0;
	   double circumference=0.0;

	   System.out.println("radius entered by user =" + radius);

         area=Math.PI*radius*radius;
         System.out.println("Area of circle =" + area);

         circumference=2*Math.PI*radius;
         System.out.println("circumference =" + circumference);
	   	
	   
	   
	}
}