# Recipes Android app
Приложение позволяет получать пользователю свежие рецепты блюд с  
https://spoonacular.com/  
Приложение должно уметь:  
    1. Отображать список блюд с информацией  
    2. Каждая запись в списке на главном экране содержит:  
    (*фото, *название, *описание, счетчик лайков и просмотров (все предоставляется api) )  
    3. Имеется возможность детального просмотра рецепта  
        В подробнее, пользователю будут доступны след возможности:  
        а. Фото блюда,название,описание,список диет, к которому можно отнести это блюдо  
        б. ингредиенты  
        в. PWA (вебсайт с инструкцией по приготовлению внутри мобильного приложения)  
    4. Корректно обрабатывать ошибки с сервера и иметь возможность хранить данные в локальной базе  
    (например когда нет интернета)  
    5. Настраиваемые фильтры по типу блюд и типу диеты для поиска в api  
    6. Ручной поиск  

Tech Tasks
* BottomSheet Section:
    1. beauty design
    2. saving data from chips(filter) in to DataStoreRepository
    3. reading data from DataStoreRepository
* Recipes Section
    1. beauty design recyclerView element
    2. Logic read from api or read from database
    3.
* Navigation
* Handling internet connection (StateFlow) Hot stream

## Main page  
![image](https://github.com/aiserrock/Recipes/blob/master/png/main_screen.jpg)

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
