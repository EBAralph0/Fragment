package com.example.fragment;

public class Book {
    public String Name;
    public  String Autor;
    public String Categorie;
    public int Image;

    public void setName(String name) {
        Name = name;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setCategorie(String categorie) {
        Categorie = categorie;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public String getAutor() {
        return Autor;
    }

    public String getCategorie() {
        return Categorie;
    }

    public int getImage() {
        return Image;
    }

    public Book(String name, String autor, String categorie, int image) {
        Name = name;
        Autor = autor;
        Categorie = categorie;
        Image = image;
    }

    public Book() {
    }
}
