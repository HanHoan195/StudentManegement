package model;


import exception.InvalidScoreException;

public class NormalStudent extends Student{
    private int englishScore;
    private int entryTestScore;

    public NormalStudent() {
    }

    public NormalStudent(int englishScore, int entryTestScore) {
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, int entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) throws Exception {
        if (englishScore >= 0 && englishScore <= 10) {
            this.englishScore = englishScore;
        } else {
            throw new InvalidScoreException("Thang điểm từ 0-10");
        }
    }
    public int getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(int entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public void showMyInfo(){
        System.out.println("Normal Student");
        super.showMyInfo();
        System.out.println("English Score: " + englishScore);
        System.out.println("Entry Test Score: " + entryTestScore);
        System.out.println();
    }
}


