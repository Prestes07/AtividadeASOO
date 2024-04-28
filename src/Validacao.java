import java.util.Scanner;

public class Validacao {

		private String raValidar;
		private String nomeValidar;
		private String curso;
		private String consutaRA;
		
		public Validacao(Aluno aluno)
		{
			raValidar = aluno.getRa();
			nomeValidar = aluno.nome;
			curso = aluno.getCurso();
		}
		
		public void ConsutaRA()
		{
			Scanner entrada =  new Scanner(System.in);
			System.out.println("Digite o RA a ser Consutado");
			consutaRA = entrada.nextLine();
			
			if(raValidar.equals(consutaRA))
			{
				System.out.println("Esse RA pertence ao "+nomeValidar+"!\nRA: "+raValidar+"\nCurso:"+curso);
			}else {
				System.out.println("Esse RA nao pertence ao "+nomeValidar+"!");
				
			}
		}
	
}
