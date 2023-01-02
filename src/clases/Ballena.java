package clases;


	public class Ballena extends Animal{

	private String oceano;

	public Ballena(String clase) {
		super(clase);
	}

	public String getOceano() {
		return oceano;
	}

	public void setOceano(String oceano) {
		this.oceano = oceano;
	}
	@Override
	public  void parir() {
		System.out.println("Ha parido una ballena");
	}
	@Override
	public String toString() {
		
		return super.toString() + "Oceano: " + this.getOceano();
	}
	}

