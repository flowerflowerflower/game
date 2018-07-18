package vanke.cer.a.game.factory;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public class EggFactory implements ZCFactory {
    @Override
    public LikeYou create() {
        return new LikeYouB();
    }
}
