package com.example.lab3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    private TextField entry1;

    @FXML
    private Label done1;

    @FXML
    private Label error1;

    @FXML
    private TextField entry2;

    @FXML
    private Label done2;

    @FXML
    private Label error2;
    @FXML

    //Завдання 1

    public void exercise1(ActionEvent event) {
        try {
            int n = Integer.parseInt(entry2.getText());
            int m = date(n);
            if (n<0) {
                error2.setText("Кількість секунд не може бути менше за 0. Спробуйте ще раз...");
                done2.setText("");
            } else {
                error2.setText("");
                done2.setText("Кількість повних хвилин, що пройшли з початку доби: " + m);
            }
        }
        catch(NumberFormatException e){
            error2.setText("Ви залишили поле пустим, або ввели букву. Спробуйте ще раз...");
            done2.setText("");
        }
    }
    public static int date(int n) {

        return n/60;

    }

    //Завдання 2

    @FXML
    public void exercise2(ActionEvent event) {
        try {
            int number = Integer.parseInt(entry1.getText().trim());
            String name = classmate(number);
            if (name == null) {
                error1.setText("В групі немає студента за таким номером!");
                done1.setText("");
            } else {
                error1.setText("");
                done1.setText("В групі за номером " + number + " є студент " + name);
            }
        }
        catch(NumberFormatException e){
            error1.setText("Ви залишили поле пустим, або ввели букву. Спробуйте ще раз...");
            done1.setText("");
        }


    }


    public static String classmate(int number) {
        switch (number) {
            case 1:
                return "Беліч Олександр";
            case 2:
                return "Глинський Петро";
            case 3:
                return "Григоращук Олександр";
            case 4:
                return "Ісопеску Михайло";
            case 5:
                return "Кожокар Діана";
            case 6:
                return "Няйко Андрій";
            case 7:
                return "Пепін Євгеній";
            case 8:
                return "Софроній Михайло";
            case 9:
                return "Топало Василь";
            case 10:
                return "Чорний Максим";
            default:
                return null;
        }
    }

    }
