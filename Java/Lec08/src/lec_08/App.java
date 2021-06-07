package lec_08;

public class App {
    public static void main(String[] aStrings){
        
    }

    void testStuden(String name, int id){
        Student s = new Student();
        s.setName(name);
        s.setStudentId(id);

        System.err.println(s.validateId(s.getStudentId()));
    }
}
