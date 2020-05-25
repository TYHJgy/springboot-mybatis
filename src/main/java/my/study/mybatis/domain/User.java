package my.study.mybatis.domain;

public class User {
    private String id;
    private String name;
    private String age;
    private String birthday;

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
