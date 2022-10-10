package ejerciciobingo;

import PaqueteLectura.GeneradorAleatorio;

public class GeneradorNums {
    
    private int cantFilas;
    private int cantCols;
    private int[][] indices;

    public GeneradorNums(int cantFilas, int cantCols, int[][] indices) {
        this.cantFilas = cantFilas;
        this.cantCols = cantCols;
        this.indices = indices;
    }
    public int getCantCols(){
        return this.cantCols;
    }
    public int getCantFilas() {
        return cantFilas;
    }
    public int[][] getIndices() {
        return indices;
    }
    
    public int[][] generarNumeros(){ //total espacios 27 (3x9).
        int i;
        int numeros[][] = new int[this.getCantFilas()][this.getCantCols()];
        int sumar[] = new int[this.getCantFilas()];
        
        //Genero array sumar, para evitar repeticiones de nums en una misma col
        for (i = 0; i < this.getCantFilas(); i++){
            if (i == 0)
                sumar[i] = 1;//1..3;
            else
                sumar[i] = sumar[i-1] + 3;// 4..6, 7..9 ...
        }
        
        //Genero numeros aleatorios
        for (i = 0; i < this.getCantFilas(); i++ )
            for (int k = 0; k < 5; k++) //multiplico segun numero de indice(col) 0..8 * 10
                numeros[i][this.getIndices()[i][k]] = GeneradorAleatorio.generarInt(3) + sumar[i] + 10 * this.getIndices()[i][k];
        return numeros;
    }
    
    
}
