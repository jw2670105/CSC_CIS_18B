/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex_1_4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author rcc
 */
public class Regex_1_4 {
    public static void main(String[] args) {
        List<String> input = new ArrayList<String>();
        input.add("123-45-6789");
        input.add("222-3-4444");
        input.add("000-11-3333");
        input.add("12-333-4444");
        input.add("111224444");
        
        String regex = "(\\d{3}[-]\\d{2}[-]\\d{4})|(\\d{9})";
                
        for (String num : input) {            
            /*if (num.matches(regex)) {
                System.out.println("Found good (3 to 5 digit numbers): " + num); */
            
            if (Pattern.matches(regex, num))
                System.out.println("Found good (3 to 5 digit numbers): " + num);
        }
    }
}