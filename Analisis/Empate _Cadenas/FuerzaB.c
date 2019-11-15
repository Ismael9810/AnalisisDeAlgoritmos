#include <stdio.h>
#include <stdlib.h>
#include<string.h>
#define d 256

//Empate de Cadenas
//Implementacion del algoritmo Fuerza Bruta  en C

void busqueda(char patron[], char txt[])
{

int m= strlen(patron);
int n= strlen(txt);
int i, j; //variables a utilizar en los ciclos for
int p=0; //inicializamos variable para el patrón
int t=0; // inicializamos variable para txt
int h=1;


for(i=0; i<= n-m; i++)

    {
    // verificamos los valores hash en txt y patrón
   // (para saber si son identicos)
   if(p==t)
    {
        //verificamos caracter por caracter
        for(j=0; j<m; j++)
        {
            if(txt[i+j]!=patron[j])
            break;
        }
      if(j==m){
        printf("Patron encontrado en %d \n", i);
      }else if(j!=m){
      printf("No existe el patron dentro de la cadena en posicion %d  \n",i);
      }
    }

       else if(i<n-m)
        {
            t=(d*(t-txt[i]*h)+txt[i+m]);
     }

   }//fin de for

}// fin de busquedas


   int main()
   {
    int q;
    char txt[40],patron[40];
    //Con esta cadena debe de darnos 6 resultados posibles
    busqueda("aa","duaaaaatreuaadbvaaaadfghaadasasasaaasasaasasssasaaaaaaaaaaaaaaaaaaaaaasasa");

    return 0;

   }

