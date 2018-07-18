package vanke.cer.a.game.adapter;

/**
 * Created by zhangcheng on 2018/7/18.
 */

public class Man  implements  Human{

    private Animal animal;


    public  Man(Animal animal){
        this.animal=animal;
    }


    @Override
    public void eat() {

        animal.eat();

    }

    @Override
    public void sex() {
        animal.drink();

    }


}
