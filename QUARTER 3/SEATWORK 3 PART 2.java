class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0; 
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private String course;

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void displayInfo() {
        System.out.println("---- Student Information ----");
        System.out.println("Name  :  " + getName());
        System.out.println("Age :  " + getAge());
        System.out.println("Course :  " + getCourse());
        System.out.println("-----------------------------");
    }
}

class Main {
    public static void main(String[] args) {
        // Create object of child class (Student)
        Student s = new Student();
        
        // Using setters from Person (inherited)
        s.setName("Lawrence"); 
        s.setAge(20);
        
        // Using setter from Student
        s.setCourse("BSIT");

        // Display all data
        s.displayInfo();
    }
}