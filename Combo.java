package dp_facade;

public class Combo {
	private Burger burger;
	private Sobremesa sobremesa;
	private Bebida bebida;
	
	public Combo() {
		this.burger = new Burger();
		this.sobremesa = new Sobremesa();
		this.bebida = new Bebida();
	}
	
	public void CriarCombo(int tipo) {
		
		switch(tipo) {
			case 1: System.out.println("--- COMBO MASTER ---");
			burger.descricao = "Dois hambúrgueres, alface, queijo, molho especial, cebola, picles e pão de gergelim";
			burger.gramas = 175;
			burger.preco = 9.50;
			sobremesa.descricao = "Sorvete de Chocolate";
			sobremesa.tamanho = "Grande";
			sobremesa.preco = 5;
			bebida.descricao = "Coca-Cola";
			bebida.ml = 500;
			bebida.preco = 10.90;
			break;
			
			case 2:System.out.println("--- SUPER COMBO ---");
			burger.descricao = "Um hamburguer, cebola, picles, ketchup, mostarda e pão sem gergelim.";
			burger.gramas = 125;
			burger.preco = 6.50;
			sobremesa.descricao = "Sorvete de Chocolate";
			sobremesa.tamanho = "Médio";
			sobremesa.preco = 2.50;
			bebida.descricao = "Coca-Cola";
			bebida.ml = 300;
			bebida.preco = 8.90;
			break;
		
			default: System.out.println("ERRO: Combo não existente!");
			System.exit(0);
		}
	}
	
	public void ExibirCombo() {
		System.out.println("- Item 1 -");
		System.out.printf("Sanduiche: " + burger.descricao + "\nGramas: " + burger.gramas + "\nPreço: R$%.2f", burger.preco);
		System.out.println("\n\n- Item 2 -");
		System.out.printf("Sobremesa: " + sobremesa.descricao + "\nTamanho: " + sobremesa.tamanho + "\nPreço: R$%.2f", sobremesa.preco);
		System.out.println("\n\n- Item 3 -");
		System.out.printf("Bebida: " + bebida.descricao + "\nMedida: " + bebida.ml + "ml" + "\nPreço: R$%.2f",bebida.preco);
	}
}
