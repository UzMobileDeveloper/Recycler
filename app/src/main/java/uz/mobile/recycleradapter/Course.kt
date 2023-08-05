package uz.mobile.recycleradapter

import java.io.Serializable

data class Course(
    var course_name: String,
    var star: Float? = null,
    var description:String,
    var author:String
): Serializable
