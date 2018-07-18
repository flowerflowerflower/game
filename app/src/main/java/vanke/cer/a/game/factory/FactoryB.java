package vanke.cer.a.game.factory;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public class FactoryB {



    public static <T extends  LikeYou> T createLiKeYou(Class<T> tClass){

        T result = null;
        try {
            result =(T)Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  result;
    }
}
