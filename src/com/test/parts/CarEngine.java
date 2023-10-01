package com.test.parts;

public class CarEngine {
    private int piston;
    private int sparkPlugs;
    private int cylenders;

    public CarEngine(){
        this.piston=4;
        this.sparkPlugs=4;
        this.cylenders=4;
    }

    public CarEngine(int piston, int sparkPlugs, int cylenders) {
        this.piston = piston;
        this.sparkPlugs = sparkPlugs;
        this.cylenders=cylenders;
    }

    public int getPiston() {
        return piston;
    }

    public void setPiston(int piston) {
        this.piston = piston;
    }

    public int getSparkPlugs() {
        return sparkPlugs;
    }

    public void setSparkPlugs(int sparkPlugs) {
        this.sparkPlugs = sparkPlugs;
    }

    public int getCylenders() {
        return cylenders;
    }

    public void setCylenders(int cylenders) {
        this.cylenders = cylenders;
    }
    
}
