public class MetodoBurbuja {
    public void imprimirActual(int[] arreglo){
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+"  ");
        }
        System.out.println();
    }

    public void ordenar(int[] arreglo, boolean isDes){
        for (int i=0; i<arreglo.length; i++){
            for(int j=i+1; j<arreglo.length; j++){
                if (isDes){
                    if (arreglo[i]>arreglo[j]){
                        int aux= arreglo[i];
                            arreglo[i]= arreglo[j];
                            arreglo[j]= aux;
                } 
                }else{                    
                    if (arreglo[i]<arreglo[j]){
                    int aux= arreglo[i];
                        arreglo[i]= arreglo[j];
                        arreglo[j]= aux;
                    }
                }
            }
        }
        System.out.print("Arreglo ordenado -> " );
        imprimirActual(arreglo);
        System.out.println();
    }

    public void ordenarAscendentePasos(int[] arreglo){
        System.out.print("Arreglo original -> ");
        imprimirActual(arreglo);
        System.out.println();
        int comparacion = 0;
        int cambios = 0;
        for (int i=0; i<arreglo.length; i++){;
            for(int j=i+1; j<arreglo.length; j++){
                comparacion ++;
                System.out.println("Comparación " + comparacion +": " + arreglo[i] +" > "+ arreglo[j]);
                if (arreglo[i]>arreglo[j]){        
                    int aux= arreglo[i];
                    arreglo[i]= arreglo[j];
                    arreglo[j]= aux;
                    System.out.println("Intercambio: " + arreglo[i] +" <-> "+ arreglo[j]);

                    cambios ++;
                } else{
                    System.out.println("(No hay cambio)");
                }
                System.out.print("Estado actual -> ");
                imprimirActual(arreglo);
                System.out.println();
            }
        }
        System.out.println("--FINAL DEL METODO--");
        System.out.print("Arreglo ordenado -> " );
        imprimirActual(arreglo);
        System.out.println("Comparaciones Totales -> "+ comparacion);
        System.out.println("Cambios Totales -> " + cambios);
        System.out.println();
    }

    public void ordenarDescendentePasos(int[] arreglo){
        System.out.print("Arreglo original -> ");
        imprimirActual(arreglo);
        System.out.println();
        int comparacion = 0;
        int cambios = 0;
        for (int i=0; i<arreglo.length; i++){;
            for(int j=i+1; j<arreglo.length; j++){
                comparacion ++;
                System.out.println("Comparación " + comparacion +": " + arreglo[i] +" > "+ arreglo[j]);
                if (arreglo[i]<arreglo[j]){        
                    int aux= arreglo[i];
                    arreglo[i]= arreglo[j];
                    arreglo[j]= aux;
                    System.out.println("Intercambio: " + arreglo[i] +" <-> "+ arreglo[j]);
                    cambios ++;
                } else{
                    System.out.println("(No hay cambio)");
                }
                System.out.print("Estado actual -> ");
                imprimirActual(arreglo);
                System.out.println();
            }
        }
        System.out.println("--FINAL DEL METODO--");
        System.out.print("Arreglo ordenado -> " );
        imprimirActual(arreglo);
        System.out.println("Comparaciones Totales -> "+ comparacion);
        System.out.println("Cambios Totales -> " + cambios);
        System.out.println();
    }
}