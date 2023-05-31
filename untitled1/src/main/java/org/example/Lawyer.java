package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lawyer {
    String name="lawyar1";
    int user_index=0;
    List<User> user=new ArrayList<>();
    User obj;

    void setUser(User ob){
        user.add(ob);
    }
    void setUserInput(String s, int i){
        user.get(i).input=s;
    }
    void PrintUsers(){
        int i;
        for(i=0;i<user.size();i++)
        {
            System.out.println("User ID: "+ user.get(i).id);
            System.out.println("User name: "+ user.get(i).name);
            System.out.println("User input: "+ user.get(i).input);
        }
    }

    void Edit()
    {
        Scanner inp = new Scanner(System.in);
        String x=inp.nextLine();
        user.get((user.size())-1).input=x;
    }

}
