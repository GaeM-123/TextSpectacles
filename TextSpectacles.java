/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textspectacles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mmaga
 */
public class TextSpectacles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter message: ");
        message = input.nextLine();
        
        //length in bytes
        int byteLength = message.getBytes().length;
        System.out.println("The length of the message in bytes is: " + byteLength);
        
        //number of whitespace , commas , fullstop
        int whitespace = 0;
        int commas = 0;
        int fullstop = 0;
        
        for(char ch : message.toCharArray())
        {
            if(ch == ' ')
            {
                whitespace++;
            }
            else if(ch == ',')
            {
                commas++;
            }
            else if(ch == '.')
            {
                fullstop++;
            }
        }
        
         System.out.println("The number of whitespace is: " + whitespace);
         System.out.println("The number of commas is: " + commas);
         System.out.println("The number of fullstops is: " + fullstop);
        
        
        String[] words = message.split(" ");
        int wCount = words.length;
        
        System.out.println("The number of words is: " + wCount);
        
        //word occurrences
        Map<String , Integer>occurrence = new HashMap<>();
        
        for(String w: words)
        {
            w.toLowerCase();
            occurrence.put(w , occurrence.getOrDefault(w , 0) + 1);
        }
        
        for(Map.Entry data: occurrence.entrySet())
        {
            System.out.println(data.getKey() + " ---> " + data.getValue());
        }
        
        
    }
    
}
