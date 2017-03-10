
import java.net.*;
import java.io.*;
import java.util.*;


public class Test {
  
    public static void main(String[] args)
    {
    int count=0;
    while(count<10) {
       try { Thread.sleep(1000); } catch(Exception e) {}
       count++;
       System.out.println("Here we go..."+count);
    }
    }
}