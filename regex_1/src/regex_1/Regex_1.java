/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex_1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author rcc
 */
public class Regex_1 {
    public static void main(String[] args) {
        List<String> input = new ArrayList<String>();
        input.add("1");
        input.add("22");
        input.add("333");
        input.add("4444");
        input.add("55555");
        input.add("666666");

        String regex = "\\d{3,5}";
                
        for (String num : input) {            
            /*if (num.matches(regex)) {
                System.out.println("Found good (3 to 5 digit numbers): " + num); */
            
            if (Pattern.matches(regex, num))
                System.out.println("Found good (3 to 5 digit numbers): " + num);
        }
    }
}