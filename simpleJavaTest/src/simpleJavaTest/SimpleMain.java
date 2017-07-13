package simpleJavaTest;

public class SimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("æ»≥Á2222222");
		System.out.println("«œ¿Ã~πÊ2222");

		int cnt = 0;
		for (int i = 1; i <= 50; i++) {

			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
				cnt++;
			if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				cnt++;
			}

			if (cnt == 1) {
				System.out.print("¬¶! ");
			} else if (cnt == 2) {
				System.out.print("¬¶¬¶! ");
			} else {
				System.out.print(i + " ");
			}
			cnt=0;

		}
	}

}
