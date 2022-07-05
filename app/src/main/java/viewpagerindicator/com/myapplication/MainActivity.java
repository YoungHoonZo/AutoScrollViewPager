package viewpagerindicator.com.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoScrollViewPager viewPager = (AutoScrollViewPager) findViewById(R.id.view_pager);
        ImageAdapter imgadapter = new ImageAdapter(this);

//    PagerAdapter adapter = new InfinitePagerAdapter(imgadapter);

        viewPager.setAdapter(imgadapter);
        viewPager.setInterval(10000);
        viewPager.startAutoScroll();

    }
}
