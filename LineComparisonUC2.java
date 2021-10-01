import java.util.Scanner;
class LineComparisonUC2
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Line computation Program");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the co-ordinates of first point for First line: ");
		int x1=scanner.nextInt();
		int y1=scanner.nextInt();
		System.out.println("Enter the co-ordinates of second point for First line: ");
		int x2=scanner.nextInt();
		int y2=scanner.nextInt();
		System.out.println("Enter the co-ordinates of first point for Second line: ");
		int a1=scanner.nextInt();
		int b1=scanner.nextInt();
		System.out.println("Enter the co-ordinates of second point for Second line: ");
		int a2=scanner.nextInt();
		int b2=scanner.nextInt();
		float length1, length2;
		length1 = (float)Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
		length2 = (float)Math.sqrt((Math.pow((a1 - a2), 2)) + (Math.pow((b1 - b2), 2)));
		System.out.println("Length of lines are : " + length1 + " & " + length2);
		String s1=Float.toString(length1);
		String s2=Float.toString(length2);
		if(s1.equals(s2))
			System.out.println("Both lines are Equal");
		else
			System.out.println("Both lines are not Equal");
	}
}