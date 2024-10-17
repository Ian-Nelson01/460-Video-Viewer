package com.example.swipevideo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /**
     *
     * OnCreate indicates all blocks run on app creation.
     *      * sets up main layout and ensures UI elements take up proper space
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     *
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /**
         * establishes a videopager widget allowing elements to be swiped across the screen
         * the elements being swiped are a list of video items.
         */
        final ViewPager2 videoViewPager = findViewById(R.id.videosViewPager);
        List<VideoItem> videoItemsList = new ArrayList<>();



        /**
         * establishes a new video object with a name, url, and description.
         * the url is pulled from firebase
         * this video is added to the list.
         */
        VideoItem videoMilk= new VideoItem();
        videoMilk.videoURL = "https://firebasestorage.googleapis.com/v0/b/quiz-41.appspot.com/o/1000011610.mp4?alt=media&token=40944206-5fd6-4feb-a777-84abdfbf6ecc";
        videoMilk.videoTitle = "Milk";
        videoMilk.videoDescription = "Caliente";
        videoMilk.videoID = "ID: 1000011610.mp4";
        videoItemsList.add(videoMilk);

        /**
         * establishes a new video object with a name, url, and description.
         * the url is pulled from firebase
         * this video is added to the list.

        VideoItem videoCakes= new VideoItem();
        videoCakes.videoURL = "https://firebasestorage.googleapis.com/v0/b/quiz-41.appspot.com/o/1000010926.mp4?alt=media&token=3ed9b8fe-b31c-46fe-95fc-18942e9f4f28";
        videoCakes.videoTitle = "Pancakes";
        videoCakes.videoDescription = "Flippin and Flippin";
        videoCakes.videoID = "ID: 1000010926.mp4";
        videoItemsList.add(videoCakes);
*/
        /**
         * establishes a new video object with a name, url, and description.
         * the url is pulled from firebase
         * this video is added to the list.
         */
        VideoItem videoDemons= new VideoItem();
        videoDemons.videoURL = "https://firebasestorage.googleapis.com/v0/b/quiz-41.appspot.com/o/1000010825.mp4?alt=media&token=ec0f9786-60df-47ef-a04d-fd2b35cbe47c";
        videoDemons.videoTitle = "Demons";
        videoDemons.videoDescription = "Are you sure you wanna party with them?";
        videoDemons.videoID = "ID: 1000008707.mp4";
        videoItemsList.add(videoDemons);


        /**
         * establishes a new video object with a name, url, and description.
         * the url is pulled from firebase
         * this video is added to the list.

        VideoItem videoBoys = new VideoItem();
        videoBoys.videoURL = "https://firebasestorage.googleapis.com/v0/b/quiz-41.appspot.com/o/1000010601.mp4?alt=media&token=e4feba8d-710d-4967-9b57-f890481878ae";
        videoBoys.videoTitle = "The Boys";
        videoBoys.videoDescription = "Only on disney channel";
        videoBoys.videoID = "1000010825.mp4";
        videoItemsList.add(videoBoys);
        */

        /**
         * establishes a new video object with a name, url, and description.
         * the url is pulled from firebase
         * this video is added to the list.
         */
        VideoItem videoCorn = new VideoItem();
        videoCorn.videoURL = "https://firebasestorage.googleapis.com/v0/b/quiz-41.appspot.com/o/corn%20-%20Slimecicle%20(144p%2C%20h264%2C%20youtube).mp4?alt=media&token=dd9bdb50-10ab-416b-b617-5e4e168d7e19";
        videoCorn.videoTitle = "Corn";
        videoCorn.videoDescription = "when the corn";
        videoCorn.videoID = "ID: corn - Slimecicle (144p, h264, youtube).mp4";
        videoItemsList.add(videoCorn);

        /**
         * establishes a new video object with a name, url, and description.
         * the url is pulled from firebase
         * this video is added to the list.
         */
        VideoItem videoChunky= new VideoItem();
        videoChunky.videoURL = "https://firebasestorage.googleapis.com/v0/b/quiz-41.appspot.com/o/And%20then%20there%E2%80%99s%20Chunky%20-%20Yarzy%20Official%20(240p%2C%20h264%2C%20youtube).mp4?alt=media&token=2d3e09c5-7833-49ac-b094-b050b87842f2";
        videoChunky.videoTitle = "And Then There's Chunky";
        videoChunky.videoDescription = "He's Dead";
        videoChunky.videoID = "ID: And then there’s Chunky - Yarzy Official (240p, h264, youtube).mp4";
        videoItemsList.add(videoChunky);

        /**
         * establishes a new video object with a name, url, and description.
         * the url is pulled from firebase
         * this video is added to the list.

         VideoItem videoPVZ= new VideoItem();
         videoPVZ.videoURL = "https://firebasestorage.googleapis.com/v0/b/quiz-41.appspot.com/o/1000011668.mp4?alt=media&token=00182cdc-a03c-4f99-9e4f-1558a19ec067";
         videoPVZ.videoTitle = "PVZ";
         videoPVZ.videoDescription = "punchin flowers lmao";
         videoPVZ.videoID = "ID: 1000011668.mp4";
         videoItemsList.add(videoPVZ);
         */
        /**
         * establishes a new video object with a name, url, and description.
         * the url is pulled from firebase
         * this video is added to the list.
         */
        VideoItem videoFNAF= new VideoItem();
        videoFNAF.videoURL = "https://firebasestorage.googleapis.com/v0/b/quiz-41.appspot.com/o/Was%20that%20the%20bite%20of%2087_%20(Meme%20Template)%20-%20The%20Illest%20Villain%20(144p%2C%20h264%2C%20youtube).mp4?alt=media&token=13ca7429-7350-47d6-bf5c-29e928adf3f7";
        videoFNAF.videoTitle = "Markipiler";
        videoFNAF.videoDescription = "was that the bite of 87??";
        videoFNAF.videoID = "ID: Was that the bite of 87_ (Meme Template) - The Illest Villain (144p, h264, youtube).mp4";
        videoItemsList.add(videoFNAF);

        videoViewPager.setAdapter(new VideoAdapter(videoItemsList));

    }
}