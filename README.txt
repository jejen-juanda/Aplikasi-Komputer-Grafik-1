Aplikasi Komputer Grafik satu ini adalah sebuah aplikasi yang dibuat dengan bahasa pemrograman java, namun tidak hanya dibuat untuk menyelesaikan tugas mata kuliah Komputer Grafik 1 saja. Aplikasi ini juga merupakan hasil imajinasi saya (Jejen Juanda) yang berangkat dari sebuah rasa penasaran saat membaca sebuah kalimat dari Ibu dosen pada awal pertemuan: "Kita akan menggambar, dan mewarnai."
Sebagai tunanetra yang tidak mempunyai penglihatan dan pengetahuan akan cahaya, warna, dan objek secara visual, saya merasa tertarik dengan hal ini. karena pada dasarnya saya adalah seorang yang begitu tertarik dengan coding, dan sering menghabiskan waktu untuk mencari potongan-potongan kode untuk di implementasikan pada imajinasi yang selalu muncul dengan tiba-tiba.
Tapi yang namanya belajar pasti selalu menemui tantangan dan hambatan, mata kuliah Komputer Grafik 1 ini yang seharusnya saya kerjakan dengan NetBeans IDE 8.2 ternyata hasilnya tidak memuaskan. selain karena screen reader (program pembaca layar) tidak dapat membaca menu-menu pada aplikasi dengan maksimal, tugas ini juga menjadi sangat membosankan akibat adanya dilei antara perpindahan kursor dari menu ke menu dengan suara screen reader yang harus saya dengarkan.
minggu pertama online learning lewat, akhirnya saya mendapatkan solusi untuk mengaktifkan Java Access Bridge dan men-copy file JavaAccessBridge-64.dll dari C:\Program Files\Java\jdk1.8.0_181\jre\bin ke C:\Windows\System32.
bahkan saya juga telah menginstal program tambahan NetBeans IDE 8.2 dengan Sodbeans 8.0 untuk menambah fitur Assistive Technologi, tapi hasilnya tetap saja kurang menyenangkan. dilei masih terjadi, dan terkadang aplikasi Sodbeans 8.0 ini juga menjadi not responding.
setelah ada kordinasi dengan tim Pusat Layanan Disabilitas Universitas Pamulang, kami pun mengadakan diskusi melalui Zoom selama beberapa jam dengan dosen. Dan akhirnya, kami pun sepakat untuk menggunakan pemrograman java secara manual dengan text editor NotPad dan cmd pada windows, sambil mencari solusi yang lebih tepat agar nantinya kami bisa tetap menggunakan IDE untuk pemrograman java.
"Apakah mungkin saya bisa menggambar dengan cara ini?" "apakah gambar yang selama ini hanya dibuat dalam pikiran dapat di wujudkan visualnya?" ternyata pada mata kuliah komputer grafik satu inilah ahirnya koding dapat mewakili mata saya yang tertutup rapat untuk menampilkan garis-garis yang telah ada sejak lama menjadi visual dalam pikiran.
ketika meraba layar monitor laptop, saya hanya bisa mengira bahwa inilah yang disebut Canvas. kemudian ibu dosen menambahkan bahwa garis pembatas itu boleh saya visualisasikan sebagai frame-nya, dan yang ada didalam garis pembatas itu adalah panel untuk menggoreskan garis-garis objek dengan koas seperti seorang pelukis sungguhan.
pada tampilan awal aplikasi, saya berusaha mengimajinasikan bahwa saya memiliki tombol-tombol yang ditampilkan melalui class JButton dari java, kemudian saya bayangkan  bentuknya ini seperti kotak atau keyboard laptop karena ukuran dimensi panjang dan lebarnya saya buat sama dengan fasilitas setsize.
Tombol-tombol itu saya warnai dengan warna merah melalui setBackground Color, dan saya letakan diatas canvas dengan susunan 3x5 dengan fasilitas setLocation.
selanjutnya, jika tombol-tombol ini di klik dengan menekan sepasi atau klik mouse, akan menampilkan grafik-grafik yang telah ditugaskan pada mata kuliah komputer grafik 1 ini.
apakah saya berhasil melakukannya? Apakah betul saya telah mengimajinasikan pikiran itu secara visual?
tentu saja hanya anda yang mempunyai penglihatan itulah yang akan mampu menjawabnya, mengkoreksi, dan memberikan saran jika masih terdapat kesalahan.
silahkan akses aplikasi ini secara manual dari windows 10 atau yang lainnya setelah beberapa persaratan berikut terpenuhi!
1. Instal aplikasi Java jdk  (jdk1.8.0_181), dan Java jre (jre1.8.0_251) atau versi diatasnya.
1.1. Atur sistem windows agar dapat mengakses aplikasi tersebut dengan cara set direktori pada Environment Variables sistem ke direktori instalasi java dengan langkah-langkah berikut:
A. Klik Properties pada This PC / Computer / MyComputer.
B. Buka Advanced system settings > Environment Variables, kemudian klik edit bagian Path pada system Variables.
C. Klik New, kemudian tambahkan alamat direktori java tadi secara lengkap, dan tekan Ok beberapakali untuk menyimpannya. contoh:
C:\Program Files\Java\jdk1.8.0_181\bin, dan C:\Program Files\Java\jre1.8.0_251\bin jika jdk dan jre yang di install adalah untuk windows 64bit pada windows 64bit, atau untuk windows 32bit pada windows 32bit.
dan C:\Program Files (x86)\Java\jdk1.8.0_181\bin, serta C:\Program Files (x86)\Java\jre1.8.0_251\bin jika yang di install adalah jdk dan jre untuk windows 32bit pada windows 64bit.
2. Buka cmd, dan arahkan pada direktori grafik yang telah di ekstrak dengan perintah cd "sepasi" alamat direktori. contoh:
"cd documents\java\grafik".
2.1. compile semua file.java dengan perintah "javac -d . file.java" secara berurutan mulai dari file Alphacomposite.java, Clipping.java, Cubiccurve.java, Curvespline.java, Feedback.java, Fontrender.java, Persegi.java, Segitiga.java, Tentang.java, dan Grafik.java sebagai file utama. contoh:
"javac -d . Grafik.java".
2.2. jalankan aplikasi dengan mengetik perintah "java grafik.Grafik".
2.3. setelah aplikasi terbuka, klik tombol tombol tersebut dengan menekan sepasi, dan tombol tab untuk berpindah antar tombol.
2.4. untuk menutup tampilan dan keluar dari aplikasi, tekan tombol alt plus f4.
Semoga aplikasi ini bermanfaat!
kritik, saran, dan komentar anda akan membantu untuk perkembangan imajinasi saya agar bisa memvisualisasikannya dengan benar dan tepat.
Repository: https://github.com/jejen-juanda/Aplikasi-Komputer-Grafik-1