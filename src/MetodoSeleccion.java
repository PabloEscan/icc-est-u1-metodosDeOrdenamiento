public class MetodoSeleccion {
    public void actual(int[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+"  ");
        }
        System.out.println();
    }

    public void ordenar(int[] arreglo, boolean isDes){
        if (isDes){
            for (int i=0; i<arreglo.length; i++){
                int iM= i;
                for(int j=i+1; j<arreglo.length; j++){
                    if (arreglo[j]<arreglo[iM]){
                        iM=j;
                    }
                }
                if (i!=iM){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[iM];
                    arreglo[iM] = aux;
                }
            }
        }else{
            for (int i=0; i<arreglo.length; i++){
                int iM= i;
                for(int j=i+1; j<arreglo.length; j++){
                    if (arreglo[j]>arreglo[iM]){
                        iM=j;
                    }
                }
                if (i!=iM){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[iM];
                    arreglo[iM] = aux;
                }
            }
        }
        System.out.print("Arreglo ordenado -> " );
        actual(arreglo);
        System.out.println();
    }

    public void ordenarAscendentePasos(int[] arreglo) {
        System.out.print("Arreglo original-> ");
        actual(arreglo);
        System.out.println();
        
        int comparaciones = 0;
        int cambios = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                System.out.println("Comparación " + comparaciones + ": " + arreglo[iM] + " > " + arreglo[j]);
                if (arreglo[j] < arreglo[iM]) {
                    iM = j;
                    System.out.println("El numero menor sera: "+ arreglo[j]);
                    System.out.println();
                }else{
                    System.out.println("Buscando si existe otro menor");
                    System.out.println();
                }
            } 
            if (i != iM) {
                System.out.println("El númeor menor es: "+ arreglo[iM]);
                System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[iM]);
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
                cambios++;
                            
                System.out.print("Estado actual -> ");
                actual(arreglo);
                System.out.println();
            }
        }
        
        System.out.println("--FIN DEL METODO--");
        System.out.print("Arreglo ordenado-> ");
        actual(arreglo);
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }

    public void ordenarDescendentePasos(int[] arreglo) {
        System.out.print("Arreglo original-> ");
        actual(arreglo);
        System.out.println();
        
        int comparaciones = 0;
        int cambios = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                System.out.println("Comparación " + comparaciones + ": " + arreglo[iM] + " < " + arreglo[j]);
                if (arreglo[j] > arreglo[iM]) {
                    iM = j;
                    System.out.println("El número mayor sera: "+ arreglo[j]);
                    System.out.println();
                }else{
                    System.out.println("Buscando si existe otro mayor");
                    System.out.println();
                }
            } 
            if (i != iM) {
                System.out.println("El númeor mayor es es: "+ arreglo[iM]);
                System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[iM]);
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
                cambios++;
                            
                System.out.print("Estado actual -> ");
                actual(arreglo);
                System.out.println();
            }
        }
        
        System.out.println("--FIN DEL METODO--");
        System.out.print("Arreglo ordenado-> ");
        actual(arreglo);
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }
    
}
