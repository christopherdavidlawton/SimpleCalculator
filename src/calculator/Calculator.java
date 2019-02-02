/* Simple calculator designed by Christopher David Lawton */

package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.*;
import java.lang.StringBuilder;
import java.lang.Double;

/**
 *
 * @author cvota
 */
public class Calculator extends Application {
    
    static double number1, number2;
    static String operation, memory = "0";
    
    @Override
    public void start(Stage primaryStage) {
        
        // design the grid layout
        Label input = new Label();
        input.setText("0");
        Label expression = new Label(" ");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(5);
        grid.setVgap(5);

        //build my calculator
        Font font1 = new Font("SansSerif", 36);
        Font font2 = new Font("SansSerif", 12);
        
        HBox tExpress = new HBox(); // field to keep track of entry
        tExpress.setAlignment(Pos.TOP_RIGHT);
        expression.setFont(font2);
        tExpress.getChildren().add(expression);
        tExpress.setPrefHeight(20);
        tExpress.setPadding(new Insets(0, 5, 5, 5));
        grid.add(tExpress, 0, 0, 4, 1);
        
        HBox tInput = new HBox(); // field to keep track of active input
        tInput.setAlignment(Pos.BOTTOM_RIGHT);
        input.setFont(font1);
        tInput.getChildren().add(input);
        tInput.setPrefHeight(40);
        tInput.setPadding(new Insets(5, 5, 5, 5));
        grid.add(tInput, 0, 0, 4, 2);
        
        //design the buttons
        Button btnClear = new Button("C");
        btnClear.setPrefSize(50, 50);
        grid.add(btnClear, 0, 2);
        Button btnMemStore = new Button("MS");
        btnMemStore.setPrefSize(50, 50);
        grid.add(btnMemStore, 1, 2);
        Button btnMemRec = new Button("MR");
        btnMemRec.setPrefSize(50, 50);
        grid.add(btnMemRec, 2, 2);
        Button btn1 = new Button("1");
        btn1.setPrefSize(50, 50);
        grid.add(btn1, 0, 3);
        Button btn2 = new Button("2");
        btn2.setPrefSize(50, 50);
        grid.add(btn2, 1, 3);
        Button btn3 = new Button("3");
        btn3.setPrefSize(50, 50);
        grid.add(btn3, 2, 3);
        Button btn4 = new Button("4");
        btn4.setPrefSize(50, 50);
        grid.add(btn4, 0, 4);
        Button btn5 = new Button("5");
        btn5.setPrefSize(50, 50);
        grid.add(btn5, 1, 4);
        Button btn6 = new Button("6");
        btn6.setPrefSize(50, 50);
        grid.add(btn6, 2, 4);
        Button btn7 = new Button("7");
        btn7.setPrefSize(50, 50);
        grid.add(btn7, 0, 5);
        Button btn8 = new Button("8");
        btn8.setPrefSize(50, 50);
        grid.add(btn8, 1, 5);
        Button btn9 = new Button("9");
        btn9.setPrefSize(50, 50);
        grid.add(btn9, 2, 5);
        Button btn0 = new Button("0");
        btn0.setPrefSize(50, 50);
        grid.add(btn0, 1, 6);
        Button btnDec = new Button(".");
        btnDec.setPrefSize(50, 50);
        grid.add(btnDec, 0, 6);
        Button btnDel = new Button("DEL");
        btnDel.setPrefSize(50, 50);
        grid.add(btnDel, 2, 6);
        Button btnPlus = new Button("+");
        btnPlus.setPrefSize(50, 50);
        grid.add(btnPlus, 3, 2);
        Button btnMinus = new Button("-");
        btnMinus.setPrefSize(50, 50);
        grid.add(btnMinus, 3, 3);
        Button btnMult = new Button("*");
        btnMult.setPrefSize(50, 50);
        grid.add(btnMult, 3, 4);
        Button btnDiv = new Button("/");
        btnDiv.setPrefSize(50, 50);
        grid.add(btnDiv, 3, 5);
        Button btnEquals = new Button("=");
        btnEquals.setPrefSize(50, 50);
        grid.add(btnEquals, 3, 6);
        
        //let's add some button functionality
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "1");
                    } else {
                        input.setText("1");
                    }
                } else {return;}
            }
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "2");
                    } else {
                        input.setText("2");
                    }
                } else {return;}
            }
        });
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "3");
                    } else {
                        input.setText("3");
                    }
                } else {return;}
            }
        });
        
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "4");
                    } else {
                        input.setText("4");
                    }
                } else {return;}
            }
        });
        
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "5");
                    } else {
                        input.setText("5");
                    }
                } else {return;}
            }
        });
        
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "6");
                    } else {
                        input.setText("6");
                    }
                } else {return;}
            }
        });
        
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "7");
                    } else {
                        input.setText("7");
                    }
                } else {return;}
            }
        });

        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "8");
                    } else {
                        input.setText("8");
                    }
                } else {return;}
            }
        });
        
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "9");
                    } else {
                        input.setText("9");
                    }
                } else {return;}
            }
        });

        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    if(!temp1.equalsIgnoreCase("0")) {
                        input.setText(temp1 + "0");
                    } else {
                        return;
                    }
                } else {return;}
            }
        });

        btnDec.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(temp1.length() < 10){
                    input.setText(temp1 + ".");
                } else {return;}
            }
        });

        btnClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                input.setText("0");
            }
        });
        
        btnDel.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                int inputLength = temp1.length();
                int num = inputLength - 1;
                
                if (inputLength > 1){
                    StringBuilder del = new StringBuilder(temp1);
                    del.deleteCharAt(num);
                    input.setText(del.toString());
                } else if (inputLength == 1) { 
                    input.setText("0");
                }
           }
        });
        
        btnMemStore.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                memory = input.getText();
                input.setText("0");
            }
        });

        btnMemRec.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                input.setText(memory);
            }
        });
        
        btnPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                operation = ("plus");
                if(expression.getText().equals(" ")){
                    number1 = Double.parseDouble(temp1);
                    expression.setText(temp1 + " + ");
                    input.setText("0");
                } else {
                    number2 = Double.parseDouble(temp1);
                    Double answer = calcExp();
                    expression.setText(" ");
                    
                    // if answer is integer, display with no decimal places -- creates a cleaner look
                    if (answer.doubleValue() % 1 == 0) {
                        input.setText(String.valueOf(answer.intValue()));
                    }
                    else { input.setText(String.valueOf(answer)); }
                }
            }
        });
        
        btnMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                operation = ("minus");
                if(expression.getText().equals(" ")){
                    number1 = Double.parseDouble(temp1);
                    expression.setText(temp1 + " - ");
                    input.setText("0");
                } else {
                    number2 = Double.parseDouble(temp1);
                    Double answer = calcExp();
                    expression.setText(" ");
                    
                    // if answer is integer, display with no decimal places -- creates a cleaner look
                    if (answer.doubleValue() % 1 == 0) {
                        input.setText(String.valueOf(answer.intValue()));
                    }
                    else { input.setText(String.valueOf(answer)); }
                }
            }
        });
        
        btnMult.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                operation = ("multiply");
                if(expression.getText().equals(" ")){
                    number1 = Double.parseDouble(temp1);
                    expression.setText(temp1 + " * ");
                    input.setText("0");
                } else {
                    number2 = Double.parseDouble(temp1);
                    Double answer = calcExp();
                    expression.setText(" ");

                    // if answer is integer, display with no decimal places -- creates a cleaner look
                    if (answer.doubleValue() % 1 == 0) {
                        input.setText(String.valueOf(answer.intValue()));
                    }
                    else { input.setText(String.valueOf(answer)); }                    
                }
            }
        });
        
        btnDiv.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                operation = ("divide");
                if(expression.getText().equals(" ")){
                    number1 = Double.parseDouble(temp1);
                    expression.setText(temp1 + " / ");
                    input.setText("0");
                } else {
                    number2 = Double.parseDouble(temp1);
                    Double answer = calcExp();
                    expression.setText(" ");
                    
                    // if answer is integer, display with no decimal places -- creates a cleaner look
                    if (answer.doubleValue() % 1 == 0) {
                        input.setText(String.valueOf(answer.intValue()));
                    }
                    else { input.setText(String.valueOf(answer)); }                }
            }
        });
        

        btnEquals.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String temp1 = input.getText();
                if(expression.getText().equals(" ")){
                    input.setText(temp1);
                } else {
                    number2 = Double.parseDouble(temp1);
                    Double answer = calcExp();
                    expression.setText(" ");
                    
                    // if answer is integer, display with no decimal places -- creates a cleaner look
                    if (answer.doubleValue() % 1 == 0) {
                        input.setText(String.valueOf(answer.intValue()));
                    }
                    else { input.setText(String.valueOf(answer)); }
                }
            }
        });
        
        Scene scene = new Scene(grid);
        
        primaryStage.setTitle("Chris's Calculator!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    // new function for expression calculation.
    public static double calcExp() {
        double answer = 0.0;
        
        switch(operation) {
            case "plus" :
                answer = number1 + number2;
                break;
            
            case "minus" :
                answer = number1 - number2;
                break;
            
            case "multiply" :
                answer = number1 * number2;
                break;
                
            case "divide" :
                answer = number1 / number2;
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
