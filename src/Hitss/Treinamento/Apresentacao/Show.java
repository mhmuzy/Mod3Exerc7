package Hitss.Treinamento.Apresentacao;

public class Show {
	public static void main(String[] args) {
		try { /// *** Inicializa��o do Tratamento
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("         Hitss Treinamento"); 
			/// *** Enunciado do Programa
			System.out.println(""); /// *** Pula mais 1 linha
			for (int i = 15; i <= 200; i++) { /// *** La�o for
				
				if (i % 2 == 0) { /// *** O N� � Par
					System.out.println(i); /// *** Se sim ser� impresso
				} /// *** Termina o If
			} /// *** Termina o for
		} catch (Exception e) { /// *** Inicializa��o do Catch
			System.out.println("Erro de Processamento: " + e.getMessage());
			/// *** Impress�o do Catch
		} /// *** Finaliza��o do Catch
	}
}
