package com.company;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

class A{

    public void printt(){
        System.out.println("Helloooooo World");
    }
}

class B{
    @Autowired
    public A obj;
    public void func(){
        obj.printt();
    }
}

public class Main {

    public static void main(String[] args) {
        B obj = new B();
        obj.func();
    }
}
