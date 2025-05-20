//MÉTODO BURBUJA
for(int i=0; i<(nElementos-1);i++){
   for(int j=0; j<(nElementos-1);j++){
     if (arreglo[j]>arreglo[j+1]){
       aux=arreglo[j];
       arreglo[j]=arreglo[j+1];
       arreglo[j+1]=aux;
     }
   }
}
/* OBERVACIÓN
El método burbuja no detecta si el arreglo ya está ordenado durante su ejecución, lo que hace que continúe iterando hasta completar 
todos los ciclos, incluso cuando ya no hay más swaps necesarios. Esto lo hace ineficiente en muchos casos.
Complejidad computacional: O(n²)
*/

//MÉTODO DE INSERCIÓN
for(int i=0;i<nElementos;i++){
  pos=i;
  aux=arreglo[i];
  while ((pos>0)&&(arreglo[pos-1]>aux)){
    arreglo[pos]=arreglo[pos-1];
    pos--;
  }
  arreglo[pos]=aux;
}
/* OBSERVACIÓN
No es el mejor para grandes volúmenes de datos, pero supera a Bubble Sort y Selection Sort en muchos casos prácticos.
Complejidad computacional: O(n²)
*/


