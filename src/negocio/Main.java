package negocio;

//import java.time.ZonedDateTime;

public class Main {
	public static void main(String[] args) {

		Filme f1 = new Filme(1, "Java muito feliz", Genero.ROMANCE, 30);
		Filme f2 = new Filme(1, "Java muito triste", Genero.MUSICAL, 20);
		Filme f3 = new Filme(1, "Java muito triste", Genero.MUSICAL, 20);
		Filme f4 = new Filme(1, "Java muito triste", Genero.DRAMA, 20);
		Filme f5 = new Filme(1, "Java muito triste", Genero.MUSICAL, 20);
		
		Cliente c1 = new Cliente(1, "Neto", 30, true); 
		Cliente c2 = new Cliente(2, "João", 50, true);  
		
		Locacao locacao = new Locacao();
		Locacao locacao1 = new Locacao();
		Locacao locacao2 = new Locacao();
		Locacao locacao3 = new Locacao();
		Locacao locacao4 = new Locacao();
		
		locacao.alugarComDesconto(c1, f1, "10/12/2022", "09:00");
		locacao1.alugarComDesconto(c2, f2, "01/12/2022", "12:00");
		locacao2.alugarComDesconto(c2, f3, "01/12/2022", "12:00");
		locacao3.alugarComDesconto(c2, f4, "01/12/2022", "12:00");
		locacao4.alugarComDesconto(c2, f5, "01/12/2022", "12:00");
		
		
		
		Transacao transacao = new Transacao();
		
		transacao.addLocacao(locacao);
		transacao.addLocacao(locacao1);
		transacao.addLocacao(locacao2);
		transacao.addLocacao(locacao3);
		transacao.addLocacao(locacao4);
		
		transacao.verAlugueis();
		
	}

}
