package Pesquisa.br.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pesquisa {

	public static void main(String args[]) {

		int quantHomens = 0;
		int quantMulheres = 0;

		Scanner leia = new Scanner(System.in);
		ArrayList<String> listaMulher = new ArrayList<>();
		ArrayList<String> listaHomem = new ArrayList<>();

		do {
			System.out.println(
					"Digite Nome e Sexo (F para feminino, M para masculino , separado por virgula, ou S para sair:");
			String entrada = leia.next();

			if (entrada.equalsIgnoreCase("s")) {
				System.out.println("saindo");
				break;
			} else {

				String nomeSexo[] = entrada.split("(-|,)");

				if (nomeSexo[1].toUpperCase().charAt(0) == 'M') {
					listaHomem.add(nomeSexo[0]);
					quantHomens++;
				} else {
					listaMulher.add(nomeSexo[0]);
					quantMulheres++;
				}
			}
		} while(true);

		System.out.println("\nlista homens totalizando:" + quantHomens);
		listaHomem.forEach(x -> System.out.println(x));
		System.out.println("\nlista Mulheres totalizando: " + quantMulheres);
		listaMulher.forEach(y -> System.out.println(y));
	}
}
