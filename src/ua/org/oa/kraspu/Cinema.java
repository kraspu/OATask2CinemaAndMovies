package ua.org.oa.kraspu;

import java.util.ArrayList;



public class Cinema {

  private ArrayList<Movies> movieList = new ArrayList<>();



  public void addMovie(Movies mov) {
      movieList.add(mov);
  }


  public void infoList() {
    for (Movies li : movieList) {
      System.out.println(li);
    }
  }
}
