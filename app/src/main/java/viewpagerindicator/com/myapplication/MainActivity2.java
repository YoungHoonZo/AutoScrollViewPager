package viewpagerindicator.com.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

public class MainActivity2 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoScrollViewPager viewPager = (AutoScrollViewPager) findViewById(R.id.view_pager);
        ImageAdapter imgadapter = new ImageAdapter(this);

        PagerAdapter wrappedAdapter = new InfinitePagerAdapter(imgadapter);

        viewPager.setInterval(1000); //-- 이미지 넘어가는 시간 
        viewPager.setAdapter(wrappedAdapter);
        viewPager.startAutoScroll();

    }
}
