
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.domain;

/*
DJ.java
DJ POJO Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 11 May 2025
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DJ {
//Tags to create auto generated primary key Id. 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Entity attributes.
    private String djId, djName, contactNumber, emailAddress, availabilityStatus;

//No argument/empty constructor.
    public DJ() {
    }

//Builder pattern constructor.
    private DJ(DJBuilder builder) {

        this.djId = builder.djId;
        this.djName = builder.djName;
        this.contactNumber = builder.contactNumber;
        this.emailAddress = builder.emailAddress;
        this.availabilityStatus = builder.availabilityStatus;

    }
//Get methods.

    public String getDjId() {
        return djId;
    }

    public String getName() {
        return djName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }
//toString method.

    @Override
    public String toString() {
        return "DJ{" + "contactNumber=" + contactNumber + ", djId=" + djId + ", Name=" + djName + ", emailAddress=" + emailAddress + ", availabilityStatus=" + availabilityStatus + '}';
    }
//Builder pattern inner class.

    public static class DJBuilder {
//Builder pattern attributes.

        private String djId, djName, contactNumber, emailAddress, availabilityStatus;

        //Builder pattern inner class mutators.
        public DJBuilder setdjId(String djId) {
            this.djId = djId;
            return this;
        }

        public DJBuilder setcontactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public DJBuilder setdjName(String djName) {
            this.djName = djName;
            return this;
        }

        public DJBuilder setemailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public DJBuilder setavailabilityStatus(String availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            return this;
        }
//method of type DJ that returns an instance of the builder pattern inner class.

        public DJ DJBuild() {

            return new DJ(this);
        }

    }

}//End of Class DJ.
