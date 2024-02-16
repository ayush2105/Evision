//import onlinebankingsystem.Registration;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        //Registration r=new Registration();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String username,password,email;
//        long mobile;
//        char gender;
//        System.out.println("Enter a username : ");
//        username=sc.nextLine();
//
//        System.out.println("Enter a password : ");
//        password=sc.nextLine();
//
//        System.out.println("Enter a email : ");
//        email=sc.nextLine();
//
//        System.out.println("Enter a Mobile number(Only Int) : ");
//        mobile=sc.nextLong();
//
//        System.out.println("Enter a Date Of Birth(YYYY-MM-DD) : ");
//        String date= sc.next();
//        try{
//            Date dateOfBirth=dateFormat.parse(date);
//            r.setDateOfBirth(dateOfBirth);
////            System.out.println("You entered  :"+dateOfBirth);
//        }catch (ParseException pe){
//            System.out.println("Invalid date format.");
//        }
//        System.out.println("Enter a Gender(M/F) : ");
//        gender=sc.next().charAt(0);
//
//        r.setUsername(username);
//        r.setPassword(password);
//        r.setEmail(email);
//        r.setMobileNumber(mobile);
//        r.setGender(gender);
//        System.out.println("-------------------------------------------------");
//        System.out.println("Registration successfully.");
//        System.out.println("Username is : "+r.getUsername());
//        System.out.println("Email id is : "+r.getEmail());
//        System.out.println("Mobile number is : "+r.getMobileNumber());
//        System.out.println("Date of Birth is  : "+r.getDateOfBirth());
//        System.out.println("Gender is : "+r.getGender());
//        List<Registration> arrayList=new ArrayList<Registration>();
//        System.out.println("---------------------------------------------------");
////        System.out.println(arrayList.add(r));
//        for(Registration rt : arrayList){
//            System.out.println(rt.getUsername());
//            System.out.println(rt.getPassword());
//        }
//        }
//}