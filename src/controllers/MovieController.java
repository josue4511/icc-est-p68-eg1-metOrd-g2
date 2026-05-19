package controllers;

import models.Movie;

public class MovieController {

    public void sortByTitle(Movie[] movies){
        int tam = movies.length;
        for (int i = 1; i < tam; i++){
            Movie actual = movies[i];
            int j = i - 1;
            while (j >= 0 && movies[j].getTitle().compareTo(actual.getTitle()) < 0) {
                movies[j + 1] = movies[j];
                j--;
            }
            movies[j + 1] = actual;
        }
    }

    public static void printMovies(Movie[] movies){
        int tam = movies.length;
        for (int i = 0; i < tam; i++){
            System.out.println((i + 1) + ". " + movies[i].getTitle() + " (" + movies[i].getYear() + ")");
        }
    }
}

       