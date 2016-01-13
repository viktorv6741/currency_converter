package sample;

import java.awt.*;

public class Model {

    private double eurRate;
    private double usdRate;
    private double uah;

    public Model(double eurRate, double usdRate, double uah){
        this.eurRate = eurRate;
        this.usdRate = usdRate;
        this.uah = uah;
    }

    public double eurCalculation(){
        return uah / eurRate;
    }

    public double usdCalculation(){
        return uah / usdRate;
    }

}
