package me.longluo.filmcut.middlewareActivity

import android.view.View
import kotlinx.android.synthetic.main.activity_video_process.btnAddTextOnVideo
import kotlinx.android.synthetic.main.activity_video_process.btnAddWaterMarkOnVideo
import kotlinx.android.synthetic.main.activity_video_process.btnCombineImageVideo
import kotlinx.android.synthetic.main.activity_video_process.btnCombineImages
import kotlinx.android.synthetic.main.activity_video_process.btnCombineVideos
import kotlinx.android.synthetic.main.activity_video_process.btnCompressVideo
import kotlinx.android.synthetic.main.activity_video_process.btnCutVideo
import kotlinx.android.synthetic.main.activity_video_process.btnExtractAudio
import kotlinx.android.synthetic.main.activity_video_process.btnExtractVideo
import kotlinx.android.synthetic.main.activity_video_process.btnFadeInFadeOutVideo
import kotlinx.android.synthetic.main.activity_video_process.btnImageToVideo
import kotlinx.android.synthetic.main.activity_video_process.btnMergeImageAndAudio
import kotlinx.android.synthetic.main.activity_video_process.btnMergeVideoAndAudio
import kotlinx.android.synthetic.main.activity_video_process.btnMotion
import kotlinx.android.synthetic.main.activity_video_process.btnRemoveAudioFromVideo
import kotlinx.android.synthetic.main.activity_video_process.btnReverseVideo
import kotlinx.android.synthetic.main.activity_video_process.btnSetAspectRatio
import kotlinx.android.synthetic.main.activity_video_process.btnVideoConvertIntoGIF
import kotlinx.android.synthetic.main.activity_video_process.btnVideoRotateFlip
import me.longluo.filmcut.BaseActivity
import me.longluo.filmcut.R
import me.longluo.filmcut.videoProcessActivity.AddTextOnVideoActivity
import me.longluo.filmcut.videoProcessActivity.AddWaterMarkOnVideoActivity
import me.longluo.filmcut.videoProcessActivity.AspectRatioActivity
import me.longluo.filmcut.videoProcessActivity.CombineImageAndVideoActivity
import me.longluo.filmcut.videoProcessActivity.CombineImagesActivity
import me.longluo.filmcut.videoProcessActivity.CombineVideosActivity
import me.longluo.filmcut.videoProcessActivity.CompressVideoActivity
import me.longluo.filmcut.videoProcessActivity.CutVideoUsingTimeActivity
import me.longluo.filmcut.videoProcessActivity.ExtractAudioActivity
import me.longluo.filmcut.videoProcessActivity.ExtractImagesActivity
import me.longluo.filmcut.videoProcessActivity.FastAndSlowVideoMotionActivity
import me.longluo.filmcut.videoProcessActivity.ImageToVideoConvertActivity
import me.longluo.filmcut.videoProcessActivity.MergeAudioVideoActivity
import me.longluo.filmcut.videoProcessActivity.MergeImageAndMP3Activity
import me.longluo.filmcut.videoProcessActivity.RemoveAudioFromVideoActivity
import me.longluo.filmcut.videoProcessActivity.ReverseVideoActivity
import me.longluo.filmcut.videoProcessActivity.VideoFadeInFadeOutActivity
import me.longluo.filmcut.videoProcessActivity.VideoRotateFlipActivity
import me.longluo.filmcut.videoProcessActivity.VideoToGifActivity


class VideoProcessActivity :
    BaseActivity(R.layout.activity_video_process, R.string.video_operations) {
    override fun initialization() {
        supportActionBar?.title = getString(R.string.video_operations)
        btnCutVideo.setOnClickListener(this)
        btnImageToVideo.setOnClickListener(this)
        btnAddWaterMarkOnVideo.setOnClickListener(this)
        btnCombineImageVideo.setOnClickListener(this)
        btnCombineImages.setOnClickListener(this)
        btnCombineVideos.setOnClickListener(this)
        btnCompressVideo.setOnClickListener(this)
        btnExtractVideo.setOnClickListener(this)
        btnExtractAudio.setOnClickListener(this)
        btnMotion.setOnClickListener(this)
        btnReverseVideo.setOnClickListener(this)
        btnFadeInFadeOutVideo.setOnClickListener(this)
        btnVideoConvertIntoGIF.setOnClickListener(this)
        btnVideoRotateFlip.setOnClickListener(this)
        btnMergeVideoAndAudio.setOnClickListener(this)
        btnAddTextOnVideo.setOnClickListener(this)
        btnRemoveAudioFromVideo.setOnClickListener(this)
        btnMergeImageAndAudio.setOnClickListener(this)
        btnSetAspectRatio.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnCutVideo -> {
                utils.openActivity(this, CutVideoUsingTimeActivity())
            }

            R.id.btnImageToVideo -> {
                utils.openActivity(this, ImageToVideoConvertActivity())
            }

            R.id.btnAddWaterMarkOnVideo -> {
                utils.openActivity(this, AddWaterMarkOnVideoActivity())
            }

            R.id.btnCombineImageVideo -> {
                utils.openActivity(this, CombineImageAndVideoActivity())
            }

            R.id.btnCombineImages -> {
                utils.openActivity(this, CombineImagesActivity())
            }

            R.id.btnCombineVideos -> {
                utils.openActivity(this, CombineVideosActivity())
            }

            R.id.btnCompressVideo -> {
                utils.openActivity(this, CompressVideoActivity())
            }

            R.id.btnExtractVideo -> {
                utils.openActivity(this, ExtractImagesActivity())
            }

            R.id.btnExtractAudio -> {
                utils.openActivity(this, ExtractAudioActivity())
            }

            R.id.btnMotion -> {
                utils.openActivity(this, FastAndSlowVideoMotionActivity())
            }

            R.id.btnReverseVideo -> {
                utils.openActivity(this, ReverseVideoActivity())
            }

            R.id.btnFadeInFadeOutVideo -> {
                utils.openActivity(this, VideoFadeInFadeOutActivity())
            }

            R.id.btnVideoConvertIntoGIF -> {
                utils.openActivity(this, VideoToGifActivity())
            }

            R.id.btnVideoRotateFlip -> {
                utils.openActivity(this, VideoRotateFlipActivity())
            }

            R.id.btnMergeVideoAndAudio -> {
                utils.openActivity(this, MergeAudioVideoActivity())
            }

            R.id.btnAddTextOnVideo -> {
                utils.openActivity(this, AddTextOnVideoActivity())
            }

            R.id.btnRemoveAudioFromVideo -> {
                utils.openActivity(this, RemoveAudioFromVideoActivity())
            }

            R.id.btnMergeImageAndAudio -> {
                utils.openActivity(this, MergeImageAndMP3Activity())
            }

            R.id.btnSetAspectRatio -> {
                utils.openActivity(this, AspectRatioActivity())
            }
        }
    }
}