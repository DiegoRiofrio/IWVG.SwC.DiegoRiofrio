package es.upm.miw.iwvg.forge.junit;


import es.upm.miw.iwvg.forge.junit.Fraction;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}