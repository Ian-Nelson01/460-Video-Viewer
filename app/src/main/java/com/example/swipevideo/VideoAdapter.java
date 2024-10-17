package com.example.swipevideo;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/**
 * VideoAdapter class is a child of the recyclerview class for swiping through objects
 * VideoAdapter adapts this for videos
 */
public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder>{

    /**
     * basic constructor
     * @param videoItems is list of individual videos as mp4 files
     */
    public VideoAdapter(List<VideoItem> videoItems) {
        this.videoItems = videoItems;
    }

    /**
     * list of video items
     */
    private List<VideoItem> videoItems;

    /**
     * creates a holder layout container for video view
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     *               an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return
     */
    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideoViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_video, parent, false)
        );
    }

    /**
     * detwemines the position of the swipe-able holder and which video to display
     * @param holder The ViewHolder which should be updated to represent the contents of the
     *        item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        holder.setVideoData(videoItems.get(position));
    }

    /**
     * returns number of videos
     * @return
     */
    @Override
    public int getItemCount() {
        return videoItems.size();
    }

    /**
     * creates a holder layout container for video view
     * includes title, description, progressbar and the video itself
     */
    static class VideoViewHolder extends RecyclerView.ViewHolder {
        TextView textVideoTitle1, textVideoDescription1, textVideoID1;
        VideoView videoView;

        ProgressBar progressBar;


        /**
         * constructor for the videoViewHolder object
         * sets up references to specific videos to be displayed in the recycler
         * establishes containers for video and text
         * @param itemView
         */
        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoView = itemView.findViewById(R.id.videoView);
            textVideoTitle1 = itemView.findViewById(R.id.textVideoTitle);
            textVideoDescription1 = itemView.findViewById(R.id.textVideoDescription);
            textVideoID1 = itemView.findViewById(R.id.textVideoID);
            progressBar = itemView.findViewById(R.id.videoProgressBar);
        }

        /**
         *sets up video playblack for the UI
          * @param videoItem
         */
        void setVideoData(VideoItem videoItem){

            /**
             * fills in text and video view items from java to the UI elements
             */
            textVideoTitle1.setText(videoItem.videoTitle);
            textVideoDescription1.setText(videoItem.videoDescription);
            textVideoID1.setText(videoItem.videoID);
            videoView.setVideoPath(videoItem.videoURL);

            /**
             * sets up a listner to be called when video is ready
             */
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){

                /**
                 * setup for next video to be played to remover loading
                 * on completion, loading bar is hidden
                 * video playback is started
                 * video size is properly adjusted to fit screen
                  * @param mp the MediaPlayer that is ready for playback
                 */
                @Override
                public void onPrepared(MediaPlayer mp) {
                    progressBar.setVisibility(View.GONE);

                    mp.start();
                    float videoRatio = mp.getVideoWidth() / (float) mp.getVideoHeight();
                    float screenRatio = videoView.getWidth() / (float) videoView.getHeight();

                    float scale = videoRatio / screenRatio;
                    if (scale >= 1f) {
                        videoView.setScaleX(scale);
                    }else{
                        videoView.setScaleY(1f / scale);
                    }



                }
            });
            /**
             * starts video when listner detects prep completion
             */
    videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.start();
                }
            });
        }
    }
}
