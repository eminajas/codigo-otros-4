package com.generation;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
	
		    Scanner s = new Scanner(System.in);
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    String j1 = s.nextLine();
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    Scanner s2 = new Scanner(System.in);
		    String j2 = s.nextLine();
		    
		    if (j1 == j2) {
		      System.out.println("Empate");
		    } else {
		      int g = 2;
		      switch(j1) {
		        case "piedra":
		          if (j2 == "tijeras") {
		            g = 1;
		          }

		        case "papel":
		          if (j2 == "piedra") {
		            g = 1;
		          }
		        case "tijera":
		          if (j2.equals("papel")) {
		            g = 1;
		          }
		          break;
		        default:
		      }
		      System.out.println("Gana el jugador " + g);
		    }
		  
		 

	}//main

}//class principal

/*
package com.generation;

import java.util.Scanner;


public class codigo4 {
	
	private Scanner s = new Scanner(System.in);
	
	
	public void muestraJ1(String mensaje){
		
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	}
	
	private Scanner s2 = new Scanner(System.in);
	
	public void muestraJ2(String mensaje){
		
		System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	}
	
	public String leerJ1() {
		
		String j1 = s.nextLine();
    
	}
	
	public String leerJ2() {
		String j2 = s.nextLine();
	}
	
	/*Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in);
    String j2 = s.nextLine();
    
	
	public String juego(String g) {
		if (j1 == j2) {
			System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
      }
	}
}
}//class codigo 4*/
