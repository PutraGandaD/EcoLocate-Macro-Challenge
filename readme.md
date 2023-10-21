# EcoLocate
![banner](https://github.com/PutraGandaD/EcoLocate-Macro-Challenge/assets/54593964/e83261cc-a451-437e-abbe-79e75b58a794)

## What is EcoLocate
EcoLocate merupakan aplikasi mobile (Android) yang dapat membantu masyarakat menemukan Fasilitas Tempat Pembuangan Sampah legal terdekat, baik TPS 3R (Reuse, Reduce, Recycle), TPS Terpadu (TPST), Pusat Daur Ulang (PDU), maupun TPS Non 3R serta memberikan edukasi tentang cara pengolahan sampah yang baik dan benar kepada masyarakat.

## About EcoLocate Project
Aplikasi EcoLocate dibuat untuk menyelesaikan project Macro Challenge pada Studi Independen Mobile Development Application di Infinite Learning Kota Batam, bagian dari Studi Independen Bersertifikat Batch 5 yang diselenggarakan oleh Kementerian Pendidikan dan Kebudayaan Republik Indonesia.

Adapun project Aplikasi EcoLocate ini merupakan Group Project. Grup kami bernama EcoGank (Group 8), yang beranggotakan 5 orang.
Berikut merupakan anggota dari grup kami beserta role nya masing-masing =
- Putra Ganda Dewata (Project Manager, Hipster, Hacker)
- Rafi Nur Latif (Hipster, Hacker)
- Novia Indah Ramadhani (Hipster)
- Aditya Pratama (Hipster)
- Dharyl Abi Yashfalaqi (Hipster)

## Tech used
Untuk Frontend, kami menggunakan basis dari Material Design 3 by Google, yang dapat diakses pada https://m3.material.io
- Frontend =
  - [x] Basic Layouting (LinearLayout, ConstraintLayout, CoordinatorLayout)
  - [x] Basic Scrolling (ScrollView Vertical/Horizontal, Nested ScrollView)
  - [x] Bottom Sheet (Persistent Bottom Sheet / Dialog(Modal) Bottom Sheet)
  - [x] Bottom Navigation Bar, Top AppBar, CardView
 
- Basic Backend
  - [x] Fragments with Intent
  - [x] Parcelable for passing data from Adapter -> Fragments -> Activity
  - [x] RecyclerView with LinearLayoutManager (Horizontal/Vertical)
  - [x] Data Class (for data storing)
  - [x] Google Maps Android SDK with Google Maps API usage for "Temukan" feature (https://developers.google.com/maps/documentation/android-sdk , https://console.cloud.google.com/apis/library/maps-android-backend.googleapis.com)

# Tampilan Frontend (UI)
## Tampilan Landing Page
![landing_page](https://github.com/PutraGandaD/EcoLocate-Macro-Challenge/assets/54593964/3f5ebcf2-be70-4156-97d2-8d163b86ad98)

## Tampilan Beranda
![beranda_page](https://github.com/PutraGandaD/EcoLocate-Macro-Challenge/assets/54593964/1e5c743a-c42b-441b-b5e9-a67ab35be6de)

## Tampilan fitur "Temukan"
![temukan_page](https://github.com/PutraGandaD/EcoLocate-Macro-Challenge/assets/54593964/8cdb022c-b846-4ac2-ae07-b2dcc0c41207)

## Tampilan fitur "Pojok Edukasi"
![pojokedukasi_page](https://github.com/PutraGandaD/EcoLocate-Macro-Challenge/assets/54593964/58ff0ca3-6488-42de-ad2e-f03efea7914d)

## Tampilan Profil
![profil_page](https://github.com/PutraGandaD/EcoLocate-Macro-Challenge/assets/54593964/c470cdcf-4b70-4c60-8f40-1fd50b00b747)

# How to run
Download sebagai zip sourcecode ini dan build melalui Android Studio. Jalankan aplikasi pada emulator dengan device frame Pixel XL agar mendapatkan
tampilan aplikasi yang maksimal.

Agar fitur Google Maps pada fitur "Temukan" berjalan dengan baik, gunakan Google Maps API Key anda sendiri yang bisa didapatkan melalui :
https://console.cloud.google.com/apis/library/maps-android-backend.googleapis.com
Kemudian, tempatkan API Key di MAPS_API_KEY pada file local.properties di Gradle Scripts
Kira-kira, tampilan dari local.properties anda akan seperti ini :
```
sdk.dir=/..../Android/sdk
MAPS_API_KEY= (Tempatkan API Key Google Maps Anda)
```
