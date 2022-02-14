// Create class EnKKUStudent which is a subclass of KKUStudent
// class EnKKUStudent has a new variable as gearNumber
// and method to get and set gearNumber

class KKUStudent {
   // instance variable 
   protected String name;
   protected double gpa;
   // class variable
   static int numStudents = 0;
   // class variable or static variable
   final static String UNI_NAME = "Khon Kaen University";
   
   KKUStudent() {
      numStudents++;
   }

   KKUStudent(String name) {
      this();
      this.name = name;
   }
   public static int getNumStudents() {
      return numStudents;
   }

   // instance method
   public void setGPA(double newGPA) {
      gpa = newGPA;
   }
   public double getGPA() {
      return gpa;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }

   public String toString() {
      return "Student's name is " + name + " and has GPA as " + gpa;
   }
   // static method
   public static String getUniName() {
      return UNI_NAME;
   }
}
 
