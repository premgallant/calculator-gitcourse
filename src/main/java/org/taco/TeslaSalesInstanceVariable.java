package org.taco;

public class TeslaSalesInstanceVariable {

    private int teslaSalesCount = 0;
    private String teslaColor;
    private String modelName;

    @Deprecated
    public TeslaSalesInstanceVariable(String teslaColor) {
        this.teslaColor = teslaColor;
    }

    public TeslaSalesInstanceVariable(String teslaColor, String modelName) {
        this.teslaColor = teslaColor;
        this.modelName = modelName;
    }

    public int increment(){
        return teslaSalesCount++;
    }

    @Override
    public String toString() {
        return "TeslaSalesInstanceVariable{" +
                "teslaSalesCount=" + teslaSalesCount +
                ", teslaColor='" + teslaColor + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        TeslaSalesInstanceVariable sales1 = new TeslaSalesInstanceVariable("red");
        sales1.increment();
        System.out.println("sold\t"+sales1.teslaSalesCount);
        System.out.println(sales1);

        TeslaSalesInstanceVariable sales2 = new TeslaSalesInstanceVariable("white");
        sales2.increment();
        System.out.println("sold\t"+sales2.teslaSalesCount);
        System.out.println(sales2);


        TeslaSalesInstanceVariable sales3 = new TeslaSalesInstanceVariable("red", "x");
        sales3.increment();
        System.out.println("sold\t"+sales3.teslaSalesCount);
        System.out.println(sales3);

    }
}
