package net.ukr.kaminskiy;

public class Student extends Human {

    private String group;
    private String course;

    public Student(String name, String surname, String sex, int age, int height, String hairColor, String eyeColor, String group, String course) {
        super(name, surname, sex, age, height, hairColor, eyeColor);
        this.group = group;
        this.course = course;
    }

    public Student() {
        super();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", course='" + course + '\'' + ", " +
                super.toString();
    }
}
