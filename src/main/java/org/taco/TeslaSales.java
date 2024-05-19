package org.taco;

public class TeslaSales {

    private static int tesla = 0;

    private String teslaColor;
    private String modelName;

    @Deprecated
    public TeslaSales(String teslaColor) {
        this.teslaColor = teslaColor;
    }

    public TeslaSales(String teslaColor, String modelName) {
        this.teslaColor = teslaColor;
        this.modelName = modelName;
    }

    public static void main(String[] args) {

        TeslaSales sales1 = new TeslaSales("red");
        tesla++;
        System.out.println("sold\t"+tesla);
        TeslaSales sales2 = new TeslaSales("white");
        tesla++;
        System.out.println("sold\t"+tesla);
        TeslaSales sales3 = new TeslaSales("red", "x");
        tesla++;
        System.out.println("sold\t"+tesla);

    }
}
