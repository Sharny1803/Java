public class Student {
    int roll;
    String name;
    String course;
    int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)(total() / 3);
    }
    public char grade(){
        if (average() >= 60){
            return 'A';
        } return 'B';
    }
    public String details(){
        return "Roll No: " + roll + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n";
    }
}
