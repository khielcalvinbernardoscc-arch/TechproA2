class Student {
String name;
void displayName() {
System.out.println("Student Name:" + name);
}
}
 class Main {
public static void main(String[] args) {
// Object is properly created
Student s1 = new Student();
s1.name = "Mharco Billy";
s1.displayName();

try {

} catch (Exception e) {
System.out.println ("Absent");
}
}
}