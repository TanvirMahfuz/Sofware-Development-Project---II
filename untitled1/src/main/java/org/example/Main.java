package org.example;

import java.util.*;

public class Main {
     static int user_index=0;
     static int lawyer_Index=0;
    static User getNewUser()
    {
        User user = new User();
        user.id=user_index;
        user_index++;
        Scanner ob = new Scanner(System.in);
        System.out.println("User Name: ");
        user.name=ob.nextLine();
        System.out.println("User Input: ");
        user.input=ob.nextLine();

        return user;
    }

    static void assignLawyer(User user)
    {

    }
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(getNewUser());

        List<Lawyer> lawyars= new ArrayList<>();

        Lawyer l1 = new Lawyer(); lawyars.add(l1);
        Lawyer l2 = new Lawyer(); lawyars.add(l2);

        System.out.println("select lawyar: 1 2");
        Scanner intinp = new Scanner(System.in);
        int select= intinp.nextInt();

        if(select==1) {
            l1.setUser(users.get(user_index - 1));l1.user_index++;
        }
        else {
            l2.setUser(users.get(user_index - 1));l2.user_index++;
        }

        Admin ad=new Admin(users,lawyars);
        ad.printUsers();
        ad.printLawyars();

        System.out.println("Edit user input? (Y/N)");
        String ch= intinp.nextLine();
        if(ch=="Y")
        {
            if(select==1) {
                l1.Edit();
                ad.printLawyars();
            }
            else {
                l2.Edit();
                ad.printLawyars();
            }
        }

        }

    }


