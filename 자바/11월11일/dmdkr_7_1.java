package sam;

import java.util.Scanner;
import java.util.Vector;

public class dmdkr_7_1 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("정수 입력(-1이면 입력 끝)>>");
		 while (true) {
			 int num = sr.nextInt();
			 if(num == -1) {
				 break; 
			 }
			 v.add(num);
			 
		 }
		 
		 int min = v.get(0);
		 for(int i =1; i < v.size(); i++) {
			 if(v.get(i) < min)
				 min = v.get(i);
		 }
		 System.out.println("제일 작은 수는 " + min);
		 sr.close();
		 
	}
}
