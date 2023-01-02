package clases;

public class Animal {
	
		private String clase;
		private int numPatas;
		
		Animal(){
			
		}

		public Animal(String clase) {
			
			this.clase = clase;
			
		}

		public String getClase() {
			return clase;
		}

		public void setClase(String clase) {
			this.clase = clase;
		}

		public int getNumPatas() {
			return numPatas;
		}

		
		
		public void setNumPatas(int numPatas) {
			this.numPatas = numPatas;
		}
		
		
		public void parir(){
			System.out.println("Ha parido un animal");
		}

		@Override
		public String toString() {
			return "Animal: " + this.clase + "Numero Patas: " + this.numPatas ;
		}
		

	}


