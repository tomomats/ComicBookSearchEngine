package comicbooksearchengine;
import java.util.ArrayList;
import java.util.Iterator;

public class Records {
    
    ArrayList<ComicBook> comicBooks, sortComicBooks;
    
    
    public static void preSetComicList(ArrayList<ComicBook> comicBookList){
        
        ComicBook comicName1 = new ComicBook ("SuperMan",5);
        ComicBook comicName2 = new ComicBook ("Wonder Woman",5);
        ComicBook comicName3 = new ComicBook ("Black Panther",5);
        
        comicBookList.add(comicName1);
        comicBookList.add(comicName2);
        comicBookList.add(comicName3);
    }
    
    public static void addComic(ArrayList<ComicBook> comicBookList,String comicName1, int rating,int id){
        
        ComicBook comicName = new ComicBook(comicName1,rating);
        comicBookList.add(comicName);
        }
        
    public static void printComicList(ArrayList<ComicBook> comicBookList){
        
            for (Iterator<ComicBook> it = comicBookList.iterator(); it.hasNext();) {
                ComicBook comics = it.next();
                System.out.println(comics);
            }
    }
    
    
    public static ArrayList<ComicBook> searchComic(ArrayList<ComicBook> comics, String searchKey){
        ArrayList<ComicBook> comicsWithKeyInTitle = new ArrayList<ComicBook>();
        for(int i=0; i<comics.size(); i++){
            if(comics.get(i).getTitle().toLowerCase().contains(searchKey.toLowerCase()))
                comicsWithKeyInTitle.add(comics.get(i));
        }
        return comicsWithKeyInTitle;
    }
    
    // This method will delete a specfied comic form the comicBook List
    public static ArrayList<ComicBook> deleteComic(ArrayList<ComicBook> comicBookList,String searchKey){
        
        // creates a comicBook variable that will hold the deleted comic to confirm it has been deleted
        ComicBook deletedComic = new ComicBook("random",10);
        
       for(int i=0; i<comicBookList.size(); i++){
            if(comicBookList.get(i).getTitle().toLowerCase().contains(searchKey.toLowerCase())){
                
                deletedComic = comicBookList.get(i);
                    comicBookList.remove(comicBookList.get(i));
              
                }
            }
        
          System.out.println(deletedComic + "has been deleted");
          
        return comicBookList;
       }
    
    public static void addDescription(ArrayList<ComicBook> comicBookList,String searchKey, String description){
        
          ComicBook addDescriptionComic = new ComicBook("random",10);
          
         for(int i=0; i<comicBookList.size(); i++){
            if(comicBookList.get(i).getTitle().toLowerCase().contains(searchKey.toLowerCase())){
                
                addDescriptionComic  = comicBookList.get(i);
                comicBookList.get(i).setDescription(description);
                }
            }
        
          System.out.println(addDescriptionComic+ " descrption has been added");
        
    }
    public static void showDescription(ArrayList <ComicBook> comicBookList,String searchKey){
        
          ComicBook descriptionOfComic = new ComicBook("random",10);
          String comicDescription = "";
          
         for(int i=0; i<comicBookList.size(); i++){
            if(comicBookList.get(i).getTitle().toLowerCase().contains(searchKey.toLowerCase())){
                
                descriptionOfComic  = comicBookList.get(i);
                 comicDescription = comicBookList.get(i).getDescription();
                }
            }
        
          System.out.println(descriptionOfComic+ " descrption's is" + comicDescription);
        
    }
    
    public static void editComic(ArrayList<ComicBook> comicBookList, int index, String title, String author, int rating, String genre, String description){
        
        comicBookList.get(index).setTitle(title);
        comicBookList.get(index).setAuthor(author);
        comicBookList.get(index).setRating(rating);
        comicBookList.get(index).setGenre(genre);
        comicBookList.get(index).setDescription(description);
    }
}