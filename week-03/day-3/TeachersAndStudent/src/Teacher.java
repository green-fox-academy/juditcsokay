public class Teacher {

  public void answer() {}

  public void teach(Student student) {
    student.learn();
  }

  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    Student student = new Student();
  }
}
