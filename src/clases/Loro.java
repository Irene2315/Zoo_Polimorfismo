package clases;

public class Loro extends Animal{
	
	public Loro(String clase) {
		super(clase);
	}
	@Override
	public  void parir() {
		System.out.println("Ha parido un loro");
	}
	
}
