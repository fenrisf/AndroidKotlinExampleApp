package fenrisf.com.trainingapp

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by albertomartinez on 6/04/17.
 */

fun Context.toast (text: CharSequence, length: Int = Toast.LENGTH_LONG){
    Toast.makeText(this,text, length).show()
}

fun ViewGroup.inflate (layoutRes: Int): View{
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}

fun ImageView.loadUrl(url: String){
    Picasso.with(context).load(url).into(this)
}