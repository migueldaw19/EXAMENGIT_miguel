import java.util.Scanner;


public class Caso180 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				
				int casos = sc.nextInt();
				int numero;
				
				for (int i = 0; i < casos; i++){
					
					int a = sc.nextInt();
					int b = sc.nextInt();
					int c = sc.nextInt();
					
				if(a+b>c) {
					if (c>=a) {
					if (Math.pow(c, 2)<Math.pow(a, 2)+Math.pow(b, 2)){
						System.out.println("ACUTANGULO");
					}
					if (Math.pow(c, 2)==Math.pow(a, 2)+Math.pow(b, 2)){
						System.out.println("RECTANGULO");
					}
					if (Math.pow(c, 2)>Math.pow(a, 2)+Math.pow(b, 2)){
						System.out.println("OBTUSANGULO");
					}
					
			}
					
					if (a>=c) {
						if (Math.pow(a, 2)<Math.pow(c, 2)+Math.pow(b, 2)){
							System.out.println("ACUTANGULO");
						}
						if (Math.pow(a, 2)==Math.pow(c, 2)+Math.pow(b, 2)){
							System.out.println("RECTANGULO");
						}
						if (Math.pow(a, 2)>Math.pow(c, 2)+Math.pow(b, 2)){
							System.out.println("OBTUSANGULO");
						}
						
			}
					
						}
				if(a+b<=c) {
					System.out.println("IMPOSIBLE");
				}
			}

	}
}

