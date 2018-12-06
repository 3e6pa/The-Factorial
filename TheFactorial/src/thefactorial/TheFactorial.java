package thefactorial;

import java.util.Scanner;

public class TheFactorial {
    
    public static StringBuilder reverse(String value) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<value.length(); i++)
                result.append(value.charAt(value.length()-i-1));
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder inputValue = new StringBuilder(reverse(in.nextLine()));
        StringBuilder factorial = new StringBuilder("1");

        int n = 1;
        if (inputValue.toString() == "1") 
            System.out.println(inputValue);       
        else
            while (!inputValue.toString().equals(factorial.toString()) && (n<=2000))
            {
                n++;
                int remainder = 0;
                for (int i = 0; i < factorial.length(); i++)
                {
                    remainder +=(factorial.codePointAt(i)-48) * n;
                    factorial.setCharAt(i,(char)(remainder % 10 + 48));
                    remainder /= 10;
                }
                while (remainder != 0)
                {
                    factorial.append((char)(remainder % 10 + 48));
                    remainder /= 10;
                }
            }
	System.out.println(n);
    }
}