package vanke.cer.a.game.command;

/**
 * Created by zhangcheng on 2018/7/18.
 */

public interface Command<T extends Lite> {
    public  void execute();

    public   void setSource(T t);
}
