package vanke.cer.a.game.builder;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by zhangcheng on 2018/7/17.
 */

public class BuilderImp implements BuilderInterface<String,String> {

    private String head;

    private String end;

    private String face;



    public BuilderImp(){
        this.head="";
        this.end="";
        this.face="";
    }


    @Override
    public BuilderInterface addHead(String s) {


        this.head=s;

        return  this;



    }

    @Override
    public BuilderInterface addEnd(String s) {

        this.end=s;
        return this;

    }

    @Override
    public BuilderInterface addface(String face) {
        this.face=face;
        return  this;

    }

    @Override
    public void build() {


        Log.v("builder",this.toString());
    }


    @Override
    public String toString() {
        return "BuilderImp{" +
                "head='" + head + '\'' +
                ", end='" + end + '\'' +
                ", face='" + face + '\'' +
                '}';
    }
}
