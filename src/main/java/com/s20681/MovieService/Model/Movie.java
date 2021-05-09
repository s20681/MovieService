package com.s20681.MovieService.Model;

public class Movie {
    private static Long idVal = (long) 0;
    private Long id;
    String name;
    String category;

    public Movie() {
    }

    public Movie(String name, String category) {
        this.id = idVal;
        idVal++;
        this.name = name;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
