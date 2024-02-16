package onlinebankingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserManager {
    static List<User> users=new ArrayList<User>();
    static void registerUser(String userName, String password, String email, long mobileNumber, String dateofBirth, char gender){
        User newUser=new User(userName, password, email, mobileNumber, dateofBirth, gender);
        users.add(newUser);
//        System.out.println(users.get(0));
        System.out.println("Registration Successfully");
        System.out.println("User Detials ");
        System.out.println(newUser.userName+", "+newUser.email+", "+newUser.mobileNumber+", "+newUser.dateOfBirth+", "+newUser.gender);
        String add="AZ";
        String unique=UUID.randomUUID().toString().substring(0,8);
        System.out.println("Account number is : "+add+"-"+unique);
    }
    static User loginUser(String userName,String password){
        for(User u:users){
            if(u.userName.equals(userName) && u.password.equals(password)){
                return u;
            }
        }
        return null;
    }
}
