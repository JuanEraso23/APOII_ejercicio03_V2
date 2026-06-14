package context;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Atributos
        System.out.print("Partidos Ganados: ");
        int pg = sc.nextInt();

        System.out.print("Partidos Perdidos: ");
        int pp = sc.nextInt();

        System.out.print("Partidos Empatados: ");
        int pe = sc.nextInt();
        
        //Formula
        int puntaje = (pg * 3) + (pp * 0) + (pe * 1);
        
        //Resultado
        System.out.print("Puntaje: " + puntaje);
        sc.close();
	}

}
