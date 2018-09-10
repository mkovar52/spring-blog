package com.blog.blog;

public class Pet {

    private long petId;
    private String name;
    private String breed;
    private String dateOfBirth;
    private int age;

    private String ownerFirstName;
    private String ownerLastName;
    private String ownerEmail;

    public Pet(){

    }


    public Pet(String name, String breed, String dateOfBirth){
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }



    // ======== Getters & Setters ======== \\

    public long getPetId(){
        return petId;
    }

    public void setPetId(long petId){
        this.petId = petId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOwnerFirstName(){
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName){
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName(){
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName){
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerEmail(){
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail){
        this.ownerEmail = ownerEmail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
