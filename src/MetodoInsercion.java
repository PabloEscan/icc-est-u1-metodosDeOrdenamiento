public class MetodoInsercion {
    public void printActual(int[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+"  ");
        }
        System.out.println();
    }

     public void ordenar(int[] arreglo, boolean isDes){
        if (isDes){
            for (int j = 1; j < arreglo.length; j++){
                int actual = arreglo[j];
    
                int i = j-1;
                while(i >= 0 && arreglo[i] > actual){
                    arreglo[i+1] = arreglo[i];
                    i--;
                }
                arreglo[i+1]= actual;
            }
        }else{
            for (int j = 1; j < arreglo.length; j++){
                int actual = arreglo[j];
    
                int i = j-1;
                while(i >=0 && actual > arreglo[i]){
                    arreglo[i+1] = arreglo[i];
                    i--;
                }
                arreglo[i+1]= actual;
            }
        }
        System.out.println("Arreglo ordenado ->");
        printActual(arreglo);
        System.out.println();

    }

    public void ordenarAscendentePasos(int[] arreglo){
        System.out.print("Arreglo original-> ");
        printActual(arreglo);
        System.out.println();
        int comparaciones = 0;
        int cambios = 0;
        boolean intercambio;
    
        for (int j = 1; j < arreglo.length; j++){
            int actual = arreglo[j];
            int i = j - 1;
            System.out.println("Comparación " + j + ": " + arreglo[i] + " > " + actual);
            intercambio = false;
            
            while(i >= 0 && arreglo[i] > actual){
                arreglo[i + 1] = arreglo[i];
                i--;
                intercambio = true;
            }
            if (intercambio){
                System.out.println("Intercambio: " + arreglo[i + 1] + " <-> " + actual);
                comparaciones++;
                cambios++;
            }else{
                System.out.println("(No hay intercambio)");
                comparaciones++;
            }
            arreglo[i + 1] = actual;
            System.out.print("Estado Actual -> ");
            printActual(arreglo);
            System.out.println();
        }
        System.out.println(" --FIN DEL METODO-- ");
        System.out.print("Arreglo ordenado-> ");
        printActual(arreglo);
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }

    public void ordenarDescendentePasos(int[] arreglo) {
        System.out.print("Arreglo original-> ");
        printActual(arreglo);
        System.out.println();
        int comparaciones = 0;
        int cambios = 0;
        boolean intercambio;
    
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];
            int i = j - 1;
            System.out.println("Comparación " + j + ": " + arreglo[i] + " < " + actual);
            intercambio = false;
    
            while (i >= 0 && arreglo[i] < actual) {
                arreglo[i + 1] = arreglo[i];
                i--;
                intercambio = true;
            }
            if (intercambio) {
                System.out.print("Intercambio: " + arreglo[j-1] + " <-> " + actual);
                System.out.println();
                comparaciones++;
                cambios++;
            } else {
                System.out.println("(No hay intercambio)");
                comparaciones++;
            }
            arreglo[i + 1] = actual;
            System.out.print("Estado Actual -> ");
            printActual(arreglo);
            System.out.println();
        }
        System.out.println(" --FIN DEL METODO-- ");
        System.out.print("Arreglo ordenado-> ");
        printActual(arreglo);
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }    
}