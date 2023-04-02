package com.vitorcamara.projetos;

import java.util.Scanner;

public class CadastroBasico {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = scan.next();

		while (nome.length() <= 3) {
			System.out.println("Digite um nome com mais de 3 letras:");
			nome = scan.next();
		}

		boolean idadevalida = false;
		int idade;

		do {
			System.out.println("Idade: ");
			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				idadevalida = true;
			} else {
				System.out.println("Idade inválida! Digite uma idade entre 0 e 150: ");
			}

		} while (idade < 0 || idade > 150);

		boolean salariovalido = false;
		double salario;

		do {
			System.out.println("Salário: ");
			salario = scan.nextDouble();

			if (salario >= 0) {
				salariovalido = true;

			} else {
				salariovalido = false;
				System.out.println("Salário inválido! Digite um salario valido:");
			}

		} while (salario < 0);

		String sexo;
		boolean sexovalido = false;
		do {
			System.out.println("Sexo('f' - feminino, 'm'- masculino ou 'nb'- nao-binario): ");
			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f")) {
				sexovalido = true;
				sexo = "feminino";
			}

			else if (sexo.equalsIgnoreCase("m")) {
				sexovalido = true;
				sexo = "masculino";
			}

			else if (sexo.equalsIgnoreCase("nb")) {
				sexovalido = true;
				sexo = "não-binário";
			} else {
				sexovalido = false;
				System.out.println("Sexo invalido! Digite um sexo válido:");
			}
		} while (!sexovalido);

		String estadociv;
		boolean estadovalido = false;

		do {
			System.out.println("Estado civil(s - solteiro, c - casado, v - viúvo ou d - divorciado:");
			estadociv = scan.next();

			if (estadociv.equalsIgnoreCase("s")) {
				estadovalido = true;
				estadociv = "solteiro(a)";
			}

			else if (estadociv.equalsIgnoreCase("c")) {
				estadovalido = true;
				estadociv = "casado(a)";
			}

			else if (estadociv.equalsIgnoreCase("v")) {
				estadovalido = true;
				estadociv = "viúvo(a)";
			}

			else if (estadociv.equalsIgnoreCase("d")) {
				estadovalido = true;
				estadociv = "divorciado(a)";
			}

			else {
				estadovalido = false;
				System.out.println("Estado civil invalido! Digite um estado civil válido:");
			}

		} while (!estadovalido);

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadociv);

	}

}
