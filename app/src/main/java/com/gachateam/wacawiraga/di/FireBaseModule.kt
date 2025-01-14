package com.gachateam.wacawiraga.di

import com.google.mlkit.common.model.CustomRemoteModel
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.linkfirebase.FirebaseModelSource
import com.google.mlkit.vision.label.ImageLabeling
import com.google.mlkit.vision.label.custom.CustomImageLabelerOptions
import com.google.mlkit.vision.objects.ObjectDetection
import com.google.mlkit.vision.objects.custom.CustomObjectDetectorOptions
import com.google.mlkit.vision.vkp.VkpImageLabelerOptions
object FireBaseModule {
    private const val CUSTOM_MODEL_NAME = "gesture-detector"

    // Specify the name you assigned in the Firebase console.
    val remoteModel =
        CustomRemoteModel
            .Builder(FirebaseModelSource.Builder(CUSTOM_MODEL_NAME).build())
            .build()

    val downloadConditions = DownloadConditions.Builder()
        .build()

    val customObjectDetectorOptions = CustomObjectDetectorOptions.Builder(remoteModel)
        .setDetectorMode(CustomObjectDetectorOptions.SINGLE_IMAGE_MODE)
        .setClassificationConfidenceThreshold(0.5f)
        .enableClassification()
        .build()

    val objectDetector = ObjectDetection.getClient(customObjectDetectorOptions)


    val customImageLabelerOptions = CustomImageLabelerOptions.Builder(remoteModel)
        .setMaxResultCount(2)
        .build()

    val labeler = ImageLabeling.getClient(customImageLabelerOptions)

}