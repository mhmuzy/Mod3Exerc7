package Hitss.Treinamento.Apresentacao;

public class Show {
	public static void main(String[] args) {
		try { /// *** Inicialização do Tratamento
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("         Hitss Treinamento"); 
			/// *** Enunciado do Programa
			System.out.println(""); /// *** Pula mais 1 linha
			for (int i = 15; i <= 200; i++) { /// *** Laço for
				
				if (i % 2 == 0) { /// *** O Nº é Par
					System.out.println(i); /// *** Se sim será impresso
				} /// *** Termina o If
			} /// *** Termina o for
		} catch (Exception e) { /// *** Inicialização do Catch
			System.out.println("Erro de Processamento: " + e.getMessage());
			/// *** Impressão do Catch
		} /// *** Finalização do Catch
	}
}
