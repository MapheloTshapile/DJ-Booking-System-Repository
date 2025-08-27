/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.domain;

/*
DJ.java
Admin POJO Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 11 May 2025
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {

//Tags to create auto generated primary key Id. 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Entity attributes.
    private String adminNumber, adminFirstName, adminLastName, adminContactNumber, adminHomeAddress, adminEmailAddress, adminWorkExperince;

    //No argument/empty constructor.
    public Admin() {

    }

    //Builder pattern constructor.
    private Admin(AdminBuilder builder) {

        this.adminContactNumber = builder.adminNumber;
        this.adminFirstName = builder.adminFirstName;
        this.adminLastName = builder.adminLastName;
        this.adminContactNumber = builder.adminContactNumber;
        this.adminHomeAddress = builder.adminHomeAddress;
        this.adminEmailAddress = builder.adminEmailAddress;
        this.adminWorkExperince = builder.adminWorkExperince;

    }

    public String getAdminNumber() {
        return adminNumber;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public String getAdminContactNumber() {
        return adminContactNumber;
    }

    public String getAdminHomeAddress() {
        return adminHomeAddress;
    }

    public String getAdminEmailAddress() {
        return adminEmailAddress;
    }

    public String getAdminWorkExperince() {
        return adminWorkExperince;
    }

    //toString method.
    @Override
    public String toString() {
        return "Admin{" + "adminNumber=" + adminNumber + ", adminFirstName=" + adminFirstName + ", adminLastName=" + adminLastName + ", adminContactNumber=" + adminContactNumber + ", adminHomeAddress=" + adminHomeAddress + ", adminEmailAddress=" + adminEmailAddress + ", adminWorkExperince=" + adminWorkExperince + '}';

    }

    //Builder pattern inner class.
    public static class AdminBuilder {
//Builder pattern attributes.

        private String adminNumber, adminFirstName, adminLastName, adminContactNumber, adminHomeAddress, adminEmailAddress, adminWorkExperince;

        //Builder pattern inner class mutators.
        public AdminBuilder setadminNumber(String adminNumber) {
            this.adminNumber = adminNumber;
            return this;
        }

        public AdminBuilder setadminFirstName(String adminFirstName) {
            this.adminFirstName = adminFirstName;
            return this;
        }

        public AdminBuilder setadminLastName(String adminLastName) {
            this.adminLastName = adminLastName;
            return this;
        }

        public AdminBuilder setadminContactNumber(String adminContactNumber) {
            this.adminContactNumber = adminContactNumber;
            return this;
        }

        public AdminBuilder setadminHomeAddress(String adminHomeAddress) {
            this.adminHomeAddress = adminHomeAddress;
            return this;
        }

        public AdminBuilder setadminEmailAddress(String adminEmailAddress) {
            this.adminEmailAddress = adminEmailAddress;
            return this;
        }

        public AdminBuilder setadminWorkExperince(String adminWorkExperince) {
            this.adminWorkExperince = adminWorkExperince;
            return this;
        }

//method of type DJ that returns an instance of the builder pattern inner class.
        public Admin AdminBuild() {

            return new Admin(this);
        }

    }

}//End of Class
