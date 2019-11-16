package companyQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleArc {

public static void main(String args[])throws IOException { 
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Radius : ");
    double radius = Double.parseDouble(ob.readLine()); 
    System.out.println("Angle : ");
    double angle = Double.parseDouble(ob.readLine()); 
    double arc_length;

    if (angle > 360) { 
        System.out.println("Invalid angle"); 
    } 
    else { 
        arc_length = (2*Math.PI * radius) * (angle / 360.0);
        System.out.println("Arc length : "+arc_length); 
    }
    
} 
}