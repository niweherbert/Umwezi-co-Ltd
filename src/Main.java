import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        car Mybenz = new car();
        System.out.println(Mybenz.name);
        System.out.println(Mybenz.Model);
        Mybenz.brake();
        Mybenz.drive();
        System.out.println(Mybenz.Price);




}

}