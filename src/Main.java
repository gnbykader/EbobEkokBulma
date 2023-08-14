import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n1,n2,ekok = 0,ebob = 0;
		Scanner inp = new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz: ");
		n1 = inp.nextInt();
		System.out.println("Bir Sayi Giriniz: ");
		n2 = inp.nextInt();
		
		int i = 1;
		while (i <= (n1*n2)) {
			if ((i%n1 == 0) && (i%n2 == 0)) {
				ekok = i;
				System.out.println(n1+" ve "+n2+" sayisinin ekoku: "+ekok);
				break;

			}
			i++;
		}
		
		int k = n1;
		while (k >= 1) {
			if ((n1%k == 0) && (n2%k == 0)) {
				ebob = k;
				System.out.println(n1+" ve "+n2+" sayisinin ebobu: "+ebob);
				break;
			}
			k--;
		}
	}

}
