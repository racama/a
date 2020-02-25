import java.util.Scanner;

public class moyenne {
	
	static double n1,n2,n3,reslut, moyenne;
	private static Scanner clavier;

	public static void main(String[] args) {
		
	    	lireNotes();
	    	moyenne=calculerMoyenne(n1, n2, n3);
		    afficherResult();
		    afficherResult();
		 
		 

	}
	 
	public static void lireNotes() {
		   
		  clavier = new Scanner(System.in);
		  System.out.println("Entrer les trois nombres...");
		  
		     n1 = clavier.nextDouble();
	   	     n2 = clavier.nextDouble();
		     n3 = clavier.nextDouble();
		  }
	
	 public static double calculerMoyenne(double n1, double n2, double n3) {
		 double moyenne = (n1+n2+n3)/3;
		 return moyenne;
	 }
	public static void afficherResult() {
		System.out.println("La moyenne est :  " +moyenne);
	}

}
