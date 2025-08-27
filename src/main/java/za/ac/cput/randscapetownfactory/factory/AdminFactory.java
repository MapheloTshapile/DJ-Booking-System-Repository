/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.factory;

/*
AdminFactory.java
AdminFactory Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 15 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.Admin;
import za.ac.cput.randscapetownfactory.util.Helper;

public class AdminFactory {

    public static Admin createAdmin(String adminNumber, String adminFirstName, String adminLastName, String adminContactNumber, String adminHomeAddress, String adminEmailAddress, String adminWorkExperince) {

        Helper.generateID(adminNumber);
        Helper.isStringNullOrEmpty(adminFirstName);
        Helper.isStringNullOrEmpty(adminLastName);
        Helper.isValidContactNumber(adminContactNumber);
        Helper.isStringNullOrEmpty(adminHomeAddress);
        Helper.isValidEmail(adminEmailAddress);
        Helper.isStringNullOrEmpty(adminWorkExperince);

        return new Admin.AdminBuilder()
                .setadminNumber(adminNumber)
                .setadminFirstName(adminFirstName)
                .setadminLastName(adminLastName)
                .setadminContactNumber(adminContactNumber)
                .setadminEmailAddress(adminEmailAddress)
                .setadminHomeAddress(adminHomeAddress)
                .setadminWorkExperince(adminWorkExperince)
                .AdminBuild();

    }

    public static Admin createBasic() {
        return new Admin.AdminBuilder()
                .setadminNumber("ad01")
                .setadminFirstName("Maphelo")
                .setadminLastName("Tshapile")
                .setadminContactNumber("0745670032")
                .setadminEmailAddress("tshapilem@mycput.ac.za")
                .setadminHomeAddress("57 Alder St., Green Point")
                .setadminWorkExperince("5 Years")
                .AdminBuild();
    }

}
