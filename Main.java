package application;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.ListIterator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

 public class Main extends Application {
	 
	 /*
     ArrayList <ComicBook> comics = new ArrayList <ComicBook>();
     String theString = "";
     ComicBook cb = new ComicBook("", 1);
      
     ComicBook comicName1 = new ComicBook ("SuperMan",5);
     ComicBook comicName2 = new ComicBook ("Wonder Woman",5);
     ComicBook comicName3 = new ComicBook ("Black Panther",5);
     ComicBook comicName4 = new ComicBook ("ManHero",3);
     ComicBook comicName5 = new ComicBook ("ManCalvin",2);
     ComicBook comicName6 = new ComicBook ("HobbesMan",5);
     ComicBook comicName7 = new ComicBook ("Tomo The Super Hero",5);
        
     comics.add(comicName1);
     comics.add(comicName2);
     comics.add(comicName3);
     comics.add(comicName4);
     comics.add(comicName5);
     comics.add(comicName6);
     comics.add(comicName7);
     
     ListIterator<ComicBook> itNext = comics.listIterator();
     
     //Lists list = new Lists();
     // Lists.preSetComicList(comics);
     */
	 
     @Override
     public void start(Stage primaryStage) {
         
         // Labels
         Label lblHeader = new Label("Comicbook Search Engine");
         //Text Fields
         TextField txtTitle = new TextField(),
         txtAuthor = new TextField(),
         txtGenre = new TextField(),
         txtRating = new TextField(),
         txtDescription = new TextField();
         
         txtTitle.setPromptText("Title:");
         txtAuthor.setPromptText("Author:");
         txtGenre.setPromptText("Genre:");
         txtRating.setPromptText("Rating:");
         txtDescription.setPromptText("Description:");
             
         // Buttons
         Button btnSearch = new Button("Search"), 
         btnNewComic = new Button("Create New Comic"),
         btnEdit = new Button("Edit"), 
         btnPreviousRecord = new Button("Previous Record"), 
         btnNextRecord = new Button("Next Record"),
         btnFirstRecord = new Button("First Record"), 
         btnLastRecord = new Button("Last Record");
             
         // Text Field
         TextField searchBar = new TextField();
         
         // This is the root
         BorderPane root = new BorderPane();
         HBox pnlTopPanel = new HBox();
         
         // In the top of the root, we will have the title, search bar,
         // search button, and create new comic button.
         GridPane gridPaneForTop = new GridPane();
         gridPaneForTop.add(lblHeader, 1, 1);
         gridPaneForTop.add(searchBar, 1, 2);
         gridPaneForTop.add(btnSearch, 2, 2);
         gridPaneForTop.add(btnNewComic, 4, 2);
         
         gridPaneForTop.setHgap(5);
         gridPaneForTop.setVgap(5);
           
         // In the bottom of the root, we will have the four back/forwards 
         // buttons, and the edit button.
         GridPane gridPaneForBottom = new GridPane();
         gridPaneForBottom.add(btnFirstRecord, 1, 1);
         gridPaneForBottom.add(btnPreviousRecord, 2, 1);
         gridPaneForBottom.add(btnNextRecord, 3, 1);
         gridPaneForBottom.add(btnLastRecord, 4, 1);
         gridPaneForBottom.add(btnEdit, 5, 1);
        
         // In the center of the root, we will have labels (title, author,
         // genre, rating, and description).
         BorderPane centerBorderPane = new BorderPane();
         centerBorderPane.setMaxWidth(Double.MAX_VALUE);
         centerBorderPane.setMaxHeight(Double.MAX_VALUE);
         
         GridPane comicDataGridPane = new GridPane();
         comicDataGridPane.add(txtTitle, 0,0, 3, 1);
         comicDataGridPane.add(txtAuthor, 0,1, 3, 1);
         comicDataGridPane.add(txtGenre,0,2);
         comicDataGridPane.add(txtRating, 1, 2);
         
         // sets the spacing for the horizontal and vertical spacing between nodes
         comicDataGridPane.setHgap(5);
         comicDataGridPane.setVgap(5);
         
         // sets the spacing for the horizontal and vertical spacing between nodes and postion
         gridPaneForBottom.setHgap(5);
         gridPaneForBottom.setVgap(5);
         gridPaneForBottom.setAlignment(Pos.CENTER);
          
         // set the spacing between noded for the grid panes  
         Insets mainLabelInset = new Insets(5, 5, 5, 5);
           
         comicDataGridPane.setMargin(txtTitle,mainLabelInset);
         comicDataGridPane.setMargin(txtAuthor,mainLabelInset);
         comicDataGridPane.setMargin(txtGenre,mainLabelInset);
         comicDataGridPane.setMargin(txtRating,mainLabelInset);
         comicDataGridPane.setMargin(txtDescription,mainLabelInset);
             
         gridPaneForBottom.setMargin(btnPreviousRecord,mainLabelInset);
         gridPaneForBottom.setMargin(btnNewComic,mainLabelInset);
         gridPaneForBottom.setMargin(btnNextRecord,mainLabelInset);
         gridPaneForBottom.setMargin(btnFirstRecord,mainLabelInset);
         gridPaneForBottom.setMargin(btnLastRecord,mainLabelInset);
          
         // colmumn constraints for the nodes
         ColumnConstraints col1 = new ColumnConstraints();
         col1.setPercentWidth(50.0);
         comicDataGridPane.getColumnConstraints().addAll(col1, col1);
        
         txtTitle.setMaxWidth(Double.MAX_VALUE);
         txtTitle.setMaxWidth(Double.MAX_VALUE);
         
         
         // add the text box to center of screen
        centerBorderPane.setTop(comicDataGridPane);
        centerBorderPane.setCenter(txtDescription);
        txtDescription.setMaxHeight(Double.MAX_VALUE);
 
         // add all panes to scene
         root.setTop(gridPaneForTop);
         root.setBottom(gridPaneForBottom);
         root.setCenter(centerBorderPane);
         
                
         //Below is a test for using the comic book class with the gui.
        ComicBook testComic = new ComicBook("Superman", 5);
        // ArrayList <ComicBook> comics = new ArrayList <ComicBook>();
         // lists list = new lists();
         // lists.preSetComicList(comics);
        // event listener for search button
         btnSearch.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event){
             txtDescription.setText(testComic.getTitle());
             }
        });
     
         
         /*
         btnNextRecord.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                
                //String theString="";
                // int index=0;
        
                // ListIterator<ComicBook> itNext = comics.listIterator();
         
                ComicBook cb = new ComicBook("", 1);
                
                 if(itNext.hasNext()){
                     cb=(ComicBook)itNext.next();
                     theString = cb.getTitle();
             }
                 
                 System.out.println(cb);
                 System.out.println();
                
              txtDescription.setText(theString);
                
            }
        });
        
        btnLastRecord.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                
                String string = "";
                ComicBook cb = new ComicBook("", 1);
                
                ListIterator<ComicBook> it = comics.listIterator();
                
                while(it.hasNext()){
                    cb=it.next();
                    string = cb.getTitle();
                }
                
                txtDescription.setText(string);
            }
        });
          
        btnFirstRecord.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                
                String string = "";
                ListIterator<ComicBook> it = comics.listIterator();
                ComicBook cb = new ComicBook("", 1);
                
                if(it.hasNext()){
                    cb=(ComicBook)it.next();
                    System.out.println(cb);
                    string = cb.getTitle();
                }
                txtDescription.setText(string);
            }
        });
         */
         
         Scene scene = new Scene(root);
         
         primaryStage.setTitle("Comic Book Search Engine");
         primaryStage.setScene(scene);
         primaryStage.show();
     }
     
     public static void main(String[] args) {
         launch(args);
     }
 }