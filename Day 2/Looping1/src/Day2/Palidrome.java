package Day2;

public class Palidrome {
	
	
	public static boolean IsPali(String string) {
        string = string.toLowerCase();
        int st = 0, end = string.length() - 1;
        while (st < end) {
            if (string.charAt(st) != string.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

	public static void main(String[] args) {
		   
        String str = "This is Subhash in non orggro malyalam env with dad.";
        String[] words = str.split("[^a-zA-Z]+");
        for (String w : words) {
            if (IsPali(w)) {
                System.out.println(w);
            }
        }
    }
 

}