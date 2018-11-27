package ua.org.oa.kraspu;

import java.util.ArrayList;
import java.util.Scanner;

public class Movies {

  private String title;   //название фильма
  private String genres;  //жанр
  private int runtime;    //продолжительность
  private double rate;       //рейтинг
  private ArrayList<Integer> rateCount;  //счетчик оценок (1-5)

  public Movies(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Title: ");
    this.title = sc.next();
    System.out.print("\nGenre: ");
    this.genres = sc.next();
    System.out.print("\nRuntime: ");
    this.runtime = sc.nextInt();
  }

  public Movies(String title, String genres, int runtime) {
    this.title = title;
    this.genres = genres;
    this.runtime = runtime;
  }

  public Movies(String title, String genres, int runtime, int rateCount) {
    this.title = title;
    this.genres = genres;
    this.runtime = runtime;
    this.setRateCount(rateCount);
  }

  public String getTitle() {

    return title;
  }

  public void setTitle(String title) {

    this.title = title;
  }

  public String getGenres() {

    return genres;
  }

  public void setGenres(String genres) {

    this.genres = genres;
  }

  public int getRuntime() {

    return runtime;
  }

  public void setRuntime(int runtime) {

    this.runtime = runtime;
  }

  public double getRate() {
    double sum = 0;
    for (int el : this.rateCount) {
      sum += el;
    }
    return this.rate = sum / this.rateCount.size();
  }

  public void setRateCount(int rateCount) {
    if (rateCount >= 1 && rateCount <= 5){
      this.rateCount.add(rateCount);
    }
  }
}
