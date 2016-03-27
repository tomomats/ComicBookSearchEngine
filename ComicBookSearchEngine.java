package comicbooksearchengine;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/**
 *
 * @author Tomo
 */
public class ComicBookSearchEngine extends Application {
    
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
        
        comicDataGridPane.setHgap(5);
        comicDataGridPane.setVgap(5);
        
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(50.0);
        comicDataGridPane.getColumnConstraints().addAll(col1, col1);
        
        txtTitle.setMaxWidth(Double.MAX_VALUE);
        
        
        txtTitle.setMaxWidth(Double.MAX_VALUE);
        
        
        centerBorderPane.setTop(comicDataGridPane);
        centerBorderPane.setCenter(txtDescription);
        txtDescription.setMaxHeight(Double.MAX_VALUE);

        
        root.setTop(gridPaneForTop);
        root.setBottom(gridPaneForBottom);
        root.setCenter(centerBorderPane);
        
        
                
        //Below is a test for using the comic book class with the gui.
        ComicBook testComic = new ComicBook("Superman", 5);
        
        btnSearch.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            txtDescription.setText(testComic.getTitle());
            }
        });
        
        
        
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Comic Book Search Engine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}