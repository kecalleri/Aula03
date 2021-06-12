import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double ladoa, ladob, ladoc;
		System.out.println("Digite a medida do lado a da figura");
		ladoa = leitor.nextDouble();
		System.out.println("Digite a medida do lado b da figura");
		ladob = leitor.nextDouble();
		System.out.println("Digite a medida do lado c da figura");
		ladoc = leitor.nextDouble();

		
		if ((ladoa + ladob > ladoc) && (ladob + ladoc > ladoa) && (ladoa + ladoc > ladob)) {
			System.out.println("O triângulo existe");
		//3ª etapa: validar o tipo
				if (ladoa == ladob && ladoa == ladoc) { 
			System.out.println("O triângulo é equilátero");
				}else if (ladoa != ladob && ladoa != ladoc && ladob != ladoc) {
			
				System.out.println("O triângulo é escaleno");	
				}else {
					System.out.println("O triângulo é isóceles");
				}			
				}else {
			System.out.println("O triângulo não existe");
			
			leitor.close();
	}
		
	}
}


