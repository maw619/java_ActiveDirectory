package com.app;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

public class TableViewController implements Initializable{

	@FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableColumn<?, ?> type;

    @FXML
    private TableColumn<?, ?> description;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		name = new TableColumn<>();
		name.setText("one");
		type = new TableColumn<>();
		type.setText("two");
		description = new TableColumn<>();
		description.setText("three");
	}
}
