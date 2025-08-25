package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.Date;
import za.ac.cput.factory.DateFactory;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class DateFactoryTest {

    private Date testDate;

    // Creates basic review object to be used in tests
    @BeforeEach
    void setUp() {
   testDate = DateFactory.createDate(
           "Saturday",
           "October",
           2004);
   }



    @Test
    @Order(1)
    public void testNotNull() {
        assertNotNull(testDate);
        System.out.println(testDate.toString());
    }

    @Test
    @Order(2)
    public void testDateValues() {

        assertEquals("Saturday", testDate.getDay());
        assertEquals("October", testDate.getMonth());
        assertEquals(2004, testDate.getYear());
        System.out.println(testDate.toString());
    }

    @Test
    @Order(3)
    public void testInvalidYear() {
        assertThrows(IllegalArgumentException.class, () ->
                DateFactory.createDate( "Sunday ", "October", -32232123 ));
    }

    @Test
    @Order(4)
    public void testEmptyDay() {
        assertThrows(IllegalArgumentException.class, () ->
                DateFactory.createDate( " ", "August", 2019));
    }

    @Test
    @Order(5)
    public void testInvalidMonth() {
        assertThrows(IllegalArgumentException.class, () ->
                DateFactory.createDate( "Saturday ", " 666 doajdiaw#!&*&$*(@ndiaew dawwdwa3223 wawadia#!&*&$*(@wdiwanmdiwand#!&*&$*(@njfnjeafaefoa ", 2019));
    }

    @Test
    @Order(6)
    public void testCreateBasic() {
        Date basicDate = DateFactory.createDate("Wednesday" ,"October" ,2002 );
        assertEquals("Wednesday", basicDate.getDay());
        assertEquals("October", basicDate.getMonth());
        assertEquals(2002, basicDate.getYear());

    }
}