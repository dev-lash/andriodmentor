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
public class TextInput {
    
    String Value;
    
    public void add (char c)
    {
        Value = Value + Character.toString(c);
    }
    
    public String getValue()
    {   
        return Value;
    }
    
}
