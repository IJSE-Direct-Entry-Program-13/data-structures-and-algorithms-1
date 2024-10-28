package lk.ijse.dep13.fx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
//        ArrayList<String> courses = new ArrayList<>(Arrays.asList("gdse", "ijse", "cmjd"));
//        ObservableList<String> names = FXCollections.observableArrayList(courses);
//        System.out.println(names.isEmpty());
//        ObservableList<Integer> nums = FXCollections.observableArrayList(10,20,30);
//        System.out.println(nums);

//        ListChangeListener<Integer> observer1 = change ->{
//            System.out.println("Observer1 got notified:" + change);
//        };
//        ListChangeListener<Integer> observer2 = change ->{
//            System.out.println("Observer2 got notified: " + change);
//        };
//
//        ObservableList<Integer> nums = FXCollections.observableArrayList(10, 20, 30);
//        nums.addListener(observer1);
//        nums.addListener(observer2);
//        nums.add(40);
//        nums.add(50);
//        nums.remove(1);
//        nums.set(0, 5);
//        System.out.println(nums);


        ArrayList<String> alNames = new ArrayList<>(Arrays.asList("nuwan", "dep"));
        ObservableList<String> olNames = FXCollections.observableList(alNames);
        //ObservableList<String> olNames = FXCollections.observableArrayList(alNames);
        ListChangeListener<String> subscriber = change -> System.out.println(change);
        olNames.addListener(subscriber);
        olNames.add("ijse");
        olNames.add("kasun");
        System.out.println(olNames);
        System.out.println(alNames);
    }
}
