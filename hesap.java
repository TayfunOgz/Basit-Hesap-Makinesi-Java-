package alıstırma;

import java.util.Scanner;
public class hesap {
	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		System.out.println("İşlem seçin:");
		String işlem = g.next();
		switch (işlem) {
		case "toplama":
			System.out.println("Değerleri girin:");
			double x1 = g.nextDouble();
			double x2 = g.nextDouble();
			System.out.println(x1 + "+" + x2 + ":" + (x1 + x2));
			break;
		case "çıkarma":
			System.out.println("Değerleri girin:");
			x1 = g.nextDouble();
			x2 = g.nextDouble();
			System.out.println(x1 + "-" + x2 + ":" + (x1 - x2));
			break;
		case "çarpma":
			System.out.println("Değerleri girin:");
			x1 = g.nextDouble();
			x2 = g.nextDouble();
			System.out.println(x1 + "*" + x2 + ":" + (x1 * x2));
			break;
		case "bölme":
			System.out.println("Değerleri girin:");
			x1 = g.nextDouble();
			x2 = g.nextDouble();
			if(x2<0)
				System.out.println("tanımsız.");
			else			
			System.out.println(x1 + "/" + x2 + ":" + (x1 / x2));
			break;
		default:
			System.out.println("Geçersiz işlem.");
		}
	}

}