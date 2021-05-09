package com.s20681.MovieService.Model;

import org.springframework.data.annotation.Id;


public class Movie {
    private static int idVal = 0;
    private Integer id;
    String name;
    String category;

    public Movie(String name, String category) {
        this.id = idVal;
        idVal++;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
