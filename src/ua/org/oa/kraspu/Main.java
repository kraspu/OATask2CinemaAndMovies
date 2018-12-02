package ua.org.oa.kraspu;

import java.util.Scanner;

public class Main {


  public static void main(String[] args) {

    Cinema pravdaKino = new Cinema();

    Movies movie1 = new Movies("Фантастичнi звiрi: Злочини Грiндельвальда", "Adventure, Family, Fantasy", 136);
    pravdaKino.addMovie(movie1);

    Movies movie2 = new Movies("Богемна рапсодiя", " Biography, Drama, Music",134);
    pravdaKino.addMovie(movie2);

    Movies movie3 = new Movies("HALK", " Fantasy",200);
    pravdaKino.addMovie(movie3);

    Movies movie4 = new Movies("Enter The Dragon", " Kung Fu",102);
    pravdaKino.addMovie(movie4);

    Movies movie5 = new Movies();
    pravdaKino.addMovie(movie5);


    System.out.println("Cредняя оценка фильмов по кинотеатру: " + pravdaKino.averageCinemaRate(pravdaKino.getMovieList()));

// выводим отсортированный список фильмов, чей рейтинг выше среднего по кинотеатру
    System.out.println("Cписок фильмов, чей рейтинг выше среднего по кинотеатру \"PravdaKino\": ");
    pravdaKino.infoList(pravdaKino.sortListTop(pravdaKino.getMovieList()),
                        pravdaKino.averageCinemaRate(pravdaKino.getMovieList()),true);

// выводим отсортированный список фильмов, чей рейтинг ниже среднего по кинотеатру
    System.out.println("Cписок фильмов, чей рейтинг ниже среднего по кинотеатру \"PravdaKino\": ");
    pravdaKino.infoList(pravdaKino.sortListTop(pravdaKino.getMovieList()),
                        pravdaKino.averageCinemaRate(pravdaKino.getMovieList()),false);

    //Задаем рейтинг вручную
    Scanner scanner = new Scanner(System.in);
    double rate;
    do {
      System.out.print("Введите рейтинг для вывода фильмов (1-5): ");
      rate = scanner.nextDouble();
    }while (rate < 1 || rate > 5);

// выводим отсортированный список фильмов, чей рейтинг выше заданного по кинотеатру
    System.out.println("Cписок фильмов, чей рейтинг выше заданного по кинотеатру \"PravdaKino\": ");
    pravdaKino.infoList(pravdaKino.sortListTop(pravdaKino.getMovieList()), rate,true);

// выводим отсортированный список фильмов, чей рейтинг ниже заданного по кинотеатру
    System.out.println("Cписок фильмов, чей рейтинг ниже заданного по кинотеатру \"PravdaKino\": ");
    pravdaKino.infoList(pravdaKino.sortListTop(pravdaKino.getMovieList()), rate,false);


  }
}
