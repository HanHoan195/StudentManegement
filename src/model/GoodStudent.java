package model;


import java.util.List;

public class GoodStudent extends Student{
    private int gpa;
    private String bestRewardName;

    public GoodStudent() {
    }

    public GoodStudent(int gpa, String bestRewardName) {
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, int gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    @Override
    public void showMyInfo(){
        System.out.println("Good Student");
        super.showMyInfo();
        System.out.println("GPA: " + gpa);
        System.out.println("Best Reward Name: " + bestRewardName);
        System.out.println();
    }
}
