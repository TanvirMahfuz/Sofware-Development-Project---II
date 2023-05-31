package org.example;

import java.util.List;

public class Admin {
    private String admin_Name="mahfuz";
    private List<User> users;
    private List<Lawyer> lawyars;

    Admin(List<User> users,List<Lawyer> lawyars){
        this.users=users;
        this.lawyars = lawyars;
    }

    void printUsers(){
        int i;
        for(i=0;i<users.size();i++)
        {
            System.out.println("User ID: "+ users.get(i).id);
            System.out.println("User name: "+ users.get(i).name);
            System.out.println("User input: "+ users.get(i).input);
        }
    }
    void printLawyars(){
        int i;
        for(i=0;i<lawyars.size();i++)
        {
            if(lawyars.get(i)==null) {
                System.out.println("No client yet..");
                continue;
            }
            else
            {
                System.out.println("lawyer name: "+lawyars.get(i).name);

                //System.out.println(lawyars.get(i).user_index);
                if(lawyars.get(i).user_index==0){
                    System.out.println("No client yet..");
                    continue;
                }
                else{
                    System.out.println("Clients: ");
                    lawyars.get(i).PrintUsers();
                }

            }
        }

    }
}
