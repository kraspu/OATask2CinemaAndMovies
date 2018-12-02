package ua.org.oa.kraspu;

import java.util.ArrayList;
import java.util.Scanner;

//Класс для создания фильмов
public class Movies {

  private String title;   //название фильма
  private String genres;  //жанр
  private int runtime;    //продолжительность
  private double rate;       //рейтинг
  private ArrayList<Integer> rateCount = new ArrayList<>();  //счетчик оценок (1-5)

  //Перегруженный конструктор класса без параметров и ручным вводом данных о фильме
  public Movies() {
    System.out.println("Введите данные Вашего фильма: ");
    Scanner sc = new Scanner(System.in);
    System.out.print("Title: ");
    this.title = sc.nextLine();
    System.out.print("Genre: ");
    this.genres = sc.nextLine();
    System.out.print("Runtime: ");
    this.runtime = sc.nextInt();
    System.out.println("Enter your rate 5 times (1-5):");
    for (int i = 0; i < 5; i++) {
      int rC = sc.nextInt();
      if (rC >= 1 && rC <= 5) //с проверкой соответствует ли рейтинг заданному диапазону
      this.setRateCount(rC);
    }
  }

  //Перегруженный конструктор класса с параметрами
  public Movies(String title, String genres, int runtime) {
    this.title = title;
    this.genres = genres;
    this.runtime = runtime;
    this.setRandomRate(this);
  }

  public String getTitle() {

    return title;
  }

//  public void setTitle(String title) {
//
//    this.title = title;
//  }

  public String getGenres() {

    return genres;
  }

//  public void setGenres(String genres) {
//
//    this.genres = genres;
//  }

  public int getRuntime() {

    return runtime;
  }

//  public void setRuntime(int runtime) {
//
//    this.runtime = runtime;
//  }

  //средний рейтинг фильма
  public double getRate() {
    double sum = 0;
    for (int el : this.rateCount) {
      sum += el;
    }
    if (rateCount.size() != 0) {
      return this.rate = sum / this.rateCount.size();
    }else return 0;
  }

  //установка рейтинга фильма
  public void setRateCount(int rateCount) {
    if (rateCount >= 1 && rateCount <= 5){
      this.rateCount.add(rateCount);
    }
  }

  //метод для рандомного накручивания рейтинга фильма
  public void setRandomRate(Movies m) {
    for (int i = 0; i < 10; ++i) {
      m.setRateCount((int) (Math.ceil(Math.random() * 4 + 1)));
    }
  }
}
