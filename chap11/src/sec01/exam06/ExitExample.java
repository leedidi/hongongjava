package sec01.exam06;

public class ExitExample {
	public static void main(String[] args) {
		for(int i=0; i<0; i++) {
			if(i == 5) {
				System.exit(0);
				//break;
			}
		}
		System.out.println("������ �ڵ�");
	}
}