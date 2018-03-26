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
public class NumericInput extends TextInput{
    
    String regex = "\\d+";
    
    @Override
    public void add (char c)
    {
        
        String x = Character.toString(c);
        if(x.matches(regex))
        {
            Value = Value + x;
        }
    }
    
}
