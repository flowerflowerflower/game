package vanke.cer.a.game.interfece;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import vanke.cer.a.game.R;
import vanke.cer.a.game.builder.BuilderClient;
import vanke.cer.a.game.decorator.DecoratorClient;
import vanke.cer.a.game.factory.FactoryA;
import vanke.cer.a.game.factory.FactoryB;
import vanke.cer.a.game.factory.FactoryClient;
import vanke.cer.a.game.factory.LikeYouB;
import vanke.cer.a.game.observer.ObserverClient;
import vanke.cer.a.game.observer.RegisterInterface;

public class DesignActivity extends AppCompatActivity {


    Button button1;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        button1=findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObserverClient.getObserverClient().add(new RegisterInterface<String>() {
                    @Override
                    public void toGoHome(String s) {
                        Toast.makeText(DesignActivity.this,s,Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void toFly() {

                    }
                });

                ObserverClient.getObserverClient().notice();

            }


        });


        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Integer i= DecoratorClient.getDecoratorClient().doSomething();

                Toast.makeText(DesignActivity.this,i.toString(),Toast.LENGTH_LONG).show();


            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FactoryA.create(1);
                FactoryB.createLiKeYou(LikeYouB.class);

                FactoryClient.getFactoryClient().getEggFactory().create().iLike();
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuilderClient.getBuilderClient().goBuilder();
            }
        });


    }
}
