package collection;

import java.util.ArrayList;
import java.util.List;

public class Evision {
        String name;
        Integer number;
        String email;
        public Evision(String name,Integer number,String email){
            this.name=name;
            this.number=number;
            this.email=email;
        }

    public String getEmail() {
        return this.email;
    }

    public static void main(String[] args) {
        Evision e=new Evision("Ayush",12333,"ayush@gmail.com");
        Evision e1=new Evision("Nikhil",12313,"ay@gmail.com");
        Evision e2=new Evision("Pawan",2333,"ysh@gmail.com");
        Evision e3=new Evision("Vinay",233,"sh@gmail.com");
        Evision e4=new Evision("Sahil",123355,"ah@gmail.com");
        Evision e5=new Evision("Sanjana",12355,"h@gmail.com");
        List<Evision> evisionArrayList= new ArrayList<Evision>();
        evisionArrayList.addAll(List.of(e,e1,e2,e3,e4,e5));
        System.out.println(evisionArrayList.get(2).getEmail());






    }





}
