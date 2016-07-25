/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.skarflex.mylife.widget.calendar;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Familie
 */
public class Calendar extends Tab {
    
    @FXML
    private AnchorPane anchorPane;
    
    public Calendar() throws IOException{
        
        anchorPane.
        
        FXMLLoader calendarLoader = new FXMLLoader().load(getClass().getResource("/fxml/Calendar.fxml"));
    }
}
