// 94. Create a priyorityQueue of a coustom class Students with attributes name and grade .Use comparator to order by grade. 
 
public class Qs_94 {
    private static class Student {
        private final String name;
        private final char grade;
        public Student(String name, char grade) {
            this.name=name;
            this.grade=grade;
        }
        public String getName() {
            return name;
        }
        public char getGrade() {
            return grade;
        }
    }
    public static void main(String[] args) {
        
    }
}
