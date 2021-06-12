import java.util.Scanner;

public class Exercicioemaula {

	public static void main(String[] args) {
		//Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles deve ser carregado pelo drone./
		
		//PRIMEIRA PARTE: PEDIR PARA O USUÁRIO DIGITAR OS DADOS
		Scanner leitor = new Scanner(System.in);
		double lixo1, lixo2, lixo3;
		System.out.println("Digite o peso do primeiro lixo");
		lixo1 = leitor.nextDouble();
		System.out.println("Digite o peso do segundo lixo");
		lixo2 = leitor.nextDouble();
		System.out.println("Digite o peso do terceiro lixo");
		lixo3 = leitor.nextDouble();

		//SEGUNDA PARTE: DESCOBRIR QUAL É O LIXO DE MENOR PESO
		//Para o primeiro lixo ser o menor, o que eu preciso testar?
		//Ele precisa ser ao mesmo tempo, menor que o lixo 2 e menor que o lixo 3
		if (lixo1<10) {
			System.out.println("Levar o lixo 1");
		} else if (lixo2>=11) {
			System.out.println("Levar o lixo 2");
		} else if (lixo3>=21) {
			System.out.println("Levar o lixo 3");
		}
	
		
		leitor.close();

	}

}
