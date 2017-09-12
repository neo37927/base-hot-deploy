package application;

/**
 * Created by xiaolin  on 2017/9/12.
 */
public class CustomApplication implements IApplication{
    public void init() {
        System.out.println("TestApplication1-->init");
    }

    public void execute() {
        System.out.println("TestApplication1-->do something");
    }

    public void destory() {
        System.out.println("TestApplication1-->destoryed");
    }
}
