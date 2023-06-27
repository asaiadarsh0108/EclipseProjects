package incedo;

public class NumberPattern {
	public static void main(String[] args) {
		int n=5;
		int num=1;
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				int x=num;
				for(int j=x;j<x+i;j++) {
					System.out.print(j+" ");
					num++;
				}
				System.out.println();
			}
			else {
				int y=num;
				for(int k=num+y-1;k<y;k--) {
					System.out.print(k+" ");
				}
				System.out.println();
			}
		}
	}
	
}
