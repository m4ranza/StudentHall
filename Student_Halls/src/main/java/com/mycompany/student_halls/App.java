package com.mycompany.student_halls;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */


public class App extends Application {
    private StudentHall firstHall;
    
    @Override
    public void start(Stage stage) {
        firstHall = new StudentHall("Mandela Hall", 200);
        //create a gridpane
        GridPane root = new GridPane();
        root.setPadding(new Insets(15,15,15,15));
        root.setVgap(10);
        root.setHgap(10);
        
        //Add a title to the page
        Text title = new Text("Student Form");
        title.setFill(Paint.valueOf("#2A5058"));
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        
        
       
        
        //label for the student's ID
        Label lblId = new Label("Enter student's ID:  ");
        lblId.setFont(Font.font("Times", 20));
        TextField txtId = new TextField();
        
         //label for the student's name
        Label lblName = new Label("Enter student's first name:  ");
        lblName.setFont(Font.font("Times", 20));
        TextField txtName = new TextField();
        
          //label for the student's surname
        Label lblSurname = new Label("Enter student's surname:  ");
        lblSurname.setFont(Font.font("Times", 20));
        TextField txtSurname = new TextField();
        
          //label for the student's Gender
        Label lblGender = new Label("What's the student's gender:  ");
        lblGender.setFont(Font.font("Times", 20));
        TextField txtAddress = new TextField();
        
           //label for the student's DoB
        Label lblDob = new Label("What's the student's date of birth:  ");
        lblDob.setFont(Font.font("Times", 20));
        TextField txtDob = new TextField();
        
           //label for the student's Address
        Label lblAddress = new Label("Enter student's address:  ");
        lblAddress.setFont(Font.font("Times", 20));
        TextField txtGender = new TextField();
        
     
        
        
        //add a submit and clear button
        Button submit = new Button("Submit");
        Button clear = new Button("Clear");
        
        //Label for confirmation message
        Label lblResponse = new Label();
        lblResponse.setFont(Font.font("Times", 20));
        
        
        DropShadow shadow = new DropShadow();
        submit.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{
            submit.setEffect(shadow); });
        clear.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{
            clear.setEffect(shadow); });
        
        submit.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)-> {
            submit.setEffect(null);});
        clear.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)-> {
            clear.setEffect(null);});
        
        submit.setOnAction((ActionEvent e)->{
            if(txtId.getText()!=null && !txtId.getText().isEmpty())
            {
               Student myStu = new Student(txtId.getText(), txtName.getText(),txtSurname.getText(),txtGender.getText(),txtDob.getText(),txtAddress.getText());
               lblResponse.setText("Student added");
                
                
                firstHall.addStudent(myStu);
                lblResponse.setText(firstHall.displayStudents());
            }
            else
            {
                lblResponse.setText("You have entered a student");
            }
        });
       
        clear.setOnAction((ActionEvent e)-> {
            txtId.clear();
            txtName.clear();
            txtSurname.clear();
            txtGender.clear();
            txtDob.clear();
            txtAddress.clear();
            lblResponse.setText(null);
        });
       
        
        root.add(title, 0, 0, 2, 1);
        root.add(lblId, 0, 2);
        root.add(txtId,0,3);
        root.add(lblName, 0, 4);
        root.add(txtName, 0, 5);
        root.add(lblSurname,0,6);
        root.add(txtSurname,0,7);
        root.add(lblGender,0,8);
        root.add(txtGender,0,9);
        root.add(lblDob,0,10);
        root.add(txtDob,0,11);
        root.add(lblAddress,0,12);
        root.add(txtAddress,0,13);
        root.add(submit,0,18);
        root.add(clear,1, 18);
        root.add(lblResponse,0,20,2,1);
        
        Scene scene = new Scene(root, 1000, 1000);
       // scene.getStylesheets().add("comments/controlStyles.css");
        
        stage.setTitle("Student's registration form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}