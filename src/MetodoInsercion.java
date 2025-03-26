public class MetodoInsercion {
    public void ordenarAsendente(int[] arreglo){
        for (int j = 1; j < arreglo.length; j++){
            int actual = arreglo[j];

            int i = j-1;
            while(i >=0 && arreglo[i] > actual){
                arreglo[i+1] = arreglo[i];
                i--;
            }
            arreglo[i+1]= actual;
        }
    }

    public void ordenarDecendente(int[] arreglo){
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

    }

    public void ordenarConPasos(int[] arreglo, boolean pasos){
        if (pasos){
            System.out.println("Arreglo original");
            for (int k=0; k<arreglo.length; k++){
                System.out.print(arreglo[k]+" - ");
            }
            System.out.println();
            System.out.println("Arreglo con pasos");
            for (int j = 1; j < arreglo.length; j++){
                int actual = arreglo[j];
                
                int i = j-1;
                System.out.println("i: " + i + " j: " + j + ", aux: " + actual);
                System.out.println("Compara aux:" + actual + " con arreglo["+ i +"]:" + arreglo[i]);
                while(i >= 0 && arreglo[i] > actual){
                    arreglo[i+1] = arreglo[i];
                    i--;
                }
                for (int k=0; k<arreglo.length; k++){
                    System.out.print(arreglo[k]+" - ");
                }
                System.out.println();
                arreglo[i+1]= actual;
                System.out.println("Mueve arreglo[" + (j+1) + "]: a arreglo["+ j +  "]: ") ;
                System.out.println("Estado actual:");
                for (int k=0; k<arreglo.length; k++){
                    System.out.print(arreglo[k]+" - ");
                }
                System.out.println();
            }
        }else{

        }

    }

    public void printarray(int[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
}