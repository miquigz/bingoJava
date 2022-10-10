package ejerciciobingo;

import PaqueteLectura.GeneradorAleatorio;

public class GeneradorIndice {
    private final int cantCols;
    
    public GeneradorIndice(int cantCols){
        this.cantCols = cantCols;
    }
    
    public int getCantCols(){
        return this.cantCols;
    }
    
    public int[] generarIndices(){
        int[] indicesCol = new int[this.getCantCols()];
        int aux = 0;
        int j,k;
        boolean repetido;
        for ( j = 0; j < this.getCantCols(); j++){
            repetido = true;//por defecto en true para entrar al while.
            while (repetido == true){
                repetido = false;
                aux = GeneradorAleatorio.generarInt(this.getCantCols());// 0..8 (columnas indice);
                for (k = 0; k < indicesCol.length; k++){//validamos si NO se repite
                    if (indicesCol[k] == aux){
                        repetido = true;
                    }
                }//si paso el for sin asignar true, entonces termino while.
            }
            indicesCol[j] = aux;
        }
        return indicesCol;
    }
}
