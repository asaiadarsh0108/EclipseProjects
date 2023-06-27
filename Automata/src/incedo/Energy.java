package incedo;

import java.util.Scanner;

public class Energy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalReadings= sc.nextInt();
		int[] energies= new int[totalReadings];
		for(int j=0;j<totalReadings;j++) {
			energies[j]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<totalReadings;i++) {
			sum+=energies[i];
		}
		System.out.println(sum);
	}
}
