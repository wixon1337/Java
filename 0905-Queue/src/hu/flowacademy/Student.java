package hu.flowacademy;

public class Student {
    private String firstname;
    private String lastname;
    private String nickname;
    private int marks;

    public Student(String firstname, String lastname, String nickname, int marks) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.marks = marks;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", marks=" + marks +
                '}';
    }
}
