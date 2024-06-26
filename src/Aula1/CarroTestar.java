package Aula1;

public class CarroTestar {
	
	public static void main(String [] args) {
		// instanciando o objeto
		Carro c1 = new Carro(); // construtor
		
		
		// chamando os atributos e metodos
		
				c1.nome = "Uno";
				c1.marca ="Fiat";
				c1.ano = 2015;
				c1.vel =150;
				c1.businando ="bibibibibi";
				
				c1.acelerar(10);
				
				System.out.println("veiculo = " + c1.nome + " Marca = " +c1.marca + " ano = " +c1.ano );
				System.out.println("velocida atual = " + c1.vel+"km/h");
				
				System.out.println("radar movel a frente!!!");
				System.out.println("Alguem businou!! = " + c1.businando);
				
				c1.freiar(50);
				
				System.out.println("velocidade diminuiu = " + c1.vel+"km/h");
				System.out.println("Cuidado voçe quase foi multado!!");
				
		
				
	}

}