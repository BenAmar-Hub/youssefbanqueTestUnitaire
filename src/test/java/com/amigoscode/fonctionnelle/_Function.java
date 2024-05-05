package com.amigoscode.fonctionnelle;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);
        System.out.println("***************functional used approach*************");
        // with apply to runner
        System.out.println("******* function with one input*******");
        Integer increment1 = incrementByOneFunction.apply(1);
        System.out.println(increment1);
        System.out.println("******* function with both input*******");
        Integer increment2 = incrementByOneAndMultiplyByOne.apply(2, 2);
        System.out.println(increment2);
    }
   static Function<Integer,Integer> incrementByOneFunction=
           number->number + 1;
    static int increment(int number){
        return number+1;
    }
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByOne=
            (incrementByOne, multiplyByOne)->(incrementByOne + 1) * multiplyByOne;
}
