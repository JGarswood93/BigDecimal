package com.barton;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalAdd {

    public static void main(String[] args) {
        BigDecimal A = new BigDecimal("234.43"); //WHY IS IT A STRING?
        BigDecimal fres = A.add(new BigDecimal("670.12"));//what is the anatomy?
        System.out.println("Add: " + fres);
        //MathContext
        MathContext fc = new MathContext(2, RoundingMode.DOWN);
        BigDecimal AdecMath = A.add(new BigDecimal("670.12"), fc);
        System.out.println("Add using MathContext : " + AdecMath);

        /**
         *        I don't get the e thing in compiler

         */

    }

}
