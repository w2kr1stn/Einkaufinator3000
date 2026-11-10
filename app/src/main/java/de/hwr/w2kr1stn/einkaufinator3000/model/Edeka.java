package de.hwr.w2kr1stn.einkaufinator3000.model;

public class Edeka {

    //List<String> edeka;
    private String[] edeka = new String[35];

    public Edeka(String[] edeka){
        this.edeka = edeka;
    }

    public String[] getBuild(){ return this.edeka; }
}
