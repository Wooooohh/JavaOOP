public class Student
{
    private String names;
    private String age;
    private String gender;
    private String IDNO;

    public Student(String names, String age, String gender, String IDNO) {
        this.names = names;
        this.age = age;
        this.gender = gender;
        this.IDNO = IDNO;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIDNO() {
        return IDNO;
    }

    public void setIDNO(String IDNO) {
        this.IDNO = IDNO;
    }

    @Override
    public String toString() {
        return "Student{" +
                "names='" + names + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", IDNO='" + IDNO + '\'' +
                '}';
    }
}