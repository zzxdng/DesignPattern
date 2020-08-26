package decorator;

/**
 * Created by Administrator on 2020/8/27.
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void operation(){
        System.out.print("这个人 →"+this.name+":");
    }
}
