package com.example.prime;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		prime(n);
	}
		public static int prime(int n)
		{
			String primenumber = " ";
		for(int i = 1; i < n; i++) {
			int count = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					count = count + 1;
				}

			}
			if (count == 2) {
				primenumber = primenumber + i + " ";

			}

		
			
		}

		System.out.println(primenumber);
		return n;

		
		}
}
