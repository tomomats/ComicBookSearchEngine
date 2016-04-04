/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comicbooksearchengine;

import static comicbooksearchengine.Records.printComicList;
import static comicbooksearchengine.Records.searchComic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class lists {
    
    public static void main (String [] args){
        
       ArrayList <ComicBook> comics = new ArrayList <ComicBook>();
       ArrayList <ComicBook> searchedComics = new ArrayList <ComicBook>();
       
       
       preSetComicList(comics);
      
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter a comic book you want");
        String searchedComic1 = userInput.nextLine();
        
        searchedComics = searchComic(comics,searchedComic1);
       // printComicList(searchedComics);
        
       nextRecord(searchedComics);
       
    
    }
    
        
    public static void preSetComicList(ArrayList<ComicBook> comicBookList){
        
        ComicBook comicName1 = new ComicBook ("SuperMan",5);
        ComicBook comicName2 = new ComicBook ("Wonder Woman",5);
        ComicBook comicName3 = new ComicBook ("Black Panther",5);
        ComicBook comicName4 = new ComicBook ("Batman",5);
        
        comicBookList.add(comicName1);
        comicBookList.add(comicName2);
        comicBookList.add(comicName3);
        comicBookList.add(comicName4);
        
    }
    
    
     public static void printComicList(ArrayList<ComicBook> comicBookList){
        
            for (Iterator<ComicBook> it = comicBookList.iterator(); it.hasNext();) {
                ComicBook comics = it.next();
                System.out.println(comics);
            }
    }
     
     
     public static String nextRecord(ArrayList<ComicBook> comicBookList){
         
          String elements = "";
          ListIterator it = comicBookList.listIterator();
          
       
           while(it.hasNext()){
               
        elements =  ("index: " + it.nextIndex() + " value: " + it.next());
       //System.out.println("index: " + it.nextIndex() + " value: " + it.next());
         
           }
          
      return elements;   
         
     }
    
     
}
