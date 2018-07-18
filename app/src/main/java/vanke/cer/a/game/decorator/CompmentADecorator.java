package vanke.cer.a.game.decorator;

import android.content.Intent;
import android.util.Log;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public class CompmentADecorator implements compnent<Integer> {

    public compnent compmentA;
    @Override
    public void likeYou() {




    }


    public CompmentADecorator(compnent compnent){
        this.compmentA=compnent;
    }

    @Override
    public Integer showLike() {

        if(compmentA.showLike()  instanceof  String ){
            Log.v("CompmentADecorator","String");

        }else if(compmentA.showLike() instanceof  Integer){
            Log.v("CompmentADecorator","Integer");
        }




        Integer result;

        try {
             result = Integer.parseInt((String) compmentA.showLike());
         }catch (NumberFormatException e){
             e.printStackTrace();
             result =new Integer(0);
         }
        return result;
    }
}
