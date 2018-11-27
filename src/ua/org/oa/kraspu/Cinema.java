package ua.org.oa.kraspu;

import java.util.ArrayList;

public class Cinema {
  ArrayList<Movies> movieList = new ArrayList<>();
  Movies mov1 = new Movies("\tФантастичнi звiрi: Злочини Грiндельвальда", "Adventure, Family, Fantasy",136, 5);
  movieList.add(mov1);
  movieList.add(new Movies("\t\tБогемна рапсодiя", " Biography, Drama, Music",134, 0));

  public void infoList() {
    for (Movies li : movieList) {
      System.out.println(li);
    }
  }
}
