package ejerciciobingo;

import PaqueteLectura.GeneradorAleatorio;

public class GeneradorIndice {
    
    private int [] indicesCol;
    private int cantIndices;
    
    public GeneradorIndice(int cantIndices){
        this.cantIndices = cantIndices;
        this.indicesCol = new int[cantIndices];
    }
    
    public int getCantIndices(){
        return this.cantIndices;
    }
    
    
    public int[] generarIndices(){
        int aux = 0;
        int j,k;
        boolean repetido;
        for ( j = 0; j < this.getCantIndices(); j++){
            repetido = true;//por defecto en true para entrar al while.
            while (repetido == true){
                repetido = false;
                aux = GeneradorAleatorio.generarInt(9);// 0..8 (columnas indice);
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
