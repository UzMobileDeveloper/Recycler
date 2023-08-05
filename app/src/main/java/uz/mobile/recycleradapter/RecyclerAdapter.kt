package uz.mobile.recycleradapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.mobile.recycleradapter.databinding.ItemBinding

class RecyclerAdapter(var list: ArrayList<Course>, var context: Context) :
    RecyclerView.Adapter<RecyclerAdapter.VH>() {

    var onClickListener: OnClickListener? = null

    inner class VH(var binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        var binding = ItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return VH(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        var course: Course = list[position]
        holder.binding.star.text = list[position].star.toString()
        holder.binding.title.text = list[position].course_name.toString()
        holder.itemView.setOnClickListener {
            onClickListener?.onClick(position, course)
        }
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener {
        fun onClick(position: Int, course: Course)
    }

}