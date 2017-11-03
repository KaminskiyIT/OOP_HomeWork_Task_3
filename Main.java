package net.ukr.kaminskiy;

public class Main {

    public static void main(String[] args) {

        Group group = new Group();

        try {
            group.addStudent( new Student("Petr", "Kam", "male", 21, 175, "Brown", "Blue", "IT", "Java"));
            group.addStudent( new Student("Alex", "Iarosh", "male", 21, 170, "Brown", "Blue", "IT", "Java"));
            group.addStudent( new Student("Dima", "Drem", "male", 21, 185, "Brown", "Blue", "IT", "Java"));
            group.addStudent( new Student("Olia", "Vhgchg", "female", 21, 170, "Brown", "Blue", "IT", "Java"));
            group.addStudent( new Student("Lena", "Gyuguyg", "female", 21, 172, "Brown", "Blue", "IT", "Java"));

        } catch (ExceedingTheSizeOfTheArrayException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(group);



//        Human human = new Human();
//
//        System.out.println(human);
//
//        Student student = new Student();
//
//        System.out.println(student);
//
//        Group group = new Group();
//
//        System.out.println(group);

//        for(int i = 0; i<10;i++){
//            try {
//                group.addStudent(student);
//            } catch (ExceedingTheSizeOfTheArrayException e) {
//                System.out.println(e.getMessage());
//            }
//        }




    }
}
