package vanke.cer.a.game.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangcheng on 2018/7/15.
 */

public abstract class AbstractObserverImp<M extends RegisterInterface<N>,N> implements ObserverInterface<M> {


    private List<M> registers;

    private N  work;


    public AbstractObserverImp(){
        registers=new ArrayList<>();
    }
    @Override
    public void noticeAll() {

        if(registers!=null){
            for(M m:registers){
                m.toFly();
                if(work!=null) {
                    m.toGoHome(work);
                }
            }
        }
    }

    @Override
    public void notice() {

    }

    @Override
    public void register(M o) {
        if(registers!=null) {
            registers.add(o);
        }


    }

    public void addWork(N work){
        this.work=work;



    }



}
