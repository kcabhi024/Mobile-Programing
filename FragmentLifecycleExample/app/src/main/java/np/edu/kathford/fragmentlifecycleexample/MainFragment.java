package np.edu.kathford.fragmentlifecycleexample;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment  extends Fragment {

    private  final  String TAG = MainFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.e(TAG, "OnCreateView() call back method call");
            return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e(TAG, "OnAttach() call back method call");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "OnCreate() call back method call");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "OnActivityCreated() call back method call");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "OnStart() call back method call");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "OnResume() call back method call");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "OnPause() call back method call");
    }

    @Override
    public void onStop() {
        super.onStop();Log.e(TAG, "OnStop() call back method call");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "OnDistroy() call back method call");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "OnDestroy() call back method call");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "OnDetach() call back method call");
    }
}
