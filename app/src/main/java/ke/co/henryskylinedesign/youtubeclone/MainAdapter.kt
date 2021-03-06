package ke.co.henryskylinedesign.youtubeclone

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.video_row.view.*

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>(){
    override fun getItemCount(): Int {
        return homeFeed.videos.count()
    }

    override  fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row,p0, false)
        return CustomViewHolder(cellForRow)
    }

    override  fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        val video = homeFeed.videos.get(p1)
        p0.view.videoTitle.text = video.name
        p0.view.channelName.text = video.channel.name + " • 20K Views \n3days ago"
        val videoImage = p0.view.videoImage
        Picasso.get().load(video.imageUrl).into(videoImage)
        val channelImage = p0.view.channelImage
        Picasso.get().load(video.channel.profileImageUrl).into(channelImage)

    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    init {
        view.setOnClickListener {
            val intent = Intent(view.context, CourseDetailActivity::class.java)
            view.context.startActivity(intent)
        }
    }
}
