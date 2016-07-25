package de.skarflex.mylife;

import de.skarflex.mylife.widget.calendar.Calendar;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    
    @FXML
    private VBox mainPaneVBox;
    
    @FXML
    private MenuBar menuBar;
    
    @FXML
    private ToolBar toolBar;
    
    @FXML
    private SplitPane splitPane;
    
    @FXML
    private TabPane tabPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            tabPane.getTabs().add(new Calendar());
        } catch (IOException ex) {
            Logger.getLogger(FXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calculateSize(){
        splitPane.setPrefHeight(mainPaneVBox.getHeight() - menuBar.getHeight() - toolBar.getHeight());
        splitPane.setDividerPositions(0.8);
    }
}
