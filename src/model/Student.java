package model;


import exception.InvalidDOBException;
import exception.InvalidFullNameException;
import exception.InvalidPhoneNumberException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private String fullName;
    private String doB;
    private String sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;

    public Student() {
    }

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws InvalidFullNameException {
        if (isValidFullName(fullName)) {
            this.fullName = fullName;
        } else {
            throw new InvalidFullNameException("Invalid Full Name");
        }
    }
    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) throws InvalidDOBException {
        if (isValidDateFormat(doB)) {
            this.doB = doB;
        } else {
            throw new InvalidDOBException("Invalid Date of Birth");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (isValidPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new InvalidPhoneNumberException("Invalid Phone Number");
        }
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }



    public void showMyInfo(){
            System.out.println("Full Name: " + fullName);
            System.out.println("String of Birth: " + doB);
            System.out.println("Sex: " + sex);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Grade Level: " + gradeLevel);
    }
    private static boolean isValidDateFormat(String date) {
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }


    private static boolean isValidFullName(String fullName) {
        return fullName.length() >= 10 && fullName.length() <= 50;
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^(090|098|091|031|035|038)\\d{7}$";
        return phoneNumber.matches(regex);
    }
}
