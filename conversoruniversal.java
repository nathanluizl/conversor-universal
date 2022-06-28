import java.util.Scanner;

public class conversoruniversal {

	public static void main(String[] args) {

		/*
		 * Faça um programa que funciona como um conversor universal.
		 * 
		 * Primerio o usuário escolhe se ele quer converter: temperatura, peso,
		 * comprimento ou volume.
		 * 
		 * Se, por exemplo, ele escolher temperatura, faça com que ele escolha o tipo de
		 * entrada entre: celsius, fahrenheit ou kelvin.
		 * 
		 * Depois ele escolhe para qual ele quer converter.
		 * 
		 * As opções de peso são: quilos, libras e onças
		 * 
		 * As opções de comprimento são: metros, pés e polegadas
		 * 
		 * As opções de volume são: litros, galão e onças líquidas
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Escolha qual o tipo de dados que você irá inserir");
		System.out.println("Escolha uma das opções abaixo: \n 1 Temperatura \n 2 Peso\n 3 Comprimento\n 4 Volume \n ");
		int escolha = in.nextInt();

		switch (escolha) {

		case 1:
			System.out.println("Escolha 1) Celsius | 2)Fahrenheit | 3) Kelvin ");
			int escolhaTemp = in.nextInt();
			System.out.println("Insira o valor para a conversão");
			double valorTemp = in.nextDouble();

			switch (escolhaTemp) {
			case 1:
				System.out.println("1) Celsius para Fehrenheit | 2) Celsius para Kelvin");
				int celsiusPara = in.nextInt();

				switch (celsiusPara) {
				case 1:
					System.out.println((((valorTemp * 9) / 5) + 32));
					break;
				case 2:
					System.out.println(valorTemp + 273.15);
					break;

				}

			case 2:
				System.out.println("1) Fahrenheit para Celsius | 2) Fahrenheit para Kelvin");
				int fPara2 = in.nextInt();

				switch (fPara2) {
				case 1:
					System.out.println((valorTemp - 32) / 1.8);
					break;
				case 2:
					System.out.println(((valorTemp - 32) / 1.8) + 273);
					break;

				}

			case 3:
				System.out.println("1) Kelvin para Celsius | 2) Kelvin para Fahrenheit");
				int kPara = in.nextInt();

				switch (kPara) {
				case 1:
					System.out.println((valorTemp - 273));
					break;
				case 2:
					System.out.println(((valorTemp - 273) * 9 / 5 + 32));
					break;

				}
			}
		case 2:
			System.out.println("Escolha 1) quilos | 2) libras | 3) oncas");
			int escolhaPeso = in.nextInt();

			switch (escolhaPeso) {
			case 1:
				System.out.println("Escolha qual para converter: 1)Quilos para libras | 2) Quilos para oncas");
				int qPara = in.nextInt();
				System.out.println("Valor em quilos para conversão: ");
				int qValor = in.nextInt();
				switch (qPara) {
				case 1:
					System.out.println(qValor * 2.205);
					break;
				case 2:
					System.out.println(qValor * 35.274);
					break;
				}
			case 2:
				System.out.println("Escolha qual para converter: 1)Libras para Quilos | 2) Libras para oncas");
				int lPara = in.nextInt();
				System.out.println("Valor em Libras para conversão: ");
				int lValor = in.nextInt();
				switch (lPara) {
				case 1:
					System.out.println(lValor / 2.205);
					break;
				case 2:
					System.out.println((lValor * 16));
					break;
				}
			case 3:
				System.out.println("Escolha qual para converter: 1)Oncas para Quilos | 2) Oncas para libras");
				int oPara = in.nextInt();
				System.out.println("Valor em oncas para conversão: ");
				int oValor = in.nextInt();
				switch (oPara) {
				case 1:
					System.out.println((oValor / 35.274));
					break;
				case 2:
					System.out.println((oValor / 16));
					break;
				}
			}
		case 3:
			System.out.println("Escolha 1) metros | 2) pés | 3) polegadas");
			int escolhaComp = in.nextInt();

			switch (escolhaComp) {
			case 1:
				System.out.println("Escolha qual converter: 1) metros para pés | 2) metros para polegadas");
				int mPara = in.nextInt();
				System.out.println("Insira um valor pra conversão");
				int valorm = in.nextInt();

				switch (mPara) {
				case 1:
					System.out.println(valorm * 3.281);
					break;
				case 2:
					System.out.println(valorm * 39.37);
					break;
				}
			case 2:
				System.out.println("Escolha qual converter: 1) pés para metros | 2) pés para polegadas");
				int pPara = in.nextInt();
				System.out.println("Insira um valor pra conversão");
				int palorm = in.nextInt();

				switch (pPara) {
				case 1:
					System.out.println(palorm / 3.281);
					break;
				case 2:
					System.out.println(palorm * 12);
					break;
				}
			case 3:
				System.out.println("Escolha qual converter: 1) polegadas para metros | 2) polegadas para pés");
				int p2Para = in.nextInt();
				System.out.println("Insira um valor pra conversão");
				int valorp = in.nextInt();

				switch (p2Para) {
				case 1:
					System.out.println(valorp / 39.37);
					break;
				case 2:
					System.out.println(valorp / 12);
					break;

				}
			}
		case 4:
			System.out.println("Escolha 1) litros | 2) galões  | 3) onças liquidas");
			int escolhaVolum = in.nextInt();

			switch (escolhaVolum) {

			case 1:
				System.out.println("Escolha qual para converter: 1)Litros para galões | 2) Litros para oncas liquidas");
				int VPara = in.nextInt();
				System.out.println("Valor em litros para conversão: ");
				int LValor = in.nextInt();
				switch (VPara) {
				case 1:
					System.out.println(LValor / 3.785);
					break;
				case 2:
					System.out.println(LValor * 33.814);
					break;
				}
			case 2:
				System.out.println("Escolha qual para converter: 1)Galões para litros | 2) Galões para oncas liquidas");
				int gPara = in.nextInt();
				System.out.println("Valor em galões para conversão: ");
				int gValor = in.nextInt();
				switch (gPara) {
				case 1:
					System.out.println(gValor * 3.785);
					break;
				case 2:
					System.out.println(gValor * 128);
					break;
				}
			case 3:
				System.out.println("Escolha qual para converter: 1)Oncas liquidas para litros | 2) oncas liquidas para galões");
				int onPara = in.nextInt();
				System.out.println("Valor em oncas liquidas para conversão: ");
				int onValor = in.nextInt();
				switch (onPara) {
				case 1:
					System.out.println(onValor / 33.814);
					break;
				case 2:
					System.out.println(onValor / 128);
					break;
			}
		}
	}
}}
