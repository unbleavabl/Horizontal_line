import java.util.Scanner;
class Horizontal
{
	public static void main(String[] args)
	{
		Scanner u_inp = new Scanner(System.in);
		int n;
		System.out.print("Enter n : ");
		n = u_inp.nextInt();
		for (int i = 0; i < n; i++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
}
