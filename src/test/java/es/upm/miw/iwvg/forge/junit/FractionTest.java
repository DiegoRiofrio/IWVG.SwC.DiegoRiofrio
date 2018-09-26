package es.upm.miw.iwvg.forge.junit;


import es.upm.miw.iwvg.forge.junit.Fraction;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before(){
        fraction = new Fraction(20,4);
    }

    @Test
    void testNumeradorPorDefecto(){
        fraction = new Fraction();
        Assertions.assertEquals(1,fraction.getNumerator());
    }

    @Test
    void testFractionNumerator() {
        Assertions.assertEquals(20, fraction.getNumerator());
    }
    @Test
    void testFractionDenominator() {
        Assertions.assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testFraccionDecimal(){
        Assertions.assertEquals( 5, fraction.decimal(), 10e-5);
    }

    @Test
    void testIsPropia(){
        Assertions.assertEquals( false, fraction.isPropia());
        Fraction fraction_aux = new Fraction(2,4);
        Assertions.assertEquals( true, fraction_aux.isPropia());
    }

    @Test
    void testIsImpropia(){
        Assertions.assertEquals(true, fraction.isImpropia());
        Fraction fraction_propia = new Fraction(1,5);
        Assertions.assertEquals( false, fraction_propia.isImpropia());
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction2 = new Fraction(this.fraction.getDenominator(), this.fraction.getNumerator());
        assertTrue(this.fraction.isEquivalent(fraction2));
        Fraction fraction3 = new Fraction(this.fraction.getNumerator(), this.fraction.getDenominator());
        assertFalse(this.fraction.isEquivalent(fraction3));
    }
}