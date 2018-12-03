package util;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 
    public class Teclado{
    	
        private static BufferedReader teclado = new 
     BufferedReader(new InputStreamReader(System.in));
         
          public static String lertexto(String texto) {
        	  try {
        		  
        		  System.out.println(texto);
        		  
        		  return teclado.readLine();
        	  } catch (IOException e) {
        		  return null;
        	  }
          }
    
     public static int lerInt(String texto) {
    	 // chama o método lerString e converte o resultado
    	 // para inteiro
    	 return Integer.parseInt(lertexto(texto));
     }
            public static double lerDouble(String texto) {
            	// chama o método lerString e converte o 
            	// resultado para double
            	return Double.parseDouble(lertexto(texto));
            	
     }

}
