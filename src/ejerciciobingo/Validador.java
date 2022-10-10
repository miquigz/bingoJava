package ejerciciobingo;

public class Validador {
    private int maxCaso;
    private int[] columnsIndexes1, columnsIndexes2;

    public Validador(int maxCaso, int[] columnsIndexes1, int[] columnsIndexes2) {
        this.maxCaso = maxCaso;
        this.columnsIndexes1 = columnsIndexes1;
        this.columnsIndexes2 = columnsIndexes2;
    }

    public int getMaxCaso() {
        return maxCaso;
    }
    public int[] getColumnsIndexes1() {
        return columnsIndexes1;
    }
    public int[] getColumnsIndexes2() {
        return columnsIndexes2;
    }
    
//Hipotetico caso en la que los indices de cols de las filas(row1 y row2) sean iguales:
    public boolean filasIguales(){
        int casosIguales = 0;
        for (int k = 0; k < this.getMaxCaso();) //validamos hipotetico caso matriz row1 = matriz row2;
            if (this.getColumnsIndexes1()[k] == this.getColumnsIndexes2()[k])
                casosIguales++;
        return casosIguales == this.getMaxCaso();
    }
    
}
