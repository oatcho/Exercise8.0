package com.company;

public class Sandwich {

    private String breadType;
    private String proteinType;
    private String cheeseType;
    boolean veggies;

//    private String parBreadType;
//    private String parProteinType;
//    private String parCheeseType;
//    private boolean parVeggies;

    public Sandwich() {
        breadType = "Garlic Bread";
        proteinType = "Turkey";
        cheeseType = "American Cheese";
        veggies = true;
    }

    public Sandwich (String parBreadType, String parProteinType, String parCheeseType, boolean parVeggies) {

    breadType = parBreadType;
    proteinType = parProteinType;
    cheeseType = parCheeseType;
    veggies = parVeggies;

    }

    public Sandwich (String parProteinType2, String parCheeseType2, boolean parVeggies2) {

        breadType = "Whole Grain";
        proteinType = parProteinType2;
        cheeseType = parCheeseType2;
        veggies = parVeggies2;

    }

    public void setBreadType (String inputBreadType) {
        breadType = inputBreadType;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setProteinType (String inputProteinType) {
        proteinType = inputProteinType;
    }

    public String getProteinType () {
        return proteinType;
    }

    public void setCheeseType (String inputCheeseType) {
        cheeseType = inputCheeseType;
    }

    public String getCheeseType () {
        return cheeseType;
    }

    public void setVeggies (boolean inputVeggies) {
        veggies = inputVeggies;
    }

    public boolean getVeggies () {
        return veggies;
    }

    public void describeSandwich() {
        System.out.println( "This sandwich is a " + proteinType + "sandwich, with " + cheeseType + ", and " + veggies + "all on a " + breadType);
    }



}


