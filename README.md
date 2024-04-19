# LoadImagesApp

LoadImagesApp is an Android application that fetches images from an API and displays them within the app without relying on third-party libraries.

## Usage:

1. **Input Field**: Users can enter the number of images they want to fetch. Upon pressing the "Get API" button, the app will call the Unsplash API. Currently, the page is hardcoded to 1, so 30 images will be fetched. Pagination functionality has not been added as it was not a requirement.

2. **Caching**: If the user enters the same number of images in subsequent attempts, the app will not call the API again. Instead, it will fetch the images from the cache and display them.

3. **Error Handling**: The app includes error handling in case the API call fails.

4. **Compatibility**: LoadImagesApp is compatible with the latest versions of Android, utilizing Kotlin and the latest Android libraries.

## Installation:

Clone the repository:

git clone <repository-url>

Navigate into the project directory:

cd <project-directory>

Install dependencies:

npm install

## Configuration:

No additional configuration is required.
