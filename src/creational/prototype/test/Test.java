package creational.prototype.test;

import creational.prototype.Students;

import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception{

        Students s1 = new Students().reload();
        Students s2 = (Students)s1.clone();
        Students s3 = (Students)s1.clone();
        List<String> list1 = s1.getStudents();
        List<String> list2 = s2.getStudents();
        List<String> list3 = s3.getStudents();
        list2.add("Raj Rakeesh");
        list3.remove(0);
        print(list1);
        System.out.println("======================");
        print(list2);
        System.out.println("======================");
        print(list3);
    }

    private static void print(List<String> list) {
        for(String s : list) {
            System.out.println(s);
        }
    }
}
