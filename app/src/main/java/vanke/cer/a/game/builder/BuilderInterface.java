package vanke.cer.a.game.builder;

/**
 * Created by zhangcheng on 2018/7/17.
 */

public interface BuilderInterface<T,M> {

    public BuilderInterface addHead(T t);

    public BuilderInterface addEnd(M m);

    public BuilderInterface addface(String face);



    public void build();
}
