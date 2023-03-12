import java.util.Scanner;

public class java_password_generator
{
	static void generate_password(char[] password)
	{
		char[] symbs = "qwertyuiop[]{}adsfghjkl;'\"zxcvbnm,./<>?-+`~!@#$%^&*1234567890()QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
		
		for (int i = 0; i < password.length; i++)
		{
      int index = (int)(Math.random() * password.length);
      
			password[i] = symbs[index];
		}
	}
	
	static void show_password(char[] password)
	{
		for (char x: password)
		{
			System.out.print(x);
		}
		
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length of passwod: ");
		int len = scanner.nextInt();
		
		char[] password = new char[len];
		
		generate_password(password);
		
		show_password(password);
	}
}