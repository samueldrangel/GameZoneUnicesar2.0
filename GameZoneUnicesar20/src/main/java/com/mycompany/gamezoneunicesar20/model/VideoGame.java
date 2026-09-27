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
 * Represents a video game product, with attributes specific to games
 * such as platform, genre, and age rating.
 */
public class VideoGame extends Product {
    private String platform;
    private String genre;
    private String ageRating;

    public VideoGame(String platform, String genre, String ageRating, String id, String title, double price, int stock) {
        super(id, title, price, stock);
        this.platform = platform;
        this.genre = genre;
        this.ageRating = ageRating;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    public String getAgeRating() {
        return ageRating;
    }
     
    
    @Override
public String describe() {
    return getTitle() + " es un videojuego para " + platform + " , genero " + genre + " , calificado " + ageRating ; 
}
}
