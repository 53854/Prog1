package lec_08;

public class Student {
    
    private String name;
    private int  studentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void takeLecture(Lecture l){

    }

    public Boolean validateId(int id){
        
        String sId = Integer.toString(id);
        
        if( id % 2 != 0 ){
            if(sId.length() == 5){
                if(sId.charAt(0) != '0'){
                    return true;
                }
            }
        }
        
        return false;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", studentId=" + studentId + "]";
    }
}
