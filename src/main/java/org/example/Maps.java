package org.example;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empId = new HashMap();
        empId.put("John", 124159985);
        empId.put("Mike", 27894423);
        empId.put("Carl", 345464);
        empId.put("Jerry", 2456);
        System.out.println(empId);
        System.out.println(empId.get("John"));
        System.out.println(empId.containsKey("George"));
        empId.put("John",98745);
        System.out.println(empId);
        empId.replace("Kramel", 777 );
        System.out.println(empId);

    }
}
