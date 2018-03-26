/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package andriodmentor;

/**
 *
 * @author -
 */
public class Andriodmentor {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Palindrome n = new Palindrome();
        
//        System.out.println(n.isPalindrome("woW"));
        
        TextInput input = new NumericInput();
        
        input.add('d');
        input.add('c');
        input.add('5');
        input.add('a');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
        
        
    }
    
    
    
    
}
