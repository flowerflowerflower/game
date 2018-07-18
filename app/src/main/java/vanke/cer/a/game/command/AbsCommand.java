package vanke.cer.a.game.command;

/**
 * Created by zhangcheng on 2018/7/18.
 */

public abstract class AbsCommand<N,M> implements Command {




    private N n;

    private M m;

    private Lite lite;

    @Override
    public void execute() {

        if(lite!=null){
            lite.lileIt();
        }

    }


    public abstract void doEx(N n,M m);

    @Override
    public void setSource(Lite lite) {
        this.lite=lite;
    }
}
