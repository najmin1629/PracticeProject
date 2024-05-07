package org.example.student7thMay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> st= Arrays.asList(
                new Student(55,"Ankita","Das","ECE","BU"),
                new Student(100,"Soma","Mondal","CSE","AOT"),
                new Student(72,"Aishani","Sarkar","ART","ART INSTITUTE"));
        st.stream().filter(s->s.getDepartment()=="CSE").forEach(s1->System.out.println(s1.getFirstname()));
        st.stream().filter(s->s.getCollegename().startsWith("A")).forEach(s->System.out.println(s.getFirstname()+" "+s.getLastname()));
        st.stream().filter(s->s.getRoll()==55).forEach(s->System.out.println(s.getDepartment()+" "+s.getCollegename()));
        List<Student> stList=st.stream().filter(s->s.getFirstname().startsWith("A")).map(s1->s1).collect(Collectors.toList());
        System.out.println(stList.size());
        stList.stream().forEach(s1->System.out.println(s1.getFirstname()));
        stList.stream().forEach(s1->System.out.println(s1.getRoll()));
        stList.stream().filter(s1->s1.getDepartment().endsWith("T")).forEach(s1->System.out.println(s1.getRoll()));
        List<Student> list=st.stream().filter(s->s.getCollegename().contains("B")).map(s1->s1).collect(Collectors.toList());
        list.stream().forEach(s1->System.out.println(s1.getRoll()));
    }
}
