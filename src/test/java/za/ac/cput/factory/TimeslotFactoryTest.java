//package za.ac.cput.factory;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class TimeslotFactoryTest {
//
//        private String validTimeSlotId;
//        private int validTimeSlotDuration;
//        private String validDjAvailabilityStatus;
//
//        @BeforeEach
//        void setUp() {
//            // Set up valid input values for the test
//            validTimeSlotId = "TS01";
//            validTimeSlotDuration = 60;
//            validDjAvailabilityStatus = "Available";
//        }
//
//        @Test
//        void testValidatedCreateTimeslot() {
//            // Call the factory method with valid inputs
//            assertDoesNotThrow(() -> TimeslotFactory.validatedCreateTimeslot(validTimeSlotId, validTimeSlotDuration, validDjAvailabilityStatus));
//
//            // Additional check to ensure input values pass through validation (you could mock the helper class for deeper tests)
//            System.out.println("validatedCreateTimeslot executed successfully.");
//        }
//
//        @Test
//        void testInvalidTimeSlotId() {
//            String invalidTimeSlotId = ""; // Invalid input for testing
//            Exception exception = assertThrows(IllegalArgumentException.class,
//                    () -> TimeslotFactory.validatedCreateTimeslot(invalidTimeSlotId, validTimeSlotDuration, validDjAvailabilityStatus));
//
//            System.out.println("Invalid TimeSlotId Exception: " + exception.getMessage());
//        }
//
//        @Test
//        void testInvalidTimeSlotDuration() {
//            int invalidTimeSlotDuration = -1; // Invalid input for testing
//            Exception exception = assertThrows(IllegalArgumentException.class,
//                    () -> TimeslotFactory.validatedCreateTimeslot(validTimeSlotId, invalidTimeSlotDuration, validDjAvailabilityStatus));
//
//            System.out.println("Invalid TimeSlotDuration Exception: " + exception.getMessage());
//        }
//
//        @Test
//        void testInvalidDjAvailabilityStatus() {
//            String invalidDjAvailabilityStatus = "Unavailable"; // Invalid input for testing
//            Exception exception = assertThrows(IllegalArgumentException.class,
//                    () -> TimeslotFactory.validatedCreateTimeslot(validTimeSlotId, validTimeSlotDuration, invalidDjAvailabilityStatus));
//
//            System.out.println("Invalid DJ Availability Status Exception: " + exception.getMessage());
//        }
//    }
