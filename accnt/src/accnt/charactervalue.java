package accnt;

import java.util.Scanner;

public class charactervalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print((char)a[i]+ " ");
		}

	}

}
