package Day2;

public class UnderstandHeap {
	
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnderstandHeap obj1 = new UnderstandHeap();
		obj1.n=12;
		UnderstandHeap obj2 = obj1;
		obj2.n=17;
		System.out.println(obj1.n); //both obj1 and obj2 point at same memory which is in heap memory
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
