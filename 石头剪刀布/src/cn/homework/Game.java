package cn.homework;
import java.util.Random;
public class Game {
    public static void main(String []args){
        String result=playgame(0);
        System.out.println(result);
    }
    public static String playgame(int user){
        //用户输入
        //System.out.println("请输入您要出的：如果出石头请输入0  如果出剪刀请输入1  如果出布请输入2");
        //系统生成
        Random xx    =    new Random();    //声明随机数
        int number    =    xx.nextInt(3);    //赋值随机数给number
        //比较
        if(user==0 && number==0){
            return  "你出的是石头，系统出的是石头，双方平局。";
        }
        else if(user==1 && number==0){
            return  "你出的是剪刀，系统出的是石头，你输了。";
        }
        else if(user==2 && number==0){
            return "你出的是布，系统出的是石头，你赢了。";
        }
        else if(user==0 && number==1){
            return  "你出的是石头，系统出的是剪刀，你赢了。";
        }
        else if(user==1 && number==1){
            return "你出的是石头，系统出的是石头，双方平局。";
        }
        else if(user==2 && number==1){
            return "你出的是布，系统出的是剪刀，你输了。";
        }
        else if(user==0 && number==2){
            return "你出的是石头，系统出的是布，你输了。";
        }
        else if(user==1 && number==2){
            return "你出的是剪刀，系统出的是布，你赢了。";
        }
        else{
            return "你出的是布，系统出的是布，双方平局。";
        }
    }

}
