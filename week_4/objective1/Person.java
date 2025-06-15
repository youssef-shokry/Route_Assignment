package week_4.objective1;

import java.util.ArrayList;

public class Person {
    protected String name;
    protected String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return  address;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.address + ")";
    }

    public static boolean linerSearch(String word, ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).equals(word)) return true;
        }
        return false;
    }
}
