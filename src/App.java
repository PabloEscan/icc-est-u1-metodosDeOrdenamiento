public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        int [] listado = {64, 25, 12, 22, 11 };
        //int[] listadon = new int[10000];
        /*for (int i = 0; i<listado.length; i++){
                listado[i]= (int)(Math.random() * 10000)+1; 
            }*/

        MetodoBurbuja mB = new MetodoBurbuja(); 
        System.out.println("--Metodo Burbuja--") ;
        System.out.println("Arreglo Original") ;
        mB.imprimirArreglo(listado);
        System.out.println("Arreglo Ordenado ascendente");
        mB.ordenarAscendente(listado);
        mB.imprimirArreglo(listado);
        System.out.println("Arreglo Ordenado descendente");
        mB.ordenarDescendente(listado);
        mB.imprimirArreglo(listado);
        System.out.println("Arreglo Ordenado ascendente");
        mB.ordenar(listado, true);
        mB.imprimirArreglo(listado);
        System.out.println("Arreglo Ordenado descendente");
        mB.ordenar(listado, false);
        mB.imprimirArreglo(listado);

        /*MetodoSeleccion mS= new MetodoSeleccion();
        System.out.println("--Metodo Seleccion--") ;
        System.out.println("Arreglo Original") ;
        mS.printarray(listado);
        System.out.println("Arreglo Ordenado ascendente");
        mS.ordenarAsendente(listado);
        mS.printarray(listado);
        System.out.println("Arreglo Ordenado descendente");
        mS.ordenarDesendente(listado);
        mS.printarray(listado);
        System.out.println("Arreglo Ordenado descendente");
        mS.ordenar(listado, false);
        mS.printarray(listado);
        System.out.println("Arreglo Ordenado ascendente");
        mS.ordenar(listado, true);
        mS.printarray(listado);*/

        /*MetodoInsercion mI= new MetodoInsercion();
        System.out.println("--Metodo Inserción--") ;
        System.out.println("Arreglo Original") ;
        mI.printarray(listado);
        System.out.println("Arreglo Ordenado ascendente");
        mI.ordenarAsendente(listado);
        mI.printarray(listado);
        System.out.println("Arreglo Ordenado descendente");
        mI.ordenarDecendente(listado);
        mI.printarray(listado);
        System.out.println("Arreglo Ordenado ascendente");
        mI.ordenar(listado, true);
        mI.printarray(listado);
        System.out.println("Arreglo Ordenado descendente");
        mI.ordenar(listado, false);
        mI.printarray(listado);
        System.out.println("Arreglo Ordenado con pasos!");
        mI.ordenarConPasos(listado, true);*/
    }
}
