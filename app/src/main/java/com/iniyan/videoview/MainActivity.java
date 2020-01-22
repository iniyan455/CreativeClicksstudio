package com.iniyan.videoview;

/**
 * Implemented Date 22/01/2020
 * Customized Code For Task
 */

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.iniyan.videoview.Adapter.VideoDataAdapter;
import com.iniyan.videoview.MediaPlayer.ExoPlayerActivity;
import com.iniyan.videoview.OnClickListener.RecyclerItemClickListener;
import com.iniyan.videoview.ViewModel.MainViewModel;
import com.iniyan.videoview.databinding.ActivityMainBinding;

import static com.iniyan.videoview.common.VideoPlayerConfig.isNetworkConnected;


/** This Class I implemented List of Thumnails and Video From Api List
 * I Tried to Consume  direct all from api and api provided all 5 different
 * So I Decided to Make all in one together in Single  Pojo
 * I implemented Here with Databinding with MVVM Design Pattern Using LiveData
 * Please Let me  know any Modifications
 * I'm not consumed any api if you want to consume api to load means glad to implement
 */
public class MainActivity extends AppCompatActivity {
    private MainViewModel mainViewModel;
    private VideoDataAdapter videoDataAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        // bind RecyclerView
        RecyclerView recyclerView = activityMainBinding.viewVideorv;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        videoDataAdapter = new VideoDataAdapter();
        recyclerView.setAdapter(videoDataAdapter);

        if (isNetworkConnected(getApplicationContext())) {

            getAllVideos();

        } else
            Toast.makeText(getApplicationContext(), "Internet Not Available", Toast.LENGTH_SHORT).show();
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(MainActivity.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {


                        boolean isURL =
                                Patterns.WEB_URL.matcher(videoDataAdapter.getList().get(position).getUrl().trim()).matches();
                        if (isURL) {
                            Intent mIntent = ExoPlayerActivity.getStartIntent(MainActivity.this, videoDataAdapter.getList().get(position).getUrl().trim());
                            startActivity(mIntent);
                        } else {
                            Toast.makeText(MainActivity.this,
                                    getString(R.string.error_message_url_not_valid), Toast.LENGTH_SHORT).show();

                        }
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                })
        );
    }

    private void getAllVideos() {
        mainViewModel.getAllVideos().observe(this, videolist -> videoDataAdapter.setVideoList(videolist));

    }


}