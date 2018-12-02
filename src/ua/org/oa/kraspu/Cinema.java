package ua.org.oa.kraspu;

import java.util.ArrayList;


//Класс для создания кинотеатров
public class Cinema {

  public ArrayList<Movies> getMovieList() {
    return movieList;
  }

  private ArrayList<Movies> movieList = new ArrayList<>(); //список фильмов



  public void addMovie(Movies mov) {
      movieList.add(mov);
  } //метод для добавления фильма в список



  //метод вывода в консоль полного списка фильмов кинотеатра с полной инфорацией о каждом фильме
  public void infoList(ArrayList<Movies> m, double rate, boolean top) {
    if (top == true) {
      for (int i = 0; i < m.size(); ++i) {
        if (m.get(i).getRate() >= rate) {
          System.out.print("Title: " + m.get(i).getTitle() + " || ");
          System.out.print("Genre: " + m.get(i).getGenres() + " || ");
          System.out.print("Runtime: " + m.get(i).getRuntime() + " min" + " || ");
          System.out.print("Average Rate: " + m.get(i).getRate() + "\n");
        }
      }
    } else {
      for (int i = 0; i < m.size(); ++i) {
        if (m.get(i).getRate() <= rate) {
          System.out.print("Title: " + m.get(i).getTitle() + " || ");
          System.out.print("Genre: " + m.get(i).getGenres() + " || ");
          System.out.print("Runtime: " + m.get(i).getRuntime() + " min" + " || ");
          System.out.print("Average Rate: " + m.get(i).getRate() + "\n");
        }
      }
    }
    System.out.println("===============================================");

  }

  //  Сортировка массива по рейтингу начиная с наибольшего
  public ArrayList sortListTop (ArrayList<Movies> list) {
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

  // Средняя оценка фильмов в кинотеатре
  public double averageCinemaRate (ArrayList<Movies> m) {
    double sum = 0;
    for (Movies mov : m) {
      sum += mov.getRate();
    }
    return sum / m.size();
  }


}
