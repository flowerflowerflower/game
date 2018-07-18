package vanke.cer.a.game.builder;

/**
 * Created by zhangcheng on 2018/7/17.
 */

public class BuilderClient {


    BuilderInterface builderInterface;


    private static BuilderClient builderClient;

    private BuilderClient(){
        builderInterface=new BuilderImp();
    }

    public static BuilderClient getBuilderClient(){
        if(builderClient==null){
            synchronized (BuilderClient.class){
                builderClient=new BuilderClient();
            }
        }
        return  builderClient;
    }



    public void goBuilder(){
        builderInterface.addEnd("zzz").addHead("aaaa").addface("hihihi").build();
    }
}
