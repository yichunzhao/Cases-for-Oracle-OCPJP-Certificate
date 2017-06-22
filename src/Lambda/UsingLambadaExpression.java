/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author YNZ
 */
public class UsingLambadaExpression {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Mike"));
        users.add(new User("Jeppe"));
        users.add(new User("Yichun"));
        Collections.sort(users, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("" + users);
    }

}
