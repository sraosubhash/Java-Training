package Day2;

import java.net.PortUnreachableException;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		
		int[] a = new int[]{10,22,52,43,19};
		
//		for(int i=0; i<a.length;i++) {
	//		System.out.println(a[i]);
		//}
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
