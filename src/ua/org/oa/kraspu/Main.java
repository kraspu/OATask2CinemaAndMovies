package ua.org.oa.kraspu;

import java.util.Scanner;

public class Main {


  public static void main(String[] args) {

    Cinema pravdaKino = new Cinema();

    Movies movie1 = new Movies("Фантастичнi звiрi: Злочини Грiндельвальда", "Adventure, Family, Fantasy", 136);
    pravdaKino.addMovie(movie1);
    pravdaKino.setRandomRate(movie1); //set random rate of movie

    Movies movie2 = new Movies("Богемна рапсодiя", " Biography, Drama, Music",134);
    pravdaKino.addMovie(movie2);
    pravdaKino.setRandomRate(movie2);

    Movies movie3 = new Movies("HALK", " Fantasy",200);
    pravdaKino.addMovie(movie3);
    pravdaKino.setRandomRate(movie3);

    Movies movie4 = new Movies("Enter The Dragon", " Kung Fu",102);
    pravdaKino.addMovie(movie4);
    movie4.setRateCount(5); // It is Bruce Lee birthday today!!!

    Movies movie5 = new Movies();
    pravdaKino.addMovie(movie5);
    System.out.println("Enter your rate 5 times (1-5):");
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 5; i++){
      int rC = s.nextInt();
      movie5.setRateCount(rC);
    }

    System.out.println("Full list of movies in the \"PravdaKino\"");
    pravdaKino.infoList(pravdaKino.getMovieList(), pravdaKino.getMovieList().size());

    System.out.println("The worst 3 movies are:");
    pravdaKino.infoList(pravdaKino.sortListBad3(pravdaKino.getMovieList()), 3);

    System.out.println("The TOP 3 movies are:");
    pravdaKino.infoList(pravdaKino.sortListTop3(pravdaKino.getMovieList()), 3);




  }
}
