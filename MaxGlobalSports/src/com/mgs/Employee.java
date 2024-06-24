package com.mgs;

     public class Employee {
         private String id;
         private String name;
         private String medicalConditions;
         private String allergies;
         private String contactPhone;
         private String contactEmail;

         public Employee(String id, String name, String medicalConditions, String allergies, String contactPhone, String contactEmail) {
             this.id = id;
             this.name = name;
             this.medicalConditions = medicalConditions;
             this.allergies = allergies;
             this.contactPhone = contactPhone;
             this.contactEmail = contactEmail;
         }

         public String getId() {
             return id;
         }

         public String getName() {
             return name;
         }

         public String getMedicalConditions() {
             return medicalConditions;
         }

         public String getAllergies() {
             return allergies;
         }

         public String getContactPhone() {
             return contactPhone;
         }

         public String getContactEmail() {
             return contactEmail;
         }

         @Override
         public String toString() {
             return "Employee ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Medical Conditions: " + medicalConditions + "\n" +
                    "Allergies: " + allergies + "\n" +
                    "Contact Phone: " + contactPhone + "\n" +
                    "Contact Email: " + contactEmail;
         }
     }