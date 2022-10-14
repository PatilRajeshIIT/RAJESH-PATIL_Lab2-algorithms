package com.greatlearning.problem1;

import java.util.Scanner;

public class TargetsAchieved {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		// Get number of transaction from user
		System.out.println("Enter the size of transaction array : ");
		int size = sc.nextInt();
		int array[] = new int[size];

		// Get values of transactions from user
		System.out.println();
		System.out.println("Enter values of " + size + " transactions : ");
		for (int i = 0; i < size; i++)
			array[i] = sc.nextInt();

		// Get number of targets that must be achieved & display whether it is achieved
		// or not
		System.out.println();
		System.out.println("Enter the total number of targets that needs to be achieved : ");
		int targetNo = sc.nextInt();
		if (targetNo <= size) {
			System.out.println("Given number of targets is achieved.");
		} else {
			System.out.println("Given number of targets is not achieved.");
		}

		// Get targeted Value from user & display whether it achieved or not
		while (targetNo-- != 0) {
			int flag = 0;
			long target;

			System.out.println();
			System.out.println("Enter the value of target : ");
			target = sc.nextInt();
			long sum = 0;

			for (int i = 0; i < size; i++) {

				sum = sum + array[i];

				if (sum >= target) {
					System.out.println("Targeted value is achiedved afetr " + (i + 1) + " transactions.");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given targeted value is not achieved.");
			}
			
		}

	}

}
