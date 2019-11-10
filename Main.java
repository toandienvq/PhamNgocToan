package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    Button button, button1, button2, button3;

    @Override

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("toan");
        // vẽ ảnh nền
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext xxx = canvas.getGraphicsContext2D();
        Image image = new Image("orig_2332.jpg");
        xxx.drawImage(image, 0, 0, 800, 600);



        button = new Button();
        button.setText("NEW GAME");
        button.setLayoutX(100);
        button.setLayoutY(500);
        button.setPrefHeight(80);
        button.setPrefWidth(150);
        button.setStyle("-fx-font:22 algerian; -fx-base:#b6e7c9;");


        button1 = new Button();
        button1.setText("EXIT");
        button1.setLayoutX(350);
        button1.setLayoutY(500);
        button1.setPrefHeight(80);
        button1.setPrefWidth(150);
        button1.setStyle("-fx-font:22 algerian; -fx-base:#b6e7c9;");

        button2 = new Button();
        button2.setText("HELP");
        button2.setLayoutX(600);
        button2.setLayoutY(500);
        button2.setPrefHeight(80);
        button2.setPrefWidth(150);
        button2.setStyle("-fx-font:22 algerian; -fx-base:#b6e7c9;");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello Toan");
            }
        });

        button3 = new Button();
        button3.setLayoutX(300);
        button3.setLayoutY(200);

        Image image2 = new Image("towerDefense_tile205.jpg", 60, 60, false, true);
        ImageView iv = new ImageView(image2);
        button3.setGraphic(iv);
        button3.setMaxHeight(30);
        button3.setMaxWidth(30);

        Group layout = new Group();
        Scene scene = new Scene(layout, 800, 600);


        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                    Image image = new Image("bando.jpg");
                    ImageView iv = new ImageView(image);
                    layout.getChildren().add(iv);

            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // giới thiệu qua về game
                Label Logo = new Label("TOWER DEFENSE");
                Logo.setLayoutX(200);
                Logo.setLayoutY(50);
                Logo.setFont(new Font("Kristen ITC",60 ));
                Label Gioithieugame = new Label("Tower Defense là một tựa game thể loại phòng thủ chiến thuật mang phong cách\n"+
                        " tháp phòng thủ cực hay dành " +
                        "Tower Defense, người chơi sẽ trở thành một nhà quân\n " +
                        "sự " +
                        "chuyên nghiệp với sứ mệnh xây dựng pháo tháp phòng thủ để ngăn chặn đường\n " +
                        " tấn công của kẻ địch đang muốn xâm lược vương quốc của bạn.");
                Gioithieugame.setLayoutX(20);
                Gioithieugame.setLayoutY(200);
                //Logo1.setFont(new Font("Kristen ITC",20 ));
                Gioithieugame.setStyle("-fx-font:20 algerian; -fx-base:#b6e7c9;");
                layout.getChildren().addAll(Logo,Gioithieugame);
            }
        });



        layout.getChildren().addAll(canvas, button, button1, button2);// thêm thành phần vào cửa sổ
        primaryStage.setScene(scene); // tạo của sổ
        primaryStage.show();// Trình cửa sổ
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // thoát game
            }

            private void createBackground() {
                Image image = new Image("bando.jpg");
                ImageView iv = new ImageView(image);
                layout.getChildren().add(iv);
            }
        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}
