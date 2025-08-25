///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
// */
//package za.ac.cput.factory;
///*
//DjfactoryTest.java
//DJ Factory Test Class
//Author: Maphelo Shaun Tshapile (213152231)
//Date: 22 March 2025
// */
//import za.ac.cput.domain.DJ;
//import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import za.ac.cput.domain.DJ.DJBuilder;
//import za.ac.cput.factory.DJfactory;
//import org.junit.jupiter.api.Test;
//
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class DJfactoryTest {
//
//    private static DJBuilder djShimza = new DJBuilder().setdjId("OPX909").setdjName("Dj Shimza").setcontactNumber("0747534193").setemailAddress("shimza@kunye.co.za").setavailabilityStatus("Not Available");
//
//    private static String djDesire = DJfactory.validateandCreateDJ("RAO8004", "Dj Desire", "0843454093", "desire@soulisticmusic.co.za", "Available");
//
//    @Test
//    @Order(1)
//    public void testNull() {
//
//        assertNotNull(djShimza);
//        System.out.println(djShimza.toString());
//
//        assertNotNull(djDesire);
//        System.out.println(djDesire);
//
//    }
//
//    @Test
//    @Order(2)
//    public void testAssert() {
//
//        assertEquals(djDesire, djShimza);
//
//        System.out.println(djShimza.toString());
//        System.out.println(djDesire);
//
//    }
//
//}//End of Class DJfactoryTest.
