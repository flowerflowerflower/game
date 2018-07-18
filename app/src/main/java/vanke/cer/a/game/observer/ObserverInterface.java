package vanke.cer.a.game.observer;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public interface ObserverInterface<T> {


    public void noticeAll();

    public void notice();

    public void register(T t);



}
