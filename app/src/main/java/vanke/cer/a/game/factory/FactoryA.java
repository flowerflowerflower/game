package vanke.cer.a.game.factory;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public class FactoryA {

    private static final int ONE = 1;
    private static final int TWO = 2;

    public static LikeYou create(int type) {
        switch (type) {
            case ONE:
                return new LikeYouA();
            case TWO:
                return new LikeYouB();
            default:
                return new LikeYouB();
        }

    }
}
