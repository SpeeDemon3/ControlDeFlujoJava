import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class EjemploControlDeFlujo {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Juguemos");
		System.out.println("Pulsa 1 para ver los números del 20 al 40 o pulsa 2 para ver los números del 50 al 30 o pulsa 3 para finalizar el programa");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num1 = br.readLine();
		int number = Integer.parseInt(num1);
		
		if(number == 1) {
				int n = 20;
				while(n <= 40) {
					System.out.println(n);
						n++;
		}} else if(number == 2) {
				for (int i =50; i >= 40; i--) {
					System.out.println(i);
				}
		} else if(number == 3) {
				System.out.println("Fin del programa");
		} else {
					System.out.println("Solo puedes selecionar con las teclas 1, 2 ,3");
	}
}
		
}
