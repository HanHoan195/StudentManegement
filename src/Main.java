import model.GoodStudent;
import model.NormalStudent;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

//        //int id, String fullName, Date doB, String sex, String phoneNumber, String gradeLevel, int gpa, String bestRewardName
//        GoodStudent goodStudent = new GoodStudent(1, "Nguyễn Văn A", "01/01/1990", "Nam", "123456789", "Đại học ABC", 8, "Học bổng xuất sắc");
//        goodStudent.showMyInfo();
//
//        //int id, String fullName, String doB, String sex, String phoneNumber, String gradeLevel, int englishScore, int entryTestScore
//        NormalStudent normalStudent = new NormalStudent(2, "Nguyễn Thị B", "02/02/1995", "Nữ", "987654321", "Đại học XYZ", 6, 7);
//        normalStudent.showMyInfo();

        try {
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numStudents; i++) {
                while (true) {
                    System.out.println("Enter student #" + (i + 1) + " information:");

                    System.out.print("Full Name: ");
                    String fullName = scanner.nextLine();

                    if (!(fullName.length() >= 10 && fullName.length() <= 50)) {
                        System.out.println("Họ và tên lớn hơn 10 và nhỏ hơn 50 k tự");
                        continue;
                    }

                    System.out.print("Date of Birth (dd/MM/YYYY): ");
                    String doB = scanner.nextLine();

                    if (!doB.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                        System.out.println("Ngày tháng năm không đúng định dạng");
                        continue;
                    }

                    System.out.print("Sex: ");
                    String sex = scanner.nextLine();

                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.nextLine();

                    if (!phoneNumber.matches("(090|098|091|031|035|038)\\d{7}")) {
                        System.out.println("Số điện thoại không đúng định dạng.");
                        continue;
                    }

                    System.out.print("University Name: ");
                    String universityName = scanner.nextLine();

                    System.out.print("Grade Level: ");
                    String gradeLevel = scanner.nextLine();

                    System.out.println("Is this a Good Student? (yes/no): ");
                    String isGoodStudent = scanner.nextLine();

                    if (isGoodStudent.equalsIgnoreCase("yes")) {
                        System.out.print("GPA: ");
                        int gpa = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Best Reward Name: ");
                        String bestRewardName = scanner.nextLine();

                        GoodStudent goodStudent = new GoodStudent(fullName, doB, sex, phoneNumber, universityName, gradeLevel, gpa, bestRewardName);
                        students.add(goodStudent);
                        break;
                    } else if (isGoodStudent.equalsIgnoreCase("no")) {
                        System.out.print("English Score: ");
                        int englishScore = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Entry Test Score: ");
                        int entryTestScore = scanner.nextInt();
                        scanner.nextLine();

                        NormalStudent normalStudent = new NormalStudent(fullName, doB, sex, phoneNumber, universityName, gradeLevel, englishScore, entryTestScore);
                        students.add(normalStudent);
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Thông tin không hợp lệ");
            return;
        }
        for (Student student : students) {
            if (student instanceof GoodStudent) {
                student.showMyInfo();
                System.out.println();
            } else if (student instanceof NormalStudent) {
                student.showMyInfo();
                System.out.println();
            }
        }


    }
}
