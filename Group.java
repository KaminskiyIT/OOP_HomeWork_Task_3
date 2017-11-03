package net.ukr.kaminskiy;

import java.util.Arrays;

public class Group {

    Student [] groupOfStudents = new Student[10];
    static int count = 0;

    public Group() {
        super();
    }

    public void addStudent(Student student) throws ExceedingTheSizeOfTheArrayException {
        if (student == null) {
            throw new IllegalArgumentException("Value - Null");
        }

        for (int i = 0; i < groupOfStudents.length; i++) {
            if (groupOfStudents[i] == null) {
                groupOfStudents[i] = student;
                return;
            }
            count++;
        }
        if(count >= 10) {
            System.out.println("No free places!");
            count = 0;
        }
        throw new ExceedingTheSizeOfTheArrayException();
    }

    public void deleteStudent(int index){

        if (!(index >= 0 && index < groupOfStudents.length)) {
            System.out.println("Error index");
            return;
        }
        groupOfStudents[index] = null;

    }

    public Student searchForStudentByName(String name){
        for (Student student : groupOfStudents) {
            if (student != null && student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }



    private int compareStudent(Student one, Student two) {
        if (one != null && two == null) {
            return 1;
        }
        if (one == null && two != null) {
            return -1;
        }
        if (one == null && two == null) {
            return 0;
        }
        return one.getName().compareTo(two.getName());

    }


    private void sort() {
        for (int i = 0; i < groupOfStudents.length - 1; i++) {
            for (int j = i + 1; j < groupOfStudents.length; j++) {
                if (compareStudent(groupOfStudents[i], groupOfStudents[j]) > 0) {
                    Student temp = groupOfStudents[i];
                    groupOfStudents[i] = groupOfStudents[j];
                    groupOfStudents[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        sort();
        for (Student student : groupOfStudents) {
            if (student != null) {
                sb.append((++i)+") ").append(student);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
