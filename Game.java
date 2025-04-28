public class Game{
public static void showGameTitle(){
System.out.println("welcome to Adventure Quest");
}
public static void showGameRules(){
System.out.println("1.collect coins");
System.out.println("2. Avoid obstacles");
System.out.println("3. Reach the goal");
}
public static void showLoadingScreen(){
System.out.println("Loading game...please wait");
}
public static void main(String args[]){
showGameTitle();
showGameRules();
showLoadingScreen();
}}