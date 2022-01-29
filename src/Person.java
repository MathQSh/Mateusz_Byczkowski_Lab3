//pozwolilem sobie zmienic polskie wyrazy na angielskie aby kodowanie bylo jak najbardziej poprawne :)
public class Person {
    private String name;
    private String surname;
    private Integer index;

    public Person (String name, String surname, Integer index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setIndex(Integer index){

        this.index = index;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Integer getIndex() {
        return index;
    }

    public String all() {
        return name +" "+ surname+" "+ index;
    }
}