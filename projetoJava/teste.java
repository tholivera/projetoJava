package projetoJava;

import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class teste {
 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner menu = new Scanner(System.in);

			Cadastro cadastro = new Cadastro(null, null);

			int opcao, opcao1, opcao2, opcao3;

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
			
			
			
			// Pedir infos
			
			
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Quem voc� gostaria de ajudar?     |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |           MENU DE OP��ES              |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     1- Ajudar Moradores de Rua        |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     2- Ajudar Orfanatos Carentes      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     3- Ajudar Asilos Carentes         |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     0- Sair                           |");
				System.out.println(" +---------------------------------------+");

				System.out.println("\n ---------> Digite uma Op��o: ");

				opcao = menu.nextInt();
				
				switch (opcao) {
				case 1:

					
						System.out.println(" +---------------------------------------+");
						System.out.println(" |        -> OP��O 1 SELECIONADA <-      |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |     -> Ajudar Moradores de Rua <-     |");
						System.out.println(" +---------------------------------------+\n");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |     Como voc� gostaria de ajudar?     |");
						System.out.println(" +---------------------------------------+");

						System.out.println(" +---------------------------------------+");
						System.out.println(" |            MENU DE OP��ES             |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      1- Doa��o em Dinheiro            |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      2- Doa��o de Alimentos           |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      3- Doa��o de Roupas/brinquedos   |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      0- Sair                          |");
						System.out.println(" +---------------------------------------+");

						System.out.println(" +---------------------------------------+");
						System.out.println(" | *OBS: As doa��es de alimentos, roupas |");
						System.out.println(" | e brinquedos dever�o ser entregues em |");
						System.out.println(" |         nosso ponto de coleta.        |");
						System.out.println(" +---------------------------------------+");

						System.out.println("\n ---------> Digite uma Op��o: ");

						opcao1 = menu.nextInt();

						switch (opcao1) {
						case 1:

							System.out.println(" +---------------------------------------+");
							System.out.println(" |             MUITO OBRIGADE!           |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |  Todo valor doado ser� convertido em  |");
							System.out.println(" |      alimentos, cobertores, roupas    |");
							System.out.println(" |    medicamentos e itens de higiene.   |");
							System.out.println(" |   O pagamento � por boleto banc�rio.  |");
							System.out.println(" +---------------------------------------+");

							System.out.println("\n------> Qual Valor voc� deseja doar: ");

							Float valor = menu.nextFloat();

							System.out.println("------> Emitindo o boleto em: ");
							int i;
							for (i = 3; i >= 1; i--) {
								System.out.print("\n " + i);
							}

							System.out.println(" \n\n +---------------------------------------+");
							System.out.printf(" |   Seu boleto de R$ %.2f foi gerado!  |\n", valor);
							System.out.println(" | Acesse o link para visualizar o boleto|");
							System.out.println(" |    https://ongjavadobem.org/pay       |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    Muito obrigade pela sua doa��o.    |");
							System.out.println(" |  Acesse nosso Instagram para ver como |");
							System.out.println(" |   sua doa��o est� ajudando as pessoas.|");
							System.out.println(" |https://www.instagram.com/ongjavadobem/|");
							System.out.println(" +---------------------------------------+");
							try  {
								
								URI link = new URI ("https://www.instagram.com/ongjavadobem/");
								Desktop.getDesktop().browse(link);
								
								
							} catch (Exception erro) {
								System.out.println(erro);
							}

							break;

						case 2:
							System.out.println(" +---------------------------------------+");
							System.out.println(" |             MUITO OBRIGADE!           |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |        As doa��es de alimentos        |");
							System.out.println(" | precisam ser entregues em nosso ponto |");
							System.out.println(" |   de coleta na Rua Java n� 7 - SP.    |");
							System.out.println(" |    Hor�rio de Atendimento 08h as 17h. |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    Muito obrigade pela sua doa��o.    |");
							System.out.println(" |  Acesse nosso Instagram para ver como |");
							System.out.println(" |   sua doa��o est� ajudando as pessoas.|");
							System.out.println(" |https://www.instagram.com/ongjavadobem/|");
							System.out.println(" +---------------------------------------+");
							try  {
								
								URI link = new URI ("https://www.instagram.com/ongjavadobem/");
								Desktop.getDesktop().browse(link);
								
								
							} catch (Exception erro) {
								System.out.println(erro);
							}
							break;

						case 3:
							System.out.println(" +---------------------------------------+");
							System.out.println(" |             MUITO OBRIGADE!           |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    As doa��es de roupas/brinquedos    |");
							System.out.println(" | precisam ser entregues em nosso ponto |");
							System.out.println(" |   de coleta na Rua Java n� 7 - SP.    |");
							System.out.println(" |    Hor�rio de Atendimento 08h as 17h. |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    Muito obrigade pela sua doa��o.    |");
							System.out.println(" |  Acesse nosso Instagram para ver como |");
							System.out.println(" |   sua doa��o est� ajudando as pessoas.|");
							System.out.println(" |https://www.instagram.com/ongjavadobem/|");
							System.out.println(" +---------------------------------------+");
							try  {
								
								URI link = new URI ("https://www.instagram.com/ongjavadobem/");
								Desktop.getDesktop().browse(link);
								
								
							} catch (Exception erro) {
								System.out.println(erro);
							}
							break;
						default:
							if (opcao == 0) {

								System.out.println(" +---------------------------------------+");
								System.out.println(" |           Programa finalizado.        |");
								System.out.println(" +---------------------------------------+");

							} else {
								System.out.println(" +---------------------------------------+");
								System.out.println(" |            Op��o inv�lida.            |");
								System.out.println(" |      Por favor, digite novamente.     |");
								System.out.println(" +---------------------------------------+");
							}
							break;
						}
						break;
					

				case 2:
					
						System.out.println(" +---------------------------------------+");
						System.out.println(" |        -> OP��O 2 SELECIONADA <-      |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |     -> Ajudar Orfanatos carentes <-   |");
						System.out.println(" +---------------------------------------+\n");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |     Como voc� gostaria de ajudar?     |");
						System.out.println(" +---------------------------------------+");

						System.out.println(" +---------------------------------------+");
						System.out.println(" |            MENU DE OP��ES             |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      1- Doa��o em Dinheiro            |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      2- Doa��o de Alimentos           |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      3- Doa��o de Roupas/brinquedos   |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      0- Sair                          |");
						System.out.println(" +---------------------------------------+");

						System.out.println(" +---------------------------------------+");
						System.out.println(" | *OBS: As doa��es de alimentos, roupas |");
						System.out.println(" | e brinquedos dever�o ser entregues em |");
						System.out.println(" |         nosso ponto de coleta.        |");
						System.out.println(" +---------------------------------------+");

						System.out.println("\n ---------> Digite uma Op��o: ");

						opcao2 = menu.nextInt();

						switch (opcao2) {
						case 1:
							System.out.println(" +---------------------------------------+");
							System.out.println(" |             MUITO OBRIGADE!           |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |  Todo valor doado ser� convertido em  |");
							System.out.println(" |      alimentos, cobertores, roupas    |");
							System.out.println(" |    medicamentos e itens de higiene    |");
							System.out.println(" +---------------------------------------+");
							System.out.println("\n------> Qual Valor voc� deseja doar: ");

							Float valor = menu.nextFloat();

							System.out.println("------> Emitindo o boleto em: ");
							int i;
							for (i = 3; i >= 1; i--) {
								System.out.print("\n " + i);
							}

							System.out.println(" \n\n +---------------------------------------+");
							System.out.printf(" |   Seu boleto de R$ %.2f foi gerado!  |\n", valor);
							System.out.println(" | Acesse o link para visualizar o boleto|");
							System.out.println(" |    https://ongjavadobem.org/pay       |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    Muito obrigade pela sua doa��o.    |");
							System.out.println(" |  Acesse nosso Instagram para ver como |");
							System.out.println(" |   sua doa��o est� ajudando as pessoas.|");
							System.out.println(" |https://www.instagram.com/ongjavadobem/|");
							System.out.println(" +---------------------------------------+");
							try  {
								
								URI link = new URI ("https://www.instagram.com/ongjavadobem/");
								Desktop.getDesktop().browse(link);
								
								
							} catch (Exception erro) {
								System.out.println(erro);
							}

							break;

						case 2:
							System.out.println(" +---------------------------------------+");
							System.out.println(" |             MUITO OBRIGADE!           |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |        As doa��es de alimentos        |");
							System.out.println(" | precisam ser entregues em nosso ponto |");
							System.out.println(" |   de coleta na Rua Java n� 7 - SP.    |");
							System.out.println(" |    Hor�rio de Atendimento 08h as 17h. |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    Muito obrigade pela sua doa��o.    |");
							System.out.println(" |  Acesse nosso Instagram para ver como |");
							System.out.println(" |   sua doa��o est� ajudando as pessoas.|");
							System.out.println(" |https://www.instagram.com/ongjavadobem/|");
							System.out.println(" +---------------------------------------+");
							try  {
								
								URI link = new URI ("https://www.instagram.com/ongjavadobem/");
								Desktop.getDesktop().browse(link);
								
								
							} catch (Exception erro) {
								System.out.println(erro);
							}
							break;

						case 3:
							System.out.println(" +---------------------------------------+");
							System.out.println(" |             MUITO OBRIGADE!           |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    As doa��es de roupas/brinquedos    |");
							System.out.println(" | precisam ser entregues em nosso ponto |");
							System.out.println(" |   de coleta na Rua Java n� 7 - SP.    |");
							System.out.println(" |    Hor�rio de Atendimento 08h as 17h. |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    Muito obrigade pela sua doa��o.    |");
							System.out.println(" |  Acesse nosso Instagram para ver como |");
							System.out.println(" |   sua doa��o est� ajudando as pessoas.|");
							System.out.println(" |https://www.instagram.com/ongjavadobem/|");
							System.out.println(" +---------------------------------------+");
							try  {
								
								URI link = new URI ("https://www.instagram.com/ongjavadobem/");
								Desktop.getDesktop().browse(link);
								
								
							} catch (Exception erro) {
								System.out.println(erro);
							}
							break;
						default:
							if (opcao == 0) {

								System.out.println(" +---------------------------------------+");
								System.out.println(" |           Programa finalizado.        |");
								System.out.println(" +---------------------------------------+");

							} else {
								System.out.println(" +---------------------------------------+");
								System.out.println(" |            Op��o inv�lida.            |");
								System.out.println(" |      Por favor, digite novamente.     |");
								System.out.println(" +---------------------------------------+");
							}
							break;
						}
						break;

				case 3:
					

						System.out.println(" +---------------------------------------+");
						System.out.println(" |        -> OP��O 3 SELECIONADA <-      |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |     -> Ajudar Asilos carentes <-      |");
						System.out.println(" +---------------------------------------+\n");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |     Como voc� gostaria de ajudar?     |");
						System.out.println(" +---------------------------------------+");

						System.out.println(" +---------------------------------------+");
						System.out.println(" |            MENU DE OP��ES             |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      1- Doa��o em Dinheiro            |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      2- Doa��o de Alimentos           |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      3- Doa��o de Roupas/brinquedos   |");
						System.out.println(" +---------------------------------------+");
						System.out.println(" |      0- Sair                          |");
						System.out.println(" +---------------------------------------+");

						System.out.println(" +---------------------------------------+");
						System.out.println(" | *OBS: As doa��es de alimentos, roupas |");
						System.out.println(" | e brinquedos dever�o ser entregues em |");
						System.out.println(" |         nosso ponto de coleta.        |");
						System.out.println(" +---------------------------------------+");

						System.out.println("\n ---------> Digite uma Op��o: ");

						opcao3 = menu.nextInt();

						switch (opcao3) {
						case 1:
							System.out.println(" +---------------------------------------+");
							System.out.println(" |             MUITO OBRIGADE!           |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |  Todo valor doado ser� convertido em  |");
							System.out.println(" |      alimentos, cobertores, roupas    |");
							System.out.println(" |    medicamentos e itens de higiene    |");
							System.out.println(" +---------------------------------------+");
							System.out.println("\n------> Qual Valor voc� deseja doar: ");

							Float valor = menu.nextFloat();

							System.out.println("------> Emitindo o boleto em: ");
							int i;
							for (i = 3; i >= 1; i--) {
								System.out.print("\n " + i);
							}

							System.out.println(" \n\n +---------------------------------------+");
							System.out.printf(" |   Seu boleto de R$ %.2f foi gerado!  |\n", valor);
							System.out.println(" | Acesse o link para visualizar o boleto|");
							System.out.println(" |    https://ongjavadobem.org/pay       |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    Muito obrigade pela sua doa��o.    |");
							System.out.println(" |  Acesse nosso Instagram para ver como |");
							System.out.println(" |   sua doa��o est� ajudando as pessoas.|");
							System.out.println(" |https://www.instagram.com/ongjavadobem/|");
							System.out.println(" +---------------------------------------+");
							try  {
								
								URI link = new URI ("https://www.instagram.com/ongjavadobem/");
								Desktop.getDesktop().browse(link);
								
								
							} catch (Exception erro) {
								System.out.println(erro);
							}
							break;

						case 2:
							System.out.println(" +---------------------------------------+");
							System.out.println(" |             MUITO OBRIGADE!           |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |        As doa��es de alimentos        |");
							System.out.println(" | precisam ser entregues em nosso ponto |");
							System.out.println(" |   de coleta na Rua Java n� 7 - SP.    |");
							System.out.println(" |    Hor�rio de Atendimento 08h as 17h. |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    Muito obrigade pela sua doa��o.    |");
							System.out.println(" |  Acesse nosso Instagram para ver como |");
							System.out.println(" |   sua doa��o est� ajudando as pessoas.|");
							System.out.println(" |https://www.instagram.com/ongjavadobem/|");
							System.out.println(" +---------------------------------------+");
							try  {
								
								URI link = new URI ("https://www.instagram.com/ongjavadobem/");
								Desktop.getDesktop().browse(link);
								
								
							} catch (Exception erro) {
								System.out.println(erro);
							}
							break;

						case 3:
							System.out.println(" +---------------------------------------+");
							System.out.println(" |             MUITO OBRIGADE!           |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    As doa��es de roupas/brinquedos    |");
							System.out.println(" | precisam ser entregues em nosso ponto |");
							System.out.println(" |   de coleta na Rua Java n� 7 - SP.    |");
							System.out.println(" |    Hor�rio de Atendimento 08h as 17h. |");
							System.out.println(" +---------------------------------------+");
							System.out.println(" +---------------------------------------+");
							System.out.println(" |    Muito obrigade pela sua doa��o.    |");
							System.out.println(" |  Acesse nosso Instagram para ver como |");
							System.out.println(" |   sua doa��o est� ajudando as pessoas.|");
							System.out.println(" |https://www.instagram.com/ongjavadobem/|");
							System.out.println(" +---------------------------------------+");
							try  {
								
								URI link = new URI ("https://www.instagram.com/ongjavadobem/");
								Desktop.getDesktop().browse(link);
								
								
							} catch (Exception erro) {
								System.out.println(erro);
							}
							break;
						default:
							if (opcao == 0) {

								System.out.println(" +---------------------------------------+");
								System.out.println(" |           Programa finalizado.        |");
								System.out.println(" +---------------------------------------+");

							} else {
								System.out.println(" +---------------------------------------+");
								System.out.println(" |            Op��o inv�lida.            |");
								System.out.println(" |      Por favor, digite novamente.     |");
								System.out.println(" +---------------------------------------+");
							}

							break;
						}
						break;
					

				default:
					if (opcao == 0) {

						System.out.println(" +---------------------------------------+");
						System.out.println(" |         Programa finalizado.          |");
						System.out.println(" +---------------------------------------+");

					} else {
						System.out.println(" +---------------------------------------+");
						System.out.println(" |            Op��o inv�lida.            |");
						System.out.println(" |      Por favor, digite novamente.     |");
						System.out.println(" +---------------------------------------+");
					}

					break;
				}

				}
		}

