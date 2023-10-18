package org.ecogank.ecolocate

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.ecogank.ecolocate.Adapter.BacaanBerandaAdapter
import org.ecogank.ecolocate.Adapter.BacaanPojokEdukasiAdapter
import org.ecogank.ecolocate.Adapter.BacaanPojokEdukasiDuaAdapter
import org.ecogank.ecolocate.Model.BacaanBeranda

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PojokEdukasiFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PojokEdukasiFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pojok_edukasi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Recycler View Bacaan Beranda 1
        val bacaanPojokRV : RecyclerView = view.findViewById(R.id.rv_pojok_1)
        bacaanPojokRV.setHasFixedSize(true)
        bacaanPojokRV.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val bacaanPojokList = ArrayList<BacaanBeranda>()

        bacaanPojokList.add(BacaanBeranda(R.drawable.img_bacaanberanda01, "Mengenal Macam-macam Fasilitas Pengelolaan Sampah di Indonesia", "Pengolahan sampah bisa melalui beberapa tahap untuk bisa sampai ke Tempat Pemrosesan Akhir (TPA). Sampah yang dihasilkan dikumpulkan di TPS, diangkut, dan dikelola, dan dibuang hingga sampai ke TPA. Lokasi TPA harus terisolir guna menghindari dampak negatif yang bisa timbul terhadap lingkungan.\n" +
                "\n" +
                "Terdapat sejumlah fasilitas pengelolaan sampah yaitu TPS, TPS 3R, TPST, dan TPA. Ikuti penjelasan berikut untuk mengetahui lebih lengkapnya\n" +
                "\n" +
                "Tempat Penampungan Sementara (TPS)\n" +
                "\n" +
                "Setiap sampah yang dihasilkan proses pertamanya yaitu memasuki Tempat Penampungan Sementara (TPS). TPS merupakan tempat penampungan sebelum sampah diangkut ke tempat pendauran ulang, pengolahan, Tempat Pengolahan Sampah Terpadu (TPST), Tempat Pengolahan Sampah Reduce, Reuse, Recycle (TPS 3R), dan terakhir ke TPA. \n" +
                "\n" +
                "Kriteria teknis yang harus dipenuhi TPS yaitu:\n" +
                "\n" +
                "Luas TPS sampai setidaknya 200 m2\n" +
                "Mengelompokkan sampah menjadi paling sedikit 5  jenis sampah pada tempat yang berbeda yaitu sampah organik, non-organik, kertas, B3, dan residu.\n" +
                "Jenis penampung sampah sementara bukan merupakan wadah permanen.\n" +
                " Luas lokasi dan kapasitas sesuai kebutuhan.\n" +
                "Lokasinya harus mudah diakses.\n" +
                " Tidak menimbulkan pencemaran lingkungan.\n" +
                "Penempatan tidak mengganggu estetika dan lalu lintas di sekitarnya.\n" +
                "Memiliki jadwal pengumpulan dan pengangkutan yang teratur.\n" +
                "TPS 3R (Reduce, Reuse, Recycle)\n" +
                "\n" +
                "Proses selanjutnya sampah akan dikelola di TPS 3R. TPS 3R memiliki konsep dengan tujuan Reduce (mengurangi), Reuse (menggunakan kembali) dan Recycle (daur ulang). TPS 3 R kemudian juga bertujuan untuk melayani suatu kelompok masyarakat, termasuk di kawasan masyarakat berpenghasilan rendah yang terdiri dari minimal 400 rumah atau kepala keluarga.\n" +
                "\n" +
                "Tujuan utama pengolahan sampah di TPS 3R adalah untuk mengurangi kuantitas dan/atau memperbaiki karakteristik sampah sebelum nantinya diolah lebih lanjut di Tempat Pemrosesan Akhir (TPA) sampah.\n" +
                "\n" +
                "TPS 3R juga bertujuan menjamin kebutuhan lahan yang semakin sedikit untuk penyediaan TPA sampah di perkotaan. Hal ini sejalan dengan kebijakan nasional, untuk meletakkan TPA sampah pada hirarki terbawah, sehingga meminimalisir residu saja untuk kemudian diurus di TPA.\n" +
                "\n" +
                "Persyaratan TPS 3R diatur dalam Permen No. 2 tahun 2013 pasal 29 ayat (2) dan ayat (3) harus memenuhi persyaratan teknis, yaitu:\n" +
                "\n" +
                "Luas TPS 3R, lebih besar dari 200 m2.\n" +
                "Adanya sarana untuk mengelompokkan sampah menjadi paling sedikit 5 (lima) jenis sampah (organik, non-organik, kertas, B3, dan residu).\n" +
                "TPS 3R punya ruang pemilahan, pengomposan sampah organik, dan/atau unit penghasil gas bio, gudang, zona penyangga, dan tidak mengganggu estetika serta lalu lintas.\n" +
                "Jenis pembangunan penampung sisa pengolahan sampah di TPS 3R bukan merupakan wadah permanen.\n" +
                "Lokasi TPS 3R sedekat mungkin dengan daerah pelayanan dan radius tidak lebih dari 1 km\n" +
                "Luas lokasi dan kapasitas sesuai kebutuhan.\n" +
                "Lokasi mudah diakses.\n" +
                "Tidak mencemari lingkungan.\n" +
                "Ada jadwal pengumpulan dan pengangkutan.\n" +
                "Tempat Pengolahan Sampah Terpadu (TPST)\n" +
                "\n" +
                "Tempat Pengolahan Sampah Terpadu (TPST) merupakan tempat dilakukannya kegiatan pengumpulan, pemilahan, penggunaan ulang, pendauran ulang, pengolahan, dan pemrosesan akhir sampah.\n" +
                "\n" +
                "TPST punya sistem proses sampah yang lebih kompleks dibandingkan dengan TPS 3R (Tempat Pemrosesan Sampah Reduce-Reuse-Recycle), sebab TPST mengelola sampai pada pemrosesan akhir sampah sehingga aman saat dikembalikan ke lingkungan.\n" +
                "\n" +
                "Persyaratan TPST dijelaskan dalam Permen No. 2 tahun 2013 pasal 32 yang harus memenuhi persyaratan teknis, yaitu:\n" +
                "\n" +
                "Luas TPST lebih besar dari 20.000 m2.\n" +
                "Penempatan lokasi TPST bisa di dalam kota dan atau di TPA.\n" +
                "Jarak TPST ke pemukiman terdekat minimal 500 meter.\n" +
                "Pengolahan sampah di TPST dapat menggunakan teknologi sebagaimana dimaksud pada Pasal 31 ayat (3).\n" +
                "Fasilitas TPST dilengkapi dengan ruang pemilah, instalasi pengolahan sampah, pengendalian pencemaran lingkungan, penanganan residu, dan fasilitas penunjang serta zona penyangga.\n" +
                "Tempat Pemrosesan Akhir (TPA)\n" +
                "\n" +
                "Proses terakhir, sampah akan dipindahkan ke Tempat Pemrosesan Akhir (TPA). TPA menjadi tempat untuk memproses dan mengembalikan sampah ke media lingkungan secara aman bagi manusia dan lingkungan.\n" +
                "\n" +
                "Perbedaan antara TPST dengan TPA adalah dalam kebijakan sistem pengelolaan sampahnya. TPST melakukan berbagai kegiatan pengolahan sampah seperti kegiatan pengumpulan, pemilahan, penggunaan ulang, pendauran ulang, pengolahan, dan pemrosesan akhir sampah. Sementara TPA melakukan pengurusan sampah dengan metode landfill  yang dikembangkan menjadi controlled landfill dan sanitary landfill.\n" +
                "\n" +
                "Landfill dibutuhkan karena beberapa alasan berikut ini:\n" +
                "\n" +
                "Pengurangan limbah di sumber, daur ulang atau minimasi limbah tidak dapat menyingkirkan seluruh limbah\n" +
                "Pengolahan limbah biasanya menghasilkan residu yang harus ditangani lebih lanjut.\n" +
                "Kadang limbah sulit diuraikan secara biologis, sulit diolah secara kimia, atau sulit  jika dibakar.\n" +
                "Pentingnya isolasi sampah di TPA untuk mencegah beberapa permasalahan, yaitu:\n" +
                "\n" +
                "Pertumbuhan penyebab penyakit: Sampah adalah sarang yang sesuai bagi berbagai vektor penyakit. Berbagai jenis tikus, lalat, kecoa, dan nyamuk sering dijumpai di tempat sampah.\n" +
                "Pencemaran udara: Gas metana (CH4) yang dihasilkan dari reaksi pembusukan anaerobik (tanpa oksigen) dari sampah organik dapat menyebabkan ledakan jika gas metana terkena percikan api atau petir. Gas metana juga menjadi salah satu penyebab perubahan iklim yang ekstrim.\n" +
                "Pencemaran lindi: Lindi adalah air hasil dekomposisi sampah, yang dapat meresap dan mencemari air tanah. Timbulan lindi (leachate generation) dipengaruhi oleh sumber air eksternal seperti curah hujan (presipitasi harian), aliran permukaan, infiltrasi, evaporasi, transpirasi, temperatur, komposisi sampah, kelembapan dan kedalaman/ketinggian tumpukan sampah di TPA."))
        bacaanPojokList.add(BacaanBeranda(R.drawable.img_bacaanberanda02, "Tahapan Proses Daur Ulang Plastik", "Seperti yang kita ketahui, plastik menjadi hal yang tidak bisa dipisahkan dari kehidupan kita. Namun, plastik juga menjadi masalah yang signifikan bagi lingkungan, karena sampah plastik dapat mengancam kehidupan makhluk hidup dan membutuhkan ratusan tahun untuk terurai, bahkan untuk sebagian jenis plastik sama sekali tidak bisa hilang dari muka bumi. Terlebih seperti kalian tahu bahwa sebagian besar plastik yang ada saat ini berasal dari minyak bumi, dimana merupakan sumber daya yang tidak dapat diperbaharui.\n" +
                "Di tulisan kali ini, kami ingin sedikit membahas langkah-langkah daur ulang plastik yang biasa digunakan. Seperti kampanye #CeritaDaurUlang yang kami launch tahun ini, tulisan ini bukan untuk mendukung proses daur ulang begitu saja, namun untuk membuat kita semakin aware bahwa proses daur ulang adalah proses yang panjang yang memerlukan banyak energi sehingga jalan terbaik adalah MENCEGAH semaksimal mungkin.\n" +
                "Proses Daur Ulang Plastik\n" +
                "\n" +
                "Secara umum, ada 6 langkah daur ulang plastik yang biasa digunakan.\n" +
                "1. Koleksi\n" +
                "\n" +
                "Langkah pertama dalam proses daur ulang sampah yaitu mengumpulkan material atau plastik yang akan didaur ulang. Di saat ini lah para pelaku daur ulang mengumpulkan sisa konsumsi plastik dari rumah tangga maupun industri untuk mereka jadikan satu. Maka dari itu kemudahan dan keefektifan proses ini dan proses setelah ini sangat bergantung dengan bagaimana kita memilih dan memilah sampah dari rumah.\n" +
                "2. Sortir\n" +
                "\n" +
                "Setelah sampah plastik dikumpulkan, pelaku daur ulang akan menyortir dengan lebih detail berdasarkan beberapa item, mulai dari jenis plastik (bahan pembuatan), warna plastik, kandungan resin, atau bahkan cara pembuatannya. Proses ini menjadi salah satu bagian penting karena jenis plastik yang berbeda harus diproses dengan cara yang berbeda pula.\n" +
                "Mungkin memilah secara detail seperti itu menantang untuk kita lakukan dari rumah, namun tidak ada salahnya untuk menambah pengetahuan dan siapa tahu dapat mempraktekkannya juga sehingga meringankan beban pelaku daur ulang.\n" +
                "Baca juga: 7 Simbol dan Jenis Plastik yang Perlu Kamu Ketahui\n" +
                "3. Pencucian\n" +
                "\n" +
                "Pencucian sampah bertujuan untuk menghilangkan sisa kotoran dan segala sesuatu yang tidak terbuat dari plastik. Sebagian besar kemasan plastik memiliki label, perekat, atau bahkan sisa makanan yang tidak dapat didaur ulang.\n" +
                "4. Resizing\n" +
                "\n" +
                "Sampah plastik yang sudah di sortir dan dicuci, kemudian dipotong menjadi serpihan-serpihan kecil. Hal ini akan membantu memudahkan proses pembentukan dan menjadi kesempatan kembali untuk dibersihkan agar tidak tercampur dengan bahan non-plastik.\n" +
                "5. Pemilahan Plastik\n" +
                "\n" +
                "Setelah proses resizing, langkah selanjutnya yaitu pemilahan plastik. Pada saat pemilihan, serpihan-serpihan plastik diuji untuk menentukan kualitasnya.\n" +
                "Kualitas pertama yang diuji yaitu kepadatan serpihan plastik. Pengujian seperti ini dilakukan dengan memasukkan serpihan-serpihan plastik ke dalam wadah besar berisi air. Partikel yang kurang padat akan mengapung, sementara partikel yang lebih padat akan tenggelam.\n" +
                "Pengujian selanjutnya yaitu air classification (penggolong udara), yaitu proses untuk mengukur seberapa besar atau kecil sebuah partikel dengan memasukkan material ke dalam ruang berisikan udara untuk disortir.\n" +
                "Pengujian ini dilakukan dengan menjatuhkan partikel plastik ke dalam ruang yang berisi udara. Partikel yang lebih kecil akan terbang ke atas, sedangkan partikel yang lebih besar akan terbang rendah ke bawah.\n" +
                "6. Penggabungan\n" +
                "\n" +
                "Langkah terakhir dalam proses daur ulang sampah plastik yaitu penggabungan, dimana serpihan-serpihan plastik dihancurkan dan dilebur menjadi pelet plastik. Kemudian, pelet plastik tersebut diangkut ke perusahaan manufaktur plastik dan siap digunakan kembali untuk memproduksi produk bermanfaat lainnya.\n" +
                "Itulah 6 tahapan yang biasa dilakukan untuk proses daur ulang sampah. Panjang dan tidak mudah.. Belum lagi karbon emisi yang dihasilkan. Beberapa produk memang sedikit sulit dicari alternatif single use plastic nya, namun banyak juga yang ada alternatifnya. Kita harus kritis dan terus bertanya, pilihan apa yang terbaik. Ingat bahwa DAUR ULANG adalah JALAN TERAKHIR dari PIRAMIDA 6R dari konsep Zero Waste."))
        bacaanPojokList.add(BacaanBeranda(R.drawable.img_bacaanberanda03, "Berbagai Manfaat Pupuk Kompos", "Kompos merupakan salah satu jenis pupuk organik yang sudah ada sejak lama. Pengertian kompos adalah bahan-bahan organik yang sudah mengalami proses pelapukan karena terjadi interaksi antara mikroorganisme atau bakteri pembusuk yang bekerja di dalam bahan organik tersebut. \n" +
                "\n" +
                "Bahan organik yang dimaksud pada pengertian kompos adalah rumput, jerami, sisa ranting dan dahan, kotoran hewan, bunga yang rontok, air kencing hewan ternak, serta bahan organik lainnya. Semua bahan organik tersebut akan mengalami pelapukan yang diakibatkan oleh mikroorganisme yang tumbuh subur pada lingkungan lembap dan basah.\n" +
                "\n" +
                "Pada dasarnya, proses pelapukan ini merupakan proses alamiah yang biasa terjadi di alam. Namun, proses pelapukan secara alami ini berlangsung dalam jangka waktu yang sangat lama, bahkan bisa mencapai puluhan tahun. Untuk mempersingkat proses pelapukan, diperlukan adanya bantuan dari manusia. Jika proses pengomposan dilakukan dengan benar, proses hanya berlangsung selama 1—3 bulan saja, tidak sampai bertahun-tahun.\n" +
                "\n" +
                "Kompos tidak hanya berfungsi untuk menambah unsur hara, tetapi juga menjaga fungsi tanah sehingga tanaman dapat tumbuh dengan baik. Dibandingkan pupuk dengan bahan anorganik, pupuk kompos jauh lebih memiliki manfaat. Manfaat tersebut adalah sebagai berikut:\n" +
                "\n" +
                "Memberikan nutrisi pada tanaman\n" +
                "Tanah yang baik mempunyai unsur hara yang dapat mencukupi kebutuhan tanaman, unsur hara dibagi menjadi 3 golongan :\n" +
                "\n" +
                "Unsur hara makro Primer : kebutuhannya dalam jumlah yang banyak seperti N, P, dan K.\n" +
                "Unsur hara makro sekunder : Dibutuhkan dalam jumlah yang kecil seperti Belerang (S), Kalsium (Ca), dan Magnesium (Mg).\n" +
                "Unsur hara Mikro, Seperti Tembaga (Cu), seng (Zn), Klor (Cl), Mangan (Mn) dan Molibdenum (Mo).\n" +
                "Memperbaiki struktur Tanah\n" +
                "Tanah yang baik adalah tanah yang melekat satu sama lain (Debu, Pasir, Liat), kompos merupakan perekat buti2 tanah, dan mampu menjadi penyeimbang tingkat kerekatan tanah, juga menjadi daya tarik bagi mikroorganisme untuk berkatifitas di dalam tanah sehingga tanah menjadi gembur.\n" +
                "\n" +
                "Meningkatkan Kapasitas Tukar Kation (KTK)\n" +
                "KTK merupakan sifat kimia yang berkaitan erat dengan kesuburan tanah. Tanah dengan KTK tinggilebih mampu menyedakan unsur hara daripada tanah dengan KTK yang rendah, salah satu cara untuk meningkatkan KTK adalah memberikan kompos. Kompos meningkatkan aktivitas biologi tanah. Kompos yang berisi mikroorgansime dapat membuat tanah menjadi sejuk, tidak terlalu lemabb, dan tidak terlalu kering.\n" +
                "\n" +
                "Mampu meningkatkan pH tanah pada tanah asam\n" +
                "Tanah yang asam terkadang dikarenakan hujan yang berkpeanjangan sehingga dapat mencuci ion-ion seperti Ca, Mg, K dan P. Pada tanah yang asam P akan terikat A1. Pada tanah yang asam jumlah O2 sedikit sehingga bakteri aerob dalam tanah tidak menguraikan bahan organik dalam tanah.\n" +
                "\n" +
                "Meningkatkan ketersediaan unsur mikro\n" +
                "Tidak hanya unsur makro saja yang disedikan oleh kompos untuk tanaman, tetatpi juga unsur mikro sepeti Zn, Mn, Cu, Fe, dan Mo."))

        val bacaanPojokAdapter = BacaanPojokEdukasiAdapter(bacaanPojokList)
        bacaanPojokRV.adapter = bacaanPojokAdapter

        bacaanPojokAdapter.onItemClick = { clickedBacaan ->
            val intent = Intent(requireContext(), DetailBacaanBerandaActivity::class.java)
            intent.putExtra("bacaanpojok", clickedBacaan)
            startActivity(intent)
        }

        // Recycler View Bacaan Beranda 1
        val bacaanPojokRVDua : RecyclerView = view.findViewById(R.id.rv_pojok_2)
        bacaanPojokRVDua.setHasFixedSize(true)
        bacaanPojokRVDua.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        val bacaanPojokListDua = ArrayList<BacaanBeranda>()

        bacaanPojokListDua.add(
            BacaanBeranda(R.drawable.img_bacaantemukan01, "Usai Viral, Gunungan Sampah di Jogja Luber Puluhan Meter Hilang", "Tes"))
        bacaanPojokListDua.add(BacaanBeranda(R.drawable.img_bacaantemukan02, "Kebakaran TPA Sarimukti Belum Padam, Makin Meluas", "dhfgdfgdfgdjfbdjfbdhbfhdfdhfhdfhdgfhdgfedhfgdhgfdgfdhgfdhgfdjkgfdjkfgdfhdgfdhf"))
        bacaanPojokListDua.add(BacaanBeranda(R.drawable.img_bacaantemukan03, "Viral Asap Bakar Sampah Bikin ISPA, Ini 3 Bahaya Lain Gara-gara Asap", "Raya yang baru berusia 8 tahun harus menjalani perawatan intensif di rumah sakit karena penyakit infeksi saluran pernapasan atas (ISPA) yang dideritanya. Raya yang tinggal di Tangerang Selatan menderita ISPA karena asap pembakaran sampah yang dilakukan warga sekitar rumahnya.\n" +
                "Dokter spesialis paru obstruktif kronis di Rumah Sakit Pondok Indah, Budhi Antariksa mengatakan asap memang berbahaya untuk saluran pernapasan. Apalagi asap yang dihasilkan oleh pembakaran sampah.\n" +
                "\n" +
                "\"Asap ini mengandung zat-zat yang berbahaya. Asap ini juga salah satu penyebab polusi udara,\" kata Budhi saat dihubungi CNNIndonesia.com, Jumat (4/8).\n" +
                "\n" +
                "Zat-zat berbahaya ini tergantung pada jenis sampah yang dibakar. Bisa nikotin hingga belerang dan zat karbon yang berbahaya untuk pernapasan.\n" +
                "\n" +
                "Asap juga tak hanya berbahaya untuk anak, orang dewasa juga bisa terkena imbas berupa permasalahan kesehatan akibat asap pembakaran sampah.\n" +
                "\n" +
                "Beberapa masalah kesehatan akibat asap bakar sampah: \n" +
                "1. Sesak napas dan batuk\n" +
                "Hal paling umum yang bisa muncul saat menghirup asap pembakaran sampah adalah batuk dan sesak napas. Masalah ini bisa muncul seketika saat asap pembakaran sampah ini terhirup.\n" +
                "\n" +
                "2. Asma\n" +
                "Jika Anda memiliki penyakit asma, saat terpapar asap pembakaran sampah bisa semakin parah. Penyakit asma ini bisa kambuh dengan cepat.\n" +
                "\n" +
                "3. Bronkitis hingga kanker paru-paru\n" +
                "Masalah paling mengerikan dan harus diwaspadai adalah risiko terkena bronkitis dan kanker paru-paru. Terutama jika terlalu sering terpapar asap pembakaran sampah.\n" +
                "\n" +
                "\"Asap akan menumpuk dalam saluran napas. Efeknya bisa menyebabkan kanker karena banyak zat berbahaya yang terkandung di dalamnya,\" kata Budhi.\n" +
                "\n" +
                "\"Oleh karena itu sampah harus dikelola dengan benar. Jangan dibakar sembarangan karena bisa mencemarkan udara dan mengganggu kesehatan,\" kata dia.\n" +
                "\n"))

        val bacaanPojokAdapterDua = BacaanPojokEdukasiDuaAdapter(bacaanPojokListDua)
        bacaanPojokRVDua.adapter = bacaanPojokAdapterDua

        bacaanPojokAdapterDua.onItemClick = { clickedBacaanDua ->
            val intent = Intent(requireContext(), DetailBacaanBerandaActivity::class.java)
            intent.putExtra("bacaanpojokdua", clickedBacaanDua)
            startActivity(intent)
        }
    }
}