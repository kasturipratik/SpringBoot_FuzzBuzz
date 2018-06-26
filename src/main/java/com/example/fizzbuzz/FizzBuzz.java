package com.example.fizzbuzz;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

public class FizzBuzz {

    @NotNull
    @Min(1)
    private int start;

    @NotNull
    @Min(2)
    private int end;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public static ArrayList<String> print(int start, int end){

        ArrayList<String> result = new ArrayList<>();

        for(int i = start ; i <= end ;i++){
            if(i %3 ==0){
                if(i%5 ==0){
                    result.add("FizzBuzz");
                }
                else {
                    result.add("Fizz");
                }
            }
            else if(i%5 == 0){
                if(i%3 == 0){
                    result.add("FizzBuzz");
                }
                else {
                    result.add("Buzz");
                }
            }
            else {
                result.add(String.valueOf(i));
            }
        }
        return result;

    }




}
