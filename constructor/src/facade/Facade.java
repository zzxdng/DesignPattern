package facade;

/**
 * Created by Administrator on 2020/10/21.
 */
public class Facade {

    public void operationSetA(){
        System.out.print("\noperationSetA: ");
        SubSystemOne subSystemOne = new SubSystemOne();
        subSystemOne.methodA();
        System.out.print("\n然后\n");
        SubSystemThree subSystemThree = new SubSystemThree();
        subSystemThree.methodC();
    }

    public void operationSetB(){
        System.out.print("\noperationSetB: ");
        SubSystemTwo subSystemTwo = new SubSystemTwo();
        subSystemTwo.methodB();
        System.out.print("\n然后\n");
        SubSystemFour subSystemFour = new SubSystemFour();
        subSystemFour.methodD();
    }
}
