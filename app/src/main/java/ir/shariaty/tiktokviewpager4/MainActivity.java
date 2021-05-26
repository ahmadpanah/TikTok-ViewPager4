package ir.shariaty.tiktokviewpager4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videosViewPager = findViewById(R.id.viewPagerVideos);
        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem item = new VideoItem();
        item.videoUrl = "https://upload.shariaty.ac.ir/s/pH6pZCw55a3Nsxp/download";
        item.VideoTitle = "Video 1";
        item.VideoDesc = "FIFA!";
        videoItems.add(item);

        VideoItem item1 = new VideoItem();
        item.videoUrl = "https://upload.shariaty.ac.ir/s/HKMMs5Wbs8NZP93/download";
        item.VideoTitle = "Video 2";
        item.VideoDesc = "Water Bottle";
        videoItems.add(item1);

        VideoItem item2 = new VideoItem();
        item.videoUrl = "https://upload.shariaty.ac.ir/s/jzYQDeHSqR5AHDd/download";
        item.VideoTitle = "Video 3";
        item.VideoDesc = "Draw a Circle!";
        videoItems.add(item2);

        videosViewPager.setAdapter(new VideosAdapter(videoItems));

    }
}