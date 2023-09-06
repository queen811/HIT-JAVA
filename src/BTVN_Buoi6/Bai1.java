package BTVN_Buoi6;
import java.util.*;
class Animal{
    protected String name;
    protected Byte age;
    protected float weight;

    public Animal() {

    }

    public Animal(String name, Byte age, float weight) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        Byte age = scanner.nextByte();
        System.out.print("Nhap can nang: ");
        Float weight = scanner.nextFloat();
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void output() {
        System.out.println("Ten loai: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Can nang: " + this.weight);
    }

    public void tiengKeu() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal{
    private String color;
    private String preferances;
    private String ownerName;

    public Cat() {

    }

    public Cat(String color, String preferances, String ownerName, String name, Byte age, Float weight) {
        super(name, age, weight);
        this.color = color;
        this.preferances = preferances;
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferances() {
        return preferances;
    }

    public void setPreferances(String preferances) {
        this.preferances = preferances;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Nhap mau sac cua meo: ");
        String color = scanner.nextLine();
        System.out.print("Nhap so thich cua meo: ");
        String preferences = scanner.nextLine();
        System.out.print("Nhap ten chu so huu: ");
        String ownerName = scanner.nextLine();
        this.color = color;
        this.preferances = preferences;
        this.ownerName = ownerName;
    }

    public void output() {
        super.output();
        System.out.println("Mau sac cua meo: " + this.color);
        System.out.println("So thich cua meo: " + this.preferances);
        System.out.println("Ten chu so huu: " + this.ownerName);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Tieng keu: Meo meo");
    }

}

class Dog extends Animal{
    private String character;

    public Dog() {

    }

    public Dog(String character, String name, Byte age, Float weight) {
        super(name, age, weight);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tinh cach cua cho: ");
        String chatacter = scanner.nextLine();
        this.character = chatacter;
    }

    public void output() {
        super.output();
        System.out.println("Tính cách của chó: " + this.character);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Tieng keu: Gau gau");
    }

}

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println("Nhập thông tin cua mèo: ");
        cat.input();
        System.out.println("Thông tin của mèo: ");
        cat.output();
        cat.tiengKeu();
        System.out.println("Nhập thông tin của chó: ");
        dog.input();
        System.out.println("Thông tin của chó: ");
        dog.output();
        dog.tiengKeu();
    }
}

