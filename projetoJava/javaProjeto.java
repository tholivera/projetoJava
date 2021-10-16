package projetoJava;


public class javaProjeto {
	public static void main(String[] args) {
		
	Cadastro cadastro = new Cadastro(null, null);
	Menu menu1 = new Menu();
		
	System.out.println(" +---------------------------------------+");
	System.out.println(" |   Seja Bem-Vinde a ONG JAVA do Bem!   |");
	System.out.println(" +---------------------------------------+\n\n");
	
	System.out.println(" +---------------------------------------+");
	System.out.println(" |            NOSSOS CONTATOS            |");
	System.out.println(" +---------------------------------------+");
	System.out.println(" +---------------------------------------+");
	System.out.println(" |        Instagram: @ONGJAVADOBEM       |");
	System.out.println(" +---------------------------------------+");
	System.out.println(" +---------------------------------------+");
	System.out.println(" |      E-mail: ongjavadobem@gmail.com   |");
	System.out.println(" +---------------------------------------+\n\n");
	

	cadastro.setNome(null);
	cadastro.setEmail(null);
	menu1.setMenu1(0);
	menu1.setMenu2(0);
	

}
}