package ua.org.oa.kraspu;

import java.util.ArrayList;



public class Cinema {

  private ArrayList<Movies> movieList = new ArrayList<>();



  public void addMovie(Movies mov) {
      movieList.add(mov);
  }

  public void setRandomRate(Movies m) {
    for (int i = 0; i < 10; ++i) {
      m.setRateCount((int) (Math.ceil(Math.random() * 4 + 1)));
//      System.out.println("random = " + (int) (Math.ceil(Math.random() * 4 + 1)));
    }
  }


  public void infoList() {
    for (Movies li : movieList) {
      System.out.print("Title: " + li.getTitle() + " || ");
      System.out.print("Genre: " + li.getGenres() + " || ");
      System.out.print("Runtime: " + li.getRuntime() + " min" + " || ");
      System.out.print("Average Rate: " + li.getRate() + "\n");
//      System.out.println("===============================================");
    }
  }
}
