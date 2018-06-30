package prototype;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 10:36 2018/6/6.
 */
public class PrototypeClass implements Cloneable {

    private String name;
    private int age;

    @Override
    protected PrototypeClass clone() {
        PrototypeClass clone = null;
        try {
            clone = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:"+name+",age："+age;
    }
}
