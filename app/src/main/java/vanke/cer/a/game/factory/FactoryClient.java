package vanke.cer.a.game.factory;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public class FactoryClient {

    private static FactoryClient factoryClient;


    public FactoryA getFactoryA() {
        return factoryA;
    }

    public FactoryB getFactoryB() {
        return factoryB;
    }

    FactoryA factoryA;

    FactoryB factoryB;


    public EggFactory getEggFactory() {
        return eggFactory;
    }

    EggFactory eggFactory;

    private FactoryClient(){

        factoryA=new FactoryA();
        factoryB=new FactoryB();
        eggFactory=new EggFactory();
    };


    public  static FactoryClient getFactoryClient(){

        if(factoryClient==null){
            synchronized (FactoryClient.class){
                factoryClient=new FactoryClient();
            }
        }
        return factoryClient;
    }













}
