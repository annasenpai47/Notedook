package Notebook;

public enum Group {
    KN, AND, PP;

    private int course;

    public void setCourse(int i){
        course = i;
    }
    public int getCourse(){
        return course;
    }
}
