package org.example.codingWithJohn.exeptions;

public class printANumber {
    public static void main(String[] args) {
        System.out.println(printANumber());
    }
    private static int printANumber(){
        try{
            return 3;
        }
        catch (Exception e){
            return 4;
        }
        finally {
            return 5;
        }
    }
}
