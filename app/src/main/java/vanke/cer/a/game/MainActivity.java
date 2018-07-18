package vanke.cer.a.game;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import vanke.cer.a.game.fragment.BlankFragment;
import vanke.cer.a.game.interfece.OnActivityInteractionListener;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{

    FrameLayout frameLayout;

    FragmentManager fragmentManager;

    TextView textView;


    private OnActivityInteractionListener onActivityInteractionListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zc);
        frameLayout=findViewById(R.id.fl_content);
        textView=findViewById(R.id.begin);
        onMethods();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onActivityInteractionListener!=null){
                    Uri uri=Uri.parse("zc://hai.com:8080/home?likeyou");
                    onActivityInteractionListener.onActivityInteraction(uri);
                }
            }
        });

        // Example of a call to a native method


    }

    private void onMethods(){
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        Fragment fragment1= BlankFragment.newInstance("你好","我是");


        if (fragment1 instanceof OnActivityInteractionListener) {
            onActivityInteractionListener = (OnActivityInteractionListener) fragment1;
        } else {
            throw new RuntimeException(fragment1.toString()
                    + " must implement OnActivityInteractionListener");
        }
        fragmentTransaction.add(R.id.fl_content,fragment1,"zc");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commitAllowingStateLoss();



    }
    @Override
    public void onFragmentInteraction(Uri uri) {

        Log.v("MainActivity",uri.toString()); //对于URL的使用


    }







}
