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
public class Palindrome {
    
        public boolean isPalindrome (String word)
        {
            String newWord = "";

            int i = word.length() - 1;

            while(i >= 0)
            {
                newWord = newWord + word.charAt(i);
                i--;
            }

            return newWord.equalsIgnoreCase(word);
        }
    
}
