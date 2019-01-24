package com.company;

public class SandwichMaker {

    public static void main(String[] args) {

        Sandwich omarSandwich = new Sandwich();

        Sandwich jamieSandwich = new Sandwich("pumpernickle", "chicken", "havarti", false);

        Sandwich davidSandwich = new Sandwich( "Ham", "Swiss", true);

        omarSandwich.describeSandwich();

        davidSandwich.describeSandwich();

        jamieSandwich.describeSandwich();
        }

    }

