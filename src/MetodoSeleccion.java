public class MetodoSeleccion {
    
    public void ordenarAsendente(int[] arreglo) {
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
    }

    public void ordenarDesendente(int[] arreglo) {
        for (int i=0; i<arreglo.length; i++){
            int iM= i;
            for(int j=i+1; j<arreglo.length; j++){
                if (arreglo[j]>arreglo[i]){
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
                    if (arreglo[j]>arreglo[i]){
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
    }


    public void printarray(int[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
}
