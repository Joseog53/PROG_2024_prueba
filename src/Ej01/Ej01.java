package Ej01;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese un valor para n: ");
	
	int n = teclado.nextInt();
	
	for(int i=0;i<n;i++) {
		
		for(int j=0;j<n;j++) {
			
			if(i==0||i==n-1||j==0||j==n-1) {
				
				System.out.print("* ");
			}
			
			else {
				
				System.out.print("  ");
				
			}
		}
		
		System.out.println();
	}
	
	teclado.close();
	
	}

}
