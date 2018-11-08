package ke.co.henryskylinedesign.youtubeclone

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CourseDetailAdapter: RecyclerView.Adapter<CourseViewHolder>(){
    override fun getItemCount(): Int {
        return 3
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CourseViewHolder {
        val layoutInflater = LayoutInflater.from(p0?.context)
        val lessonRow = layoutInflater.inflate(R.layout.course_lesson_row, p0, false)
        return  CourseViewHolder(lessonRow)
    }

    override fun onBindViewHolder(p0: CourseViewHolder, p1: Int) {

    }
}

class CourseViewHolder(val customView: View): RecyclerView.ViewHolder(customView){

}