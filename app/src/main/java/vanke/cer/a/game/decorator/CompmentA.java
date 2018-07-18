package vanke.cer.a.game.decorator;

import android.util.Log;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public class CompmentA implements compnent<String> {
    @Override
    public void likeYou() {
        Log.v("CompmentA","你是最好的一个");

    }

    @Override
    public String showLike() {
        return "11100";
    }
}
