
public class Loop2 {
	public static void main(String[] args) {
		int total = 0;
		for(int x = 1; x <= 1000; x++) {
			total += x;
			if(total == 2)
				break;
		}
		
		System.out.println(total);
	}
}
