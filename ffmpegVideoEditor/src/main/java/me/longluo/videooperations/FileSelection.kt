package me.longluo.videooperations

import com.jaiselrahman.filepicker.model.MediaFile

interface FileSelection {
    fun selectedFiles(mediaFiles: List<MediaFile>?, requestCode: Int) {}
}