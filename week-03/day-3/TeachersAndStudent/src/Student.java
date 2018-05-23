public class Student {

  public void learn() {}

  public void question(Teacher teacher){
    teacher.answer();
  }

  public static void main(String[] args) {
    Student student = new Student();
    Teacher teacher = new Teacher();
  }
}
