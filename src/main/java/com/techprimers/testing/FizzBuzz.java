package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("modify changes..");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";


        return String.valueOf(number);
    }
}
