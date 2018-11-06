package ke.co.henryskylinedesign.youtubeclone

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.video_row.view.*

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>(){
    val videoTitles = listOf("First title", "Second title", "Third title")
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

    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}
