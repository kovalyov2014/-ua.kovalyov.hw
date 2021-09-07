//package ua.kovalyov.hw7;
//
//public class Aspirant extends Student{
//    String work;
//    public Aspirant(String firstName, String lastName, String group, double avgMark, String work1) {
//        super(firstName, lastName, group, avgMark);
//        this.work = work;
//    }
//    void print(){
//        System.out.println(firstName);
//    }
//
//    @Override
//    public double getScholarship(){
//        return avgMark == 5 ? 200 : 180;
//    }
//
//}
//
//    public static void main(String[] args) {
//        Student student = new Student("Vitaliy","Kovalyov","Group3",4.5);
//        Aspirant aspirant1 = new Aspirant("Dmitriy","Kovalyov","Group1",
//                5, "Work1");
//
//        Student aspirant2 = new Aspirant("Dmitriy","Sviridov","Group1",
//                4.8 , "Work1");
//        Student[] students ={student,aspirant1,aspirant2};
//        for (Student s : students){
//            System.out.println(s.getScholarship());
//        }
//        }
//    }
