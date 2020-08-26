package decorator;

/**
 * Created by Administrator on 2020/8/27.
 */
public class Decorator extends Person {

    private Person person;

    public void decorate(Person person){
        this.person = person;
    }

    public void operation(){
        person.operation();
    }

}
