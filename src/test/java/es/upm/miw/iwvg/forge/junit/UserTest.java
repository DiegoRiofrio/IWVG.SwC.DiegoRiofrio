package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

    private User user;

    @BeforeEach
    void before() {

        this.user = new User(10,"Diego", "Maradona");

    }

    @Test
    void testInitials() {
        Assertions.assertEquals("D.",user.initials());
    }

    @Test
    void testUserFullName() {

        Assertions.assertEquals("Diego Maradona", user.getName() + " " + user.getFamilyName());
    }

    @Test
    void testUserNumber() {

        Assertions.assertEquals(10, user.getNumber());
    }

    @Test
    void testUserName() {
        Assertions.assertEquals("Diego", user.getName());
    }

    @Test
    void testUserFamilyName() {
        Assertions.assertEquals("Maradona", user.getFamilyName());
    }

    @Test
    void testToUpperCase(){
        Assertions.assertEquals("DIEGO", this.user.getName().toUpperCase());
    }
}