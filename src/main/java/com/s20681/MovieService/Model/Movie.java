package com.s20681.MovieService.Model;

public class Movie {
    private Long id;
    String name;

    Category category;
    protected enum Category{
        Comedy,
        Thriller,
        Action,
        Adventure,
        Horror,
        Animated,
        Documentary,
        Drama,
        Fantasy,
        Crime,
        Romance,
        Scifi,
    }

    public Movie() {
    }

    public Movie(Long id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = Category.valueOf(category);
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
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
