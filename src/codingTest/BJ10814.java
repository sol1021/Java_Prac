package codingTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BJ10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		String[][] person = new String[num][2];
		for(int i=0;i<num;i++) {
			person[i][0] = sc.next();
			person[i][1] = sc.next();
		}
		 Arrays.sort(person, new Comparator<String[]>() {
	            @Override
	            public int compare(String[] o1, String[] o2) {
	            	return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
	            }			
	        });
		 for(int i=0;i<num;i++) {
				System.out.println(person[i][0]+" "+person[i][1]);
		}
		sc.close();
	}

}