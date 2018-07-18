package vanke.cer.a.game.decorator;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public class DecoratorClient {


    private static  DecoratorClient decoratorClient;


    private CompmentADecorator compmentADecorator;



    private DecoratorClient(){

        compmentADecorator =new CompmentADecorator(new CompmentA());

    };

    public  static DecoratorClient getDecoratorClient(){

        if(decoratorClient==null){
            synchronized (DecoratorClient.class){
                decoratorClient=new DecoratorClient();
            }
        }
        return  decoratorClient;

    };


    public  Integer doSomething(){
        if(compmentADecorator!=null){
          return compmentADecorator.showLike();
        }
        return 0;
    }

}
