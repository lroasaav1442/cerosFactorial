/**
 * Write a description of class cerosFactorial here.
 * 
 * @authors
 * Luis David Roa Saavedra
 * Ronal Mauricio Reales Fernandez
 * Juan Carlos Monsalve Torres
 * 
 * @version
 * 09/02/2018
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class cerosFactorial
{
	public static void main (String[] arg)
	{
		int num, fact, inicio, largo, i, cero, cant_ceros;
		String fact_string, temp, cero_temp;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat miles = new DecimalFormat("###,###.##");
		System.out.println("Universidad EAN");
		System.out.println("Construcción de SW");
		System.out.println();
		
		System.out.print("Digite el número: ");
		num = teclado.nextInt();
				
		fact = 1;
		inicio = num;
		while(inicio!=0)
		{
			//System.out.println(inicio);
			fact = fact*inicio;
			inicio--;
		}
		System.out.println();
		largo = Integer.toString(fact).length(); // Tamaño del número
		System.out.println("El factorial de "+num+" es: "+miles.format(fact)+" que tiene "+largo+" digitos.");
		
		fact_string = String.valueOf(fact);
		cero = 0;
		cero_temp = String.valueOf(cero);
		cant_ceros = 0;
		for(i=1;i<largo;i++)
		{
			temp = fact_string.substring(i, i+1);
			if(cero_temp.equalsIgnoreCase(temp)) // En el if comparo cadenas de texto
			{
				cant_ceros++;
			}
		}
		System.out.println("La cantidad de ceros en "+miles.format(fact)+" es de: "+cant_ceros);
	}
}