

/**
 *
 * @author Ismael Cortes
 */

import java.util.Random;

public class Caballo
{  
    //El caballo comienza en 1,1 (pero puede cambiarse si es deseado)
private int x = 1;  
private int y = 1;
private int tamano = 8;
private int contador = 1; // Esta variable lleva la cuenta de las casillas recorridas
int ciclos = 0;           // Esta variable cuenta los ciclos que se intentan antes de que diga que ya no hay lugares                       
int intentos_fallidos = 0; // Esta variable cuenta cuantos ciclos se inte
  //tan antes de obtener el que pidio el usuario para 64 pueden ser varios
 
public void Recibe()
{ 
Random aleatorio = new Random();

int Arreglo[][] = new int[tamano + 1][tamano + 1];
// se redefine el arreglo a 9 x 9  para evitar  el 0x0
Arreglo[1][1] = 1;
int dado1;
int dado2;
int casillas_requeridas = 0;
 
  casillas_requeridas = tamano;
 

while ( contador < casillas_requeridas )
{
intentos_fallidos++;  // Se incrementa cada que inicia un intento
contador = 1;    // Dado que ya se ha colocado al caballo en (1,1), se inicia el contador en 1
int ciclos = 0;   // Se inicia con 0 ciclos o lanzamientos de dados infructuosos
// Cada vez que se aborta un intento se  limipian las casillas, con el siguiente par de ciclos for y se reestablecen en 0

for ( int s = 0; s <= tamano; s++ )
{   
for ( int t = 0; t <= tamano; t++ )
Arreglo[s][t] = 0;
}   
 
 
Arreglo[1][1] = 1;
// Mientras no se encuentre un lugar para poner al caballo se mantendrá en esa posición

while ( 1000 != ciclos)
//Verifica si el caballo ya ha pasado por esas casillas,
{ 
ciclos++;
dado1 = 1 + aleatorio.nextInt(8);
dado2 = 1 + aleatorio.nextInt(8);

if ( Math.abs(Math.abs(x) - Math.abs(dado1)) == 2)
{ 
if ( Math.abs(Math.abs(y) - Math.abs(dado2)) == 1  )
 
if ( 0 == Arreglo[dado1][dado2])
{  
Arreglo[dado1][dado2] = ++contador;   
x = dado1;
y = dado2;
ciclos = 0;
    }  
}  

if ( Math.abs(Math.abs(x) - Math.abs(dado1)) == 1)
{
if ( Math.abs(Math.abs(y) - Math.abs(dado2)) == 2  )
if ( 0 == Arreglo[dado1][dado2] )
{  
Arreglo[dado1][dado2] = ++contador;
x = dado1;
y = dado2;
ciclos = 0;
      }  
    }  
  } 
}   

System.out.printf("\n Si funciono, wuuu");
System.out.printf("\nSe recorrieron %d casillas.\n", contador);
System.out.printf("\nSe intentaron %d caminos antes de obtener el requerido.\n", intentos_fallidos);
Imprime( Arreglo );

}   

// Crea el tablero con los datos 
public void Imprime(int B[][])
{   
for ( int k = 1; k <= 8; k++ )
{
for ( int j = 1; j <= 8; j++)
{
System.out.printf("%5d", B[k][j]);
       } 
System.out.println("\n");
     }
   }    
}  