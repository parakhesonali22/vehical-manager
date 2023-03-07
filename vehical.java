public class vehical{
	
 
	
	public static void main(String[] args) {
		PetrolEngine pE = new PetrolEngine();
		pE.start();
		
		DiselEngine dE= new DiselEngine();
		dE.start();
		dE.stop();
		dE.makeSound();
		
		ElecricalEngine eE=new ElecricalEngine();
		eE.start();
		
		eE.stop();
	}
}