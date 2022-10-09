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
        int[] indices1 = this.getColumnsIndexes1();
        int[] indices2 = this.getColumnsIndexes1();
        boolean auxBoolean = false;
        int casoIguales = 0;
        int k;
        for (k = 0; k < this.getMaxCaso();) //validamos hipotetico caso matriz row1 = matriz row2;
            if (indices1[k] == indices2[k])
                casoIguales++;
        
        auxBoolean = casoIguales == this.getMaxCaso();
        return auxBoolean;
    }
    
}
