package vanke.cer.a.game.observer;

import android.util.Log;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public class RegitsterImp implements RegisterInterface<String> {
    @Override
    public void toGoHome(String o) {

      Log.v("RegitsterImp",o);

    }

    @Override
    public void toFly() {

        Log.v("RegitsterImp","toFly");

    }


}
