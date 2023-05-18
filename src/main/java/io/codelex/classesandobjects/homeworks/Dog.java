package io.codelex.classesandobjects.homeworks;

public class Dog {

    private String name;
    private String sex;

    private Dog motherName;
    private Dog fatherName;

    public Dog getFatherName() {
        if (fatherName != null) {
            return fatherName;
        } else System.out.println("Unknown");
        return null;
    }

    public void setMotherName(Dog motherName) {
        this.motherName = motherName;
    }

    public void setFatherName(Dog fatherName) {
        this.fatherName = fatherName;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}
