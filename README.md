# Food Recipes Android app

## Get started
For run android app on your local machine do this:
::Open app  
1. Install JDK 11 : [page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)  
2. Install AndroidStudio : [page](https://developer.android.com/studio)  
3. Create New Project in android studio `File -> NewProject -> EmptyProject` to load all environment and correct configuration  
4. Open iCosmetic Android app project in Android Studio: `File -> Open -> "android"`    

::Run app  
5. Smash on green start button in top menu

## Technologies stack

- Kotlin
- AndroidX
- MVVM
- LiveData
- ViewBinding
- Single Activity
- Retrofit2 + OkHttp4
- Room
- Hilt
- Navigation Component
- Coroutines
- ktlint

## Linters setup

### ktlint

1. Close Android Studio if open
2. Download `ktlint` file from this [page](https://github.com/pinterest/ktlint/releases)
3. Place this file in root folder of the project
4. Run command `java -jar ktlint --android applyToIDEAProject` 
5. For check your code use command `java -jar ktlint` or `java -jar ktlint -F` for autofix some issues.

## Git branch strategy

`master`: main branch of our repository

`feature/<task_number>/<description: optional>`: branch for developed new feature by task number

`bugfix/<task_number>/<description: optional>`: branch for fix bugs by task number