package cn.homework;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class MyJavaFX extends Application {

    Lablepane lablepane=new Lablepane();
//    String str1;
//
//    public void setStr1(String str1) {
//        this.str1 = str1;
//    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);

        Label label = new Label("开始游戏：");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
        pane.add(label, 0, 0);
        //布
        Image image1 = new Image("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521291025265&di=a0bc9a448dfcaac150e064577e6dabfd&imgtype=0&src=http%3A%2F%2Fimg1.ali213.net%2Fshouyou%2Fcover%2Fc%2F48302.jpg");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitHeight(150);
        imageView1.setFitWidth(150);
        pane.add(imageView1, 0, 1);
        Image1HanderClass image1HanderClass = new Image1HanderClass();
        Button btOK1 = new Button("布");
        pane.add(btOK1, 0, 2);
        btOK1.setOnAction(image1HanderClass);
        //石头
        Image image2 = new Image("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1419901674,657140521&fm=27&gp=0.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(150);
        imageView2.setFitWidth(150);
        pane.add(imageView2, 1, 1);
        Image2HanderClass image2HanderClass = new Image2HanderClass();
        Button btOK2 = new Button("石头");
        pane.add(btOK2, 1, 2);
        btOK2.setOnAction(image2HanderClass);
        //剪刀
        Image image3 = new Image("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2460250897,3788214935&fm=27&gp=0.jpg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitHeight(150);
        imageView3.setFitWidth(150);
        pane.add(imageView3, 2, 1);
        Image3HanderClass image3HanderClass = new Image3HanderClass();
        Button btOK3 = new Button("剪刀");
        pane.add(btOK3, 2, 2);
        btOK3.setOnAction(image3HanderClass);


        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(lablepane);
        BorderPane.setAlignment(pane,Pos.CENTER);


        //游戏结束
//        Label label1 = new Label("111");
//        label1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
//        pane.add(label1, 0, 3);

        pane.setStyle("-fx-background-color: #0effb8");

        Scene scene = new Scene(borderPane, 800, 500);
        primaryStage.setTitle("石头剪刀布");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    class Image1HanderClass implements EventHandler<ActionEvent> {

        //布2
        @Override
        public void handle(ActionEvent event) {
            //System.out.println(event);
            Game game = new Game();
            String str = game.playgame(2);
            //setStr1(str);
            lablepane.show(str);
            System.out.println(str);

        }
    }

    class Image2HanderClass implements EventHandler<ActionEvent> {

        //石头0
        @Override
        public void handle(ActionEvent event) {
            Game game = new Game();
            String str = game.playgame(0);
            //setStr1(str);
            lablepane.show(str);
            System.out.println(str);
        }
    }

    class Image3HanderClass implements EventHandler<ActionEvent> {

        //剪刀1
        @Override
        public void handle(ActionEvent event) {
            Game game = new Game();
            String str = game.playgame(1);
            //setStr1(str);
            lablepane.show(str);
            System.out.println(str);
        }
    }
    class Lablepane extends StackPane{
        private Label label=new Label("结果");
        public Lablepane(){
            getChildren().add(label);
            label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
        }
        public void show(String str){
            label.setText(str);
        }
    }

}