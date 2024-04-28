import java.util.Scanner;

public class controle {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);	
		Aluno aluno = new Aluno();
		
		System.out.println("Digite seu Nome: \n");
		aluno.nome = entrada.nextLine();
		
		//System.out.println("Digite seu CPF: \n");
		//aluno.cpf = entrada.nextLine();
		
		System.out.println("Digite seu RA: \n");
		aluno.setRa(entrada.nextLine());
		
		System.out.println("Digite seu Curso: \n");
		aluno.setCurso(entrada.nextLine());
		
		Validacao validar = new Validacao(aluno);
		validar.ConsutaRA();
	}

}
//System.out.println("Nome: "+aluno.nome+"\nCPF: "+aluno.cpf+"\nRA: "+aluno.getRa()+"\nCurso: "+aluno.getCurso());