package vanke.cer.a.game.observer;

/**
 * Created by zhangcheng on 2018/7/15.
 */
//采用单列处理一些事情
public class ObserverClient {
    private static ObserverClient observerClient;

    private AbstractObserverImp abstractObserverImp;

    private ObserverClient(){


        abstractObserverImp=new AbstractObserverImp<RegisterInterface<String>,String>() {
            @Override
            public void noticeAll() {
                super.noticeAll();
            }

            @Override
            public void notice() {
                super.notice();
            }

            @Override
            public void register(RegisterInterface<String> o) {
                super.register(o);
            }
        };

        abstractObserverImp.addWork("like");





    }

    public static synchronized ObserverClient getObserverClient(){

        if(observerClient==null){
            synchronized (ObserverClient.class){
                observerClient=new ObserverClient();
            }
        }


        return  observerClient;
    }



    public void add(RegisterInterface<String> registerInterface){
            if(abstractObserverImp!=null) {
                abstractObserverImp.register(registerInterface);
            }

    }



    public void notice(){
        if(abstractObserverImp!=null){
            abstractObserverImp.noticeAll();
        }
    }









}
