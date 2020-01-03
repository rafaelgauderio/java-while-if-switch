package application;

import java.util.Scanner;

public class ProgramSwitch {

	public static void main(String[] args) {

		/*
		 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a
		 * prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa
		 * ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combust�vel, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the type of fuel you want to fill the tank.");
		System.out.println("1 for alcohol, 2 for gasoline, 3 for diesel, 4 to exit the program: ");

		int countAlcohol = 0;
		int countGasolise = 0;
		int countDiesel = 0;

		Integer fuel = sc.nextInt();

		while (fuel != 4) {

			if (fuel == 1) {
				countAlcohol = countAlcohol + 1;
			}

			else if (fuel == 2) {
				countGasolise = countGasolise + 1;
			}

			else if (fuel == 3) {
				countDiesel = countDiesel + 1;
			} else {
				System.out.println("You have inform an invalid option");
			}

			fuel = sc.nextInt();

		}

		System.out.println("Thank You");

		System.out.println("Alcohol: " + countAlcohol + "\nGasoline: " + countGasolise + "\nDiesel: " + countDiesel);

		sc.close();

	}

}
