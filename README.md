# waca-wiraga
Capstone Project for Gacha Team

For Cloud Computing learning path, we use firebase for storing the model we made. We use custom machine learning. Application waca wiraga will automatically download model tflite if the model was not present inside App, if model in cloud got replaced, application would automatically redownload new model from cloud. Creat Cloud Storage bucket fot archiving the ML model.

For Machine Learning learning path, the dataset for training a model collected by team, then the dataset process using colab google, set up the generate record and label map for training. Training a model using a pre-trained model SSD mobile fpnlite, then we get interface graph or frozen graph a result of model we trained (pb file). To use for mobile object detection we convert the model from pb file to tensorflow lite

For Android learning path, The Waca Wiraga App will download the model to be used as a Labeler from The Sign Image. The Button to open Picture Detection Activity will not fully function until the model is completely downloaded. The result will be contained in LiveData with Resource Class Wrapper as if simplify state changing from loading to success or error. Also, it will be shown in the ImageLabel list inside RecycleView with the highest confidence score and printed bold marking the result is possibly the highest right answer.
