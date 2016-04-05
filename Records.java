package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Records {
    
     public static void printComicList(ArrayList<ComicBook> comicBookList){
            for (Iterator<ComicBook> it = comicBookList.iterator(); it.hasNext();) {
                ComicBook comics = it.next();
                System.out.println(comics);
            }
     }
     
     public static String nextRecord(ArrayList<ComicBook> comicBookList){
          String elements = "";
          ListIterator<ComicBook> it = comicBookList.listIterator();
           while(it.hasNext()){
        	   elements =  ("index: " + it.nextIndex() + " value: " + it.next());
        	   // System.out.println("index: " + it.nextIndex() + " value: " + it.next());
           }
           return elements;   
     }
         
     public static ArrayList<ComicBook> searchComic(ArrayList<ComicBook> comics, String searchKey){
        ArrayList<ComicBook> ary = new ArrayList<ComicBook>();
        for(int i=0; i<comics.size();i++){
            if(comics.get(i).getTitle().toLowerCase().contains(searchKey.toLowerCase()))
                ary.add(comics.get(i));
        }
        return ary;
    }
}