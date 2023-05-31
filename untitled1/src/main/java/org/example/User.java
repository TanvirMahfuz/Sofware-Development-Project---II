package org.example;

import java.util.List;
import java.util.Scanner;
public class User {
    int id=1;
    String name="a";
    String input;

    String getInput(){
        return this.input;
    }

    public void setInput(String input) {
        Scanner ob = new Scanner(System.in);
        String inp = ob.nextLine();
        input = inp;
    }

}