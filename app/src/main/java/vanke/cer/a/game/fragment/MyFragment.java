package vanke.cer.a.game.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vanke.cer.a.game.R;

/**
 * Created by zhangcheng on 2018/7/14.
 */

public class MyFragment extends Fragment {

    public static final String TAG="myFragment";


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG,"oncreate");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.v(TAG,"onCreateView");
        View view =inflater.inflate(R.layout.frg_my,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        Log.v(TAG,"onViewCreated");
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onStart() {

        Log.v(TAG,"onStart");
        super.onStart();
    }

    @Override
    public void onStop() {
        Log.v(TAG,"onStop");
        super.onStop();
    }

    @Override
    public void onResume() {
        Log.v(TAG,"onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.v(TAG,"onPause");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
