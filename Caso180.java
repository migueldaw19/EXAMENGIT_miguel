import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		int numero;
		int i =0;
/*
		for (int i = 0; i < casos; i++){
		*/
		while (i<casos) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(a+b>c) {
				if (c>=a) {
					if (Math.pow(c, 2)<Math.pow(a, 2)+Math.pow(b, 2)){
						System.out.println("ACUTANGULO");
					}else if (Math.pow(c, 2)==Math.pow(a, 2)+Math.pow(b, 2)){
						System.out.println("RECTANGULO");
					}else if (Math.pow(c, 2)>Math.pow(a, 2)+Math.pow(b, 2)){
						System.out.println("OBTUSANGULO");
					}
					
				}else if (a>=c) {
					if (Math.pow(a, 2)<Math.pow(c, 2)+Math.pow(b, 2)){
						System.out.println("ACUTANGULO");
					}else if (Math.pow(a, 2)==Math.pow(c, 2)+Math.pow(b, 2)){
						System.out.println("RECTANGULO");
					}else if (Math.pow(a, 2)>Math.pow(c, 2)+Math.pow(b, 2)){
						System.out.println("OBTUSANGULO");
					}
	
				}
			if(a+b<=c) {
				System.out.println("IMPOSIBLE");
				
			}
			i++;
		}

	}
	}


}


