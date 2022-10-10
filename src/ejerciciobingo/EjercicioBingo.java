package ejerciciobingo;

import PaqueteLectura.GeneradorAleatorio;

public class EjercicioBingo {
    
    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar(); int rows, cols;
        rows = 3; cols = 9;
        
        
        //Rellenamos la matriz con los indices de cols a rellenar
        GeneradorIndice generador = new GeneradorIndice(cols); //9 cols
        int [][] columnasRellenar = new int[rows][5]; //3 filas, 5 indices de cols(max por fila 5)
        for (int i = 0; i < rows; i++){
            columnasRellenar[i] = generador.generarIndices(); //asigno array generado de indices
            
            //Si row 1 y 2 estan llenadas:
            if (i == 1){
                Validador vali = new Validador(5, columnasRellenar[0], columnasRellenar[1]);
                boolean iguales = vali.filasIguales(); //Valido hipotetico caso de indices iguales
                if (iguales)// row1 = row2?
                    while (iguales){
                        columnasRellenar[i-1] = generador.generarIndices();//row1 con indices de filas
                        columnasRellenar[i] = generador.generarIndices();//row2 con indices de filas
                        iguales = vali.filasIguales();
                    }
            }
        }
        
        //SI termine el for, entonces tengo los indices:
        GeneradorNums genNums = new GeneradorNums(rows,cols, columnasRellenar);
        int [][] carton = new int[rows][cols]; //carton de bingo 3 filas, 9 col
        carton  = genNums.generarNumeros();
        
    }
    
}
