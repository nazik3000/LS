package com.example;

import com.example.queue.StackStr;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) throws Exception {
        StackStr string  = new StackStr();
        string.add("{Naz}");
        string.add("[Ege]");
        string.add("(Joh");
        string.add("Nazar");
        System.out.println( string.toString());
        string.strToChar("Hello");
        
      
    }
    


    public static int getFactorial(int n) throws Exception {
        if(n<=0)throw new Exception("Invalid number for this opperation");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result*i;
        }
        return result;
        
    }
}
