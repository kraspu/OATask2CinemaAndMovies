package ua.org.oa.kraspu;

import java.util.ArrayList;



public class Cinema {

  public ArrayList<Movies> getMovieList() {
    return movieList;
  }

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


  public void infoList(ArrayList<Movies> m, int size) {
//    for (Movies li : m) {
    for (int i = 0; i < size; ++i) {
      System.out.print("Title: " + m.get(i).getTitle() + " || ");
      System.out.print("Genre: " + m.get(i).getGenres() + " || ");
      System.out.print("Runtime: " + m.get(i).getRuntime() + " min" + " || ");
      System.out.print("Average Rate: " + m.get(i).getRate() + "\n");
    }
    System.out.println("===============================================");

  }

  public ArrayList sortListBad3 (ArrayList<Movies> list) {
      Movies t;
      //Bubble sort
    for (int i = 1; i < list.size(); ++i) {
        for (int j = list.size() - 1; j >= i; --j ) {
            if (list.get(j-1).getRate() > list.get(j).getRate()) {
                t = list.get(j-1);
                list.set(j-1, list.get(j));
                list.set(j, t);
            }
        }
    }
    return list;
  }

  public ArrayList sortListTop3 (ArrayList<Movies> list) {
      Movies t;
      //Bubble sort
    for (int i = 1; i < list.size(); ++i) {
        for (int j = list.size() - 1; j >= i; --j ) {
            if (list.get(j-1).getRate() < list.get(j).getRate()) {
                t = list.get(j-1);
                list.set(j-1, list.get(j));
                list.set(j, t);
            }
        }
    }
    return list;
  }




}
