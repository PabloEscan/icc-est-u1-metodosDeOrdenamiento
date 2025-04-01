public class MetodoBurbujaMejorado {
    public void ordenar(int[] arreglo, boolean isDes) {
        int tam = arreglo.length;
        
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {  
                if (isDes){
                    if (arreglo[j] > arreglo[j + 1]) {

                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                    }
                }else{
                    if (arreglo[j] < arreglo[j + 1]) {

                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                    }
                }
            }
        }
        System.out.print("Arreglo ordenado -> ");
        printActual(arreglo);
    }

    public void ordenarAscendentePasos(int[] arreglo) {
        int tam = arreglo.length;
        int comparaciones = 0;
        int cambios = 0;
        
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                System.out.println("Comparación " + (comparaciones + 1) + ": " + arreglo[j] + " > " + arreglo[j + 1]);
                comparaciones++;
                
                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios++;         
                } else{
                    System.out.println("(No hay intercambio)");
                }
                System.out.print("Estado actual ->: ");
                printActual(arreglo);
                System.out.println();
            }
        }
        
        System.out.println("-- FIN DEL MÉTODO --");
        System.out.print("Arreglo ordenado -> ");
        printActual(arreglo);
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }

    public void ordenarDescendentePasos(int[] arreglo) {
        int tam = arreglo.length;
        int comparaciones = 0;
        int cambios = 0;
        
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                System.out.println("Comparación " + (comparaciones + 1) + ": " + arreglo[j] + " > " + arreglo[j + 1]);
                comparaciones++;
                
                if (arreglo[j] < arreglo[j + 1]) {
                    System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios++;         
                } else{
                    System.out.println("(No hay intercambio)");
                }
                System.out.print("Estado actual ->: ");
                printActual(arreglo);
                System.out.println();
            }
        }
        
        System.out.println("-- FIN DEL MÉTODO --");
        System.out.print("Arreglo ordenado -> ");
        printActual(arreglo);
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }

    public void printActual(int[] arreglo){
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+", ");
        }
        System.out.println();
    }
}
