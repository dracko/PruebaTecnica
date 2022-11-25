package m2;

import java.util.Scanner;

public class Uunooo {
	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = new int[3];
		
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			if(a[i] >= 1 && a[i] <= 100) {
				a[i] = a[i];
									
			}else {
				System.exit(0);
			}
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
			if(b[i] >= 1 && b[i] <= 100) {
				b[i] = b[i];
									
			}else {
				System.exit(0);
			}
		}
		int aa = 0;
		int bb = 0;
		for (int i = 0; i < a.length; i++) {
				if (a[i] > b[i]) {
					aa = aa +1;
				}
				if (a[i] < b[i]) {
					bb = bb +1;
				}
							
		}
		
		System.out.println(aa+" "+bb);
}
}