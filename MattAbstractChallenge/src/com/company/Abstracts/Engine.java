package com.company.Abstracts;

public abstract class Engine {

    //Member Data
    private String engineType;
    private double engineSizeInLiters;


    //Member Constructor
    public Engine(String engineType, double engineSizeInLiters){
        setEngineSizeInLiters(engineSizeInLiters);
        setEngineType(engineType);
    }


    //Member Setters and Getters
    public double getEngineSizeInLiters() {
        return engineSizeInLiters;
    }

    public void setEngineSizeInLiters(double engineSizeInLiters) {
        this.engineSizeInLiters = engineSizeInLiters;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
