package com.app.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.app.dao.UserDaoImpl;
import com.app.db.Conexion;
import com.model.User;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class MainController implements Initializable{
	

    @FXML
    private ImageView avatar;

    @FXML
    private Label lblMemberOf;

    @FXML
    private TextField txtFirst;

    @FXML
    private TextField txtInitials;

    @FXML
    private TextField txtLast;

    @FXML
    private TextField txtDisplayName;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtOffice;

    @FXML
    private TextField txtTelephone;

    @FXML
    private Button btnOtherTelephone;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtWeb;

    @FXML
    private Button btnOtherWebpage;

    @FXML
    private Button btnOk;

    @FXML
    private Button btnCancel;
    
    @FXML
    private ComboBox<String> cmbList;
    
    List<String>listar;
    
    UserDaoImpl dimpl;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		cmbList.getItems().addAll(
//	            "jacob.smith@example.com",
//	            "isabella.johnson@example.com",
//	            "ethan.williams@example.com",
//	            "emma.jones@example.com",
//	            "michael.brown@example.com");
		lblMemberOf.setText("Administrator");
	}
	
	
	public void addUser() {
		dimpl = new UserDaoImpl();
		User u = new User();
		
		u.setUser_first_name(txtFirst.getText());
		u.setUser_last_name(txtLast.getText());
		u.setUser_email(txtEmail.getText());
		u.setTelephone(txtTelephone.getText());
		u.setDescription(txtDescription.getText());
		u.setUser_initials(txtInitials.getText());
		u.setDisplay_name(txtDisplayName.getText());
		u.setMemberOf("Administrator");
		u.setWebPage(txtWeb.getText());
		dimpl.addUser(u);
	}
	

}



























