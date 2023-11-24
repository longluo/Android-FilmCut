package me.longluo.filmcut

import android.view.View
import kotlinx.android.synthetic.main.activity_main.imageGifOperation
import kotlinx.android.synthetic.main.activity_main.videoOperation
import me.longluo.filmcut.middlewareActivity.OtherFFMPEGProcessActivity
import me.longluo.filmcut.middlewareActivity.VideoProcessActivity

class MainActivity : BaseActivity(R.layout.activity_main, R.string.ffpmeg_title) {
    override fun initialization() {
        supportActionBar?.title = getString(R.string.ffpmeg_title)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(false)
        videoOperation.setOnClickListener(this)
        imageGifOperation.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.videoOperation -> {
                utils.openActivity(this, VideoProcessActivity())
            }

            R.id.imageGifOperation -> {
                utils.openActivity(this, OtherFFMPEGProcessActivity())
            }
        }
    }

}