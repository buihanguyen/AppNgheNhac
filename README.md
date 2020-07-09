# AppNgheNhac
Ứng dụng nghe nhạc 
- 
**Yêu cầu phần mềm**
- Android Studio phiên bản `4.x` trở lên
- Thiết bị Android có phiên bản `SDK 28` hoặc hơn

**Build chương trình**
- buildToolsVersion `29.0.3`

**Cài đặt thư viện**


- Vào thư mục `build.gradle` phần moudle:app cài thư viện bên dưới
- dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'

    implementation 'com.squareup.retrofit2:retrofit:2.3.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.3.0'
    implementation 'com.squareup.picasso:picasso:2.5.2'
    dependencies {
        implementation 'me.relex:circleindicator:1.2.2@aar'
    }

    dependencies {
        implementation 'com.eftimoff:android-viewpager-transformers:1.0.1@aar'
    }
    //noinspection GradleCompatible
    implementation 'com.android.support:cardview-v7:26.1.0'
    //noinspection GradleCompatible
    implementation 'com.android.support:recyclerview-v7:26.1.0'
    //noinspection GradleCompatible
    implementation 'com.android.support:design:27.1.0'
    implementation 'de.hdodenhof:circleimageview:2.2.0'
}
