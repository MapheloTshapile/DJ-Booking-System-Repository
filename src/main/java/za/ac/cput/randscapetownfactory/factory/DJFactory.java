/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.factory;

/*
Equipment.java
Equipment DJFactory Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 15 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.DJ;
import za.ac.cput.randscapetownfactory.util.Helper;

public class DJFactory {

    public static DJ createDJ(String djId, String djName, String contactNumber, String emailAddress, String availabilityStatus) {

        Helper.generateID(djId);
        Helper.isStringNullOrEmpty(djName);
        Helper.isValidContactNumber(contactNumber);
        Helper.isValidEmail(emailAddress);
        Helper.isValidAvailStatus(availabilityStatus);

        return new DJ.DJBuilder()
                .setdjId(djId)
                .setdjName(djName)
                .setcontactNumber(contactNumber)
                .setemailAddress(emailAddress)
                .setavailabilityStatus(availabilityStatus)
                .DJBuild();

    }

    public static DJ createBasic() {
        return new DJ.DJBuilder()
                .setdjId("dj01")
                .setdjName("DJ Sdunkero")
                .setemailAddress("sdunkerodj@cput.ac.za")
                .setcontactNumber("0843975076")
                .setavailabilityStatus("Available")
                .DJBuild();
    }

}
