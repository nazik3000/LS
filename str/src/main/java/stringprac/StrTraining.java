package stringprac;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * Hello world!
 *
 */
public class StrTraining
{
    public static void main( String[] args ) {
        final String STRING_CONSTANT = "Pablo Antonio Plumb";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ending");
        //String string = scanner.nextLine();
       

        System.out.println("Parts");
        String string1 =scanner.nextLine();
        
        equalsPart(STRING_CONSTANT, string1);
        // System.out.println(Arrays.toString(charMaker(string))); 
        // ending(charMaker(string));
       
    }

    static char[] charMaker(String string) {
       char[] chars = new char[string.length()];

       for (int i = 0; i < chars.length; i++) {
        chars[i] = string.charAt(i);
        
       }
        return chars;
    }

    static boolean ending(char[] chars) {
        
        int count =0;
        for (int i = chars.length-2; i < chars.length; ) {
            if (chars[i] == 'e' && chars[i+1]=='s') {
                count=1;
                break;
            } else { 
                count= 0;
                break;
            }
        }
        if(count == 1) {
            return true;
        } else {return false;}
    }

    static void equalsPart(String string, String string1){
        String[] words = string.split(" ");
        String[] words1 = string1.split(" ");
        int count=0;
        for (int i = 0; i < words.length-1; i++) {
            for (int j = 0; j < words1.length; j++) {
                if(words1[0].equalsIgnoreCase(words[0])){
                   
                    count =2;
                    break;
                } else if(words1[j].equalsIgnoreCase(words[i])){
                    count=1;
                    break;
                }
                
            }
            if(count==1){break;}
        }
        if(count==1){
           System.out.println("TRUE");
        }
        else if(count==2){ 
            System.out.println("Start with: "+words[0]);
        }
       
    }

}
