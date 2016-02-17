public class Fatorial{

	public static void main(String[] args){

		System.out.println("Calculo de Fatorial");
		fatorial(3);
	}
  
  	public static void fatorial(int n){
     		int fat,i;
        	
        	fat =1;
        		for (i = 1; i<= n; i++)
             		 fat = fat * i;
            		System.out.println(fat);
	}
}
