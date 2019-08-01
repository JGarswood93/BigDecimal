package com.barton;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Not sure of what is going on here
 */
public class BigDecimalMult {
    public static void main(String[] args) {
        BigDecimal fdec = new BigDecimal("50.90");
        BigDecimal fdecRes = fdec.multiply(new BigDecimal("40.56"));
        System.out.println("Multiply: " + fdecRes);

        //Using MathContext
        MathContext nv = new MathContext(5, RoundingMode.DOWN);
        BigDecimal fdecMath = fdec.multiply(new BigDecimal("45.22"), nv);
        System.out.println("Multiply using MathContext: " + fdecMath);
    }
}
