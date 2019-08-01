package com.barton;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalSub {
    public static void main(String[] args) {
        BigDecimal n = new BigDecimal("50.67");
        BigDecimal ndec = n.subtract(new BigDecimal("44.57"));
        System.out.println("Subtract: " + ndec);

        //MathContext what is math context.
        MathContext mc = new MathContext(1, RoundingMode.FLOOR);
        BigDecimal ndecMath = n.subtract(new BigDecimal("44.57"), mc);
        System.out.println("Subtract using MathContext: " + ndecMath);
    }
}
