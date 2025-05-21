//MÉTODO BURBUJA (BUBBLE SORT)
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

//MÉTODO POR SELECCIÓN (SELECTION SORT)
for(int i=0;i<nElementos-1;i++){
   minimo=i;
   for(int j=i+1;j<nElementos;j++){
      if(arreglo[minimo]>arreglo[j]){
         minimo=j;
      }
   }
   aux=arreglo[i];
   arreglo[i]=arreglo[minimo];
   arreglo[minimo]=aux;
}
/* OBSERVACIÓN
Útil cuando el costo de intercambiar elementos es alto (pocos swaps), pero es lento incluso en datos parcialmente ordenados.
Complejidad: O(n²) en todos los casos.
*/


//MÉTODO DE INSERCIÓN (INSERTION SORT)
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


