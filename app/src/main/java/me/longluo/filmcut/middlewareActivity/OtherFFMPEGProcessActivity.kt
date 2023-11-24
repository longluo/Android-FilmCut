package me.longluo.filmcut.middlewareActivity

import android.view.View
import kotlinx.android.synthetic.main.activity_other_ffmpeg_process.btnAudiosVolumeUpdate
import kotlinx.android.synthetic.main.activity_other_ffmpeg_process.btnCompressAudio
import kotlinx.android.synthetic.main.activity_other_ffmpeg_process.btnCutAudio
import kotlinx.android.synthetic.main.activity_other_ffmpeg_process.btnFastAndSlowAudio
import kotlinx.android.synthetic.main.activity_other_ffmpeg_process.btnMergeAudios
import kotlinx.android.synthetic.main.activity_other_ffmpeg_process.btnMergeGIF
import me.longluo.filmcut.BaseActivity
import me.longluo.filmcut.R
import me.longluo.filmcut.otherFFMPEGProcessActivity.AudiosMergeActivity
import me.longluo.filmcut.otherFFMPEGProcessActivity.ChangeAudioVolumeActivity
import me.longluo.filmcut.otherFFMPEGProcessActivity.CompressAudioActivity
import me.longluo.filmcut.otherFFMPEGProcessActivity.CropAudioActivity
import me.longluo.filmcut.otherFFMPEGProcessActivity.FastAndSlowAudioActivity
import me.longluo.filmcut.otherFFMPEGProcessActivity.MergeGIFActivity

class OtherFFMPEGProcessActivity :
    BaseActivity(R.layout.activity_other_ffmpeg_process, R.string.other_ffmpeg_operations) {
    override fun initialization() {
        supportActionBar?.title = getString(R.string.other_ffmpeg_operations)
        btnMergeGIF.setOnClickListener(this)
        btnMergeAudios.setOnClickListener(this)
        btnAudiosVolumeUpdate.setOnClickListener(this)
        btnFastAndSlowAudio.setOnClickListener(this)
        btnCutAudio.setOnClickListener(this)
        btnCompressAudio.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnMergeGIF -> {
                utils.openActivity(this, MergeGIFActivity())
            }

            R.id.btnMergeAudios -> {
                utils.openActivity(this, AudiosMergeActivity())
            }

            R.id.btnAudiosVolumeUpdate -> {
                utils.openActivity(this, ChangeAudioVolumeActivity())
            }

            R.id.btnFastAndSlowAudio -> {
                utils.openActivity(this, FastAndSlowAudioActivity())
            }

            R.id.btnCutAudio -> {
                utils.openActivity(this, CropAudioActivity())
            }

            R.id.btnCompressAudio -> {
                utils.openActivity(this, CompressAudioActivity())
            }
        }
    }

}