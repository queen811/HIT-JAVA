package BTVN_Buoi6;
import java.util.*;
class Date{
    private int year;
    private byte month;
    private byte day;

    public Date() {
    }

    public Date(int year, byte month, byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
        System.out.print("Nhap thang: ");
        month = sc.nextByte();
        System.out.print("Nhap ngay: ");
        day = sc.nextByte();
    }

    public void output() {
        System.out.println("Ngay " + this.day + " thang " + this.month + " nam " + this.year);
    }
}
class Person{
    protected String name;
    protected byte age;
    protected String address;
    protected Date birthDay = new Date();

    public Person() {
    }

    public Person(String name, byte age, String address, Date birthDay) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }

    public void input(Scanner sc){
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextByte();
        sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        birthDay.input(sc);
    }

    public void output(){
        System.out.println("tên: "+this.name);
        System.out.println("Tuổi: "+ this.age);
        System.out.println("Địa chỉ: "+this.address);
        System.out.print("Sinh nhật: ");
        birthDay.output();
    }
}
 class Student extends Person{
    private String id;
    private String Class;
    private String school;

    public Student() {
    }

    public Student(String id, String Class, String school) {
        this.id = id;
        this.Class = Class;
        this.school = school;
    }

    public Student(String id, String Class, String school, String name, byte age, String address, Date birthDay) {
        super(name, age, address, birthDay);
        this.id = id;
        this.Class = Class;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return this.Class;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
   @Override
    public void input(Scanner sc) {
        System.out.print("Nhap ten hoc sinh: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi hoc sinh: ");
        age = sc.nextByte();
        sc.nextLine();
        System.out.print("Nhập địa chỉ học sinh: ");
        address = sc.nextLine();
        System.out.println("Nhap ngay sinh hoc sinh: ");
        birthDay.input(sc);
        sc.nextLine();
        System.out.print("Nhap id hoc sinh: ");
        id = sc.nextLine();
        System.out.print("Nhap lop hoc hoc sinh: ");
        Class = sc.nextLine();
        System.out.print("Nhap truong cua hoc sinh: ");
        school = sc.nextLine();
    }

    public void output() {
        System.out.println("Ten hoc sinh: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Dia chi: " + this.address);
        System.out.print("Sinh nhat: ");
        birthDay.output();
        System.out.println("id: " + this.id);
        System.out.println("Truong: " + this.school);
        System.out.println("Lop: " + this.Class);
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Student> st = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ": ");
            Student std = new Student();
            std.input(sc);
            st.add(std);
        }
        System.out.println("\n");
        System.out.println("Danh sach thong tin hoc sinh: ");
        int i = 1;
        for (Student a : st) {
            System.out.println(i + ".");
            a.output();
            i++;
        }

    }
}
