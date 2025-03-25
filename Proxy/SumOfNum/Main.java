package Proxy.SumOfNum;


//Write a program to implement a file system. Where create a folder , file or Other things.
//where one class implement all things and other class use it


public class Main {
    public static void main(String[] args) {

        try{
            Calculate proxy = new Proxy();
            Proxy.setRole("admin");
            System.out.println(proxy.sumOfNum(50,25));
        }catch (RuntimeException e){
            System.out.println("Error : " + e.getMessage());
        }


    }
}
