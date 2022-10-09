package ejerciciobingo;

import PaqueteLectura.GeneradorAleatorio;

public class EjercicioBingo {
    
    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int rows, cols;
        rows = 3; cols = 9;
        int [][] carton = new int[rows][cols]; //carton de bingo 3 filas, 9 col
        //total espacios 27 (3x9).
        //carton con 15 nums y  12 espacios en blanco.
        System.out.println("-------BINGO-------");
        System.out.println("-------------------");
        
        int []CantFila = new int[3]; //Cantidad de nums por fila.
        
        for (int i = 0; i < rows; i++ ){
            
            if (i == 0){ //fila1
                int num = GeneradorAleatorio.generarInt(3)+1; //0..2 + 1 (1..3)
            }else if (i == 1){ //fila2
                int num = GeneradorAleatorio.generarInt(3)+4; //0..2 + 4 (4..6)
            }else{ //fila3
                int num = GeneradorAleatorio.generarInt(3)+7; //0..2 + 7 (7..9)
            }
        }
        
        
        //5 numeros aleatorios sin repetir entre 1 y 9 (Columnas a llenar)
        
    
        int [][] columnasRellenar = new int[3][5]; //3 filas, 5 indices de cols
        int i;
        
        //Rellenamos la matriz con los indices de cols a rellenar
        GeneradorIndice generador = new GeneradorIndice(9); //9 cols
        for (i = 0; i < rows; i++){
            columnasRellenar[i] = generador.generarIndices(); //asigno array generado de indices
            
            //Si row 1 y 2 estan llenadas:
            if (i == 1){
                Validador vali = new Validador(5, columnasRellenar[0], columnasRellenar[1]);
                boolean iguales = vali.filasIguales(); //Valido hipotetico caso de indices iguales
                if (iguales)
                    while (iguales){
                        columnasRellenar[i-1] = generador.generarIndices();//row1 con indices de filas
                        columnasRellenar[i] = generador.generarIndices();//row2 con indices de filas
                        iguales = vali.filasIguales();
                    }
            }            
        }
        
        
        
                    
            
        
        int i = 0;
        if (i == 0){ //fila1
            int num = GeneradorAleatorio.generarInt(3)+1; //0..2 + 1 (1..3)
        }else if (i == 1){ //fila2
            int num = GeneradorAleatorio.generarInt(3)+4; //0..2 + 4 (4..6)
        }else{ //fila3
            int num = GeneradorAleatorio.generarInt(3)+7; //0..2 + 7 (7..9)
        }

        
        /*     RAW CONTENT
            //Llenamos vector numeros[], de columnas a rellenar (0..8) Max 5(por fila)
            for ( j = 0; j < 5; j++){
                repetido = true;//por defecto en true para entrar al while.
                while (repetido == true){
                    repetido = false;
                    aux = GeneradorAleatorio.generarInt(9);// 0..8 (columnas indice);
                    for (k = 0; k < numeros.length; k++){//validamos si NO se repite
                        if (columnasRellenar[i][k] == aux){
                            repetido = true;
                        }
                    }//si paso el for sin asignar true, entonces termino while.
            }
                columnasRellenar[i][j] = aux;
                
        
//validacion: (raw)
                //Hipotetico caso en la que la matriz row1 y row2 sean iguales:
                if ( (i == 1) && (j == 4)){ //si i == 1(row2) y termine de rellenarla(a row2) j==4:
                    int casoIguales = 0;
                    for (k = 0; k < 5;) //validamos hipotetico caso matriz row1 = matriz row2;
                        if (columnasRellenar[i][j] == columnasRellenar[i][j])
                            casoIguales++;
                    if (casoIguales == 5){//row1 == row2:
                        while (casoIguales != 5){
                            
                            repetido = true;//por defecto en true para entrar al while.
                            while (repetido == true){
                                repetido = false;
                                aux = GeneradorAleatorio.generarInt(9);// 0..8 (columnas indice);
                                for (k = 0; k < numeros.length; k++){//validamos si NO se repite
                                    if (columnasRellenar[i][k] == aux){
                                        repetido = true;
                                    }
                                }//si paso el for sin asignar true, entonces termino while.
                            }
                            
                            
                        }
                    }
                    
                }        
        
              */  
        
        System.out.println("----------------");
    }
    
}
