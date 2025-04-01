import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int[] arreglo = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 }; 

        //Instancias
        MetodoBurbuja mB = new MetodoBurbuja(); 
        MetodoSeleccion mS= new MetodoSeleccion();
        MetodoInsercion mI= new MetodoInsercion();
        MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        //MENU
        while(continuar){
            System.out.println("Metodos Ordenamientos");
            System.out.println("1 -> Brubuja");
            System.out.println("2 -> Selección");
            System.out.println("3 -> Inserción");
            System.out.println("4 -> Brubuja Mejorado");
            System.out.println("5 -> Salir");

            int metodo = getPositive(scanner, "Ingrese la opcion");
            if (metodo == 5){
                System.out.println("Adios");
                continuar = false;
                break;
            }
            String orden = getValString(scanner, new String[]{"A", "D"},"Deseas ordenar ascendentemente (A) o descendentemente(D)?: ");
            String orden2 = getValString(scanner, new String[]{"true", "false"},"Deseas ver los pasos? (true/false): ");

            switch(metodo){
                case 1:
                    System.out.println("Met. Burbuja");
                    if (orden.equalsIgnoreCase("A")){
                        if (orden2.equalsIgnoreCase("true")){
                            mB.ordenarAscendentePasos(arreglo);
                        }else{
                            mB.ordenar(arreglo, true);
                        }

                    }else{
                        if (orden2.equalsIgnoreCase("true")){
                            mB.ordenarDescendentePasos(arreglo);
                        }else{
                            mB.ordenar(arreglo, false);
                        }
                    }
                    continuar = false;
                    break;

                case 2:
                    System.out.println("Met. Selección");
                    if (orden.equalsIgnoreCase("A")){
                        if (orden2.equalsIgnoreCase("true")){
                            mS.ordenarAscendentePasos(arreglo);
                        }else{
                            mS.ordenar(arreglo, true);
                        }

                    }else{
                        if (orden2.equalsIgnoreCase("true")){
                            mS.ordenarDescendentePasos(arreglo);
                        }else{
                            mS.ordenar(arreglo, false);
                        }
                    }
                    continuar = false;
                    break;
                    
                case 3:
                    System.out.println("Met. Inserción");
                    if (orden.equalsIgnoreCase("A")){
                        if (orden2.equalsIgnoreCase("true")){
                            mI.ordenarAscendentePasos(arreglo);
                        }else{
                            mI.ordenar(arreglo, true);
                        }

                    }else{
                        if (orden2.equalsIgnoreCase("true")){
                            mS.ordenarDescendentePasos(arreglo);
                        }else{
                            mS.ordenar(arreglo, false);
                        }
                    }
                    continuar = false;
                    break;

                case 4:
                    System.out.println("Met. Burbuja mejorado");
                    if (orden.equalsIgnoreCase("A")){
                        if (orden2.equalsIgnoreCase("true")){
                            mBM.ordenarAscendentePasos(arreglo);
                        }else{
                            mBM.ordenar(arreglo, true);
                        }

                    }else{
                        if (orden2.equalsIgnoreCase("true")){
                            mBM.ordenarDescendentePasos(arreglo);
                        }else{
                            mBM.ordenar(arreglo, false);
                        }
                    }
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción Invaloda");
                    break;
            }
        }   
    }

    //OPCIONES
    public static int getPositive(Scanner scanner, String message){
        int input; 
        do {
            System.out.println(message + ": ");
            input = scanner.nextInt();
            if (input <= 0){
                System.out.println("El número debe ser positivo, intente nuevamente.");
            }
        } while(input <= 0);
        return input;
    }

    public static String getValString(Scanner scanner, String[] posibles, String message){
        String input;
        boolean valido;
        do{
            System.out.println(message);
            input = scanner.next();
            valido = false;
            for (String posible : posibles){
                if(input.equalsIgnoreCase(posible)){
                    valido = true;
                    break;
                } 
            }if (!valido) { 
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (!valido);
        return input;
    }
}

