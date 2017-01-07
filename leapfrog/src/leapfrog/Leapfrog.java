/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapfrog;

import java.util.Scanner;
import leapfrog.util.ResultPublisher;

/**
 *
 * @author Demon
 */
public class Leapfrog {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] students={"Aryan","Anish","Anjal"};
        String[] subjects={"English","Science","Math"};
        int[][] marks=new int[students.length][subjects.length];
        
        
        for(int i=0;i<students.length;i++){
            System.out.println("Marks entry of"+students[i]);
            for(int j=0;j<subjects.length;j++){
                System.out.println("Enter the marks for"+subjects[j]);
                marks[i][j]=input.nextInt();
        }
        }
        
        
        ResultPublisher publisher=new ResultPublisher(subjects);
       for(int i=0;i<students.length;i++){
           publisher.setMarks(marks[i]);
           System.out.println(publisher.getTotal());
           
        }
}       
}
