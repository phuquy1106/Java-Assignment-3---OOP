import Model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentlist = new ArrayList<>();
        String nameCourse;
        //Main main = new Main();
        float sum = 0;
        int n;
        do {
            System.out.println("1 Input student");
            System.out.println("2 show all list student");
            System.out.println("3 Displays the average score of the gradual list of students");
            System.out.println("4 Search course of all student");
            System.out.println("5 Search and show id of a student");
            System.out.println("6 Exit");

            System.out.println("Nhập sự lựa chọn");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    String next;
                    do {
                        //Nhap mot Student
                        Student student = new Student();
                        student.inputStudent();

                        //Dua Student moi nhap vao danh sach
                        studentlist.add(student);

                        //Bat nguoi dung nhap Y hoac N
                        do {
                            System.out.print("Enter a next Student(Y/N)?: ");
                            next = sc.next().trim();
                            next = next.toLowerCase();
                        } while ((!next.equals("y")) && (!next.equals("n")));


                    } while (next.equals("y"));
                    break;
                case 2:
                    for (Student student : studentlist) {
                        student.printStudent();
                    }

                    break;
                case 3:
                    for (Student student : studentlist) {
                        System.out.printf(student.getMediumScore() + "/n");
                        student.printStudent();
                    }

                    break;
                case 4:
                    System.out.println("Input namecourse");
                    nameCourse = sc.next().trim();
                    for (Student student : studentlist) {
                        if (nameCourse.equals(student.getCourse())) {
                            System.out.println("list student");
                            student.printStudent();
                        } else {
                            System.out.println("Can not search list course???");
                        }
                    }
                    break;
                case 5:
                    String nameStu;
                    System.out.println("Input namestu");
                    nameStu = sc.next().trim();
                    for (Student student : studentlist) {
                        if (nameStu.equals(student.getName())) {
                            System.out.println("list student");
                            student.getId();
                        } else {
                            System.out.println("Can not name student???");
                        }
                    }
            }
        }

        while (n != 6);

    }

}