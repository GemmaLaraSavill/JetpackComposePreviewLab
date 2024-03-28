# Readme for Jetpack Compose Preview Lab

This is an Android Jetpack Compose Preview example project, created as part of an article on my blog [My Happy Place](https://www.myhappyplace.dev/)

With previews, you can see your UI updates in real-time as you modify your code. No more compiling and restarting the app! If you have a Composable Preview defined, you can open the Preview panel on the top right of your Android Studio window.

**What are Jetpack Compose Previews?**

Jetpack Compose Previews allow you to see how your composable functions look within Android Studio without needing to deploy the entire application. This is a powerful tool for rapid development and ensuring your UI looks as expected.

This repository contains example code demonstrating three main ways to create your Jetpack Compose Previews.

- in **screens/RegularPreviewScreen** you can see how I have added regular Previews.
- in **screens/CustomPreviewScreen** I show an example of how you can extract your most used @Preview annotations to create your own reusable annotations
- in **screens/MultiPreviewScreen** you can see examples of usage of the Multipreview API templates library. Templates like **@PreviewScreenSizes**, **@PreviewFontScales**, **@PreviewLightDark**, and **@PreviewDynamicColors** let you preview your composable across various configurations with a single annotation. This saves time and keeps your preview code clean.

**Here you can read the blog post article:**

[https://www.myhappyplace.dev/blog/see-it-before-you-build-it-mastering-jetpack-compose-previews/](https://www.myhappyplace.dev/blog/see-it-before-you-build-it-mastering-jetpack-compose-previews/)

## Getting Started

Clone the repository:

```console
git clone https://github.com/GemmaLaraSavill/JetpackComposePreviewLab.git
```

Open the project in Android Studio.

## Running the Previews

Open the composable file you want to preview.

Look for any functions annotated with **@Preview**. These functions will be rendered in the design view of the file.

## Additional Resources

- Android Developers - Using the Bill of Materials [https://developer.android.com/jetpack/compose/bom](https://developer.android.com/jetpack/compose/bom)

- Android Developers - BOM to library version mapping [https://developer.android.com/jetpack/compose/bom/bom-mapping](https://developer.android.com/jetpack/compose/bom/bom-mapping)

- Android Developers - Preview your UI with composable previews [https://developer.android.com/jetpack/compose/tooling/previews](https://developer.android.com/jetpack/compose/tooling/previews)

- Create your own Android Bot [https://www.android.com/build-android-bot/](https://www.android.com/build-android-bot/)


