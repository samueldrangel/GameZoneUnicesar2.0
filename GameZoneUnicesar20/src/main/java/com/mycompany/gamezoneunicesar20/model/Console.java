/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamezoneunicesar20.model;

/**
 *
 * @author Samuel
 */
/**
 * Represents a console product, with attributes specific to consoles
 * such as brand, model, and generation.
 */

public class Console extends Product {
    private String brand;
    private String model;
    private String generation;

    public Console(String brand, String model, String generation, String id, String title, double price, int stock) {
        super(id, title, price, stock);
        this.brand = brand;
        this.model = model;
        this.generation = generation;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getGeneration() {
        return generation;
    }

    @Override
    public String describe() {
        return   getTitle()+ " es una consola de " + brand + " , modelo " + model + " , generacion " + generation ;   }
 
    
    
    
}
