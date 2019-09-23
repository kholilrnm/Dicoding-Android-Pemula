package com.kholil.submission_dicoding1;

import java.util.ArrayList;

public class DataMakanan {
    private static String[] namaMakanan = {
            "Sate Klopo",
            "Sate Lisidu",
            "Sate Karak",
            "Sego Sambel",
            "Lontong Kupang",
            "Lontong Balap",
            "Rujak Cingur",
            "Tahu Tek",
            "Nasi Goreng Jnck",
            "Mie Akhirat"
    };

    private static String[] detailMakanan = {
            "Sate Klopo ini dalam proses pembuatan sate sebelum dibakar harus dilumuri dengan parutan kelapa agar rasanya menjadi unik. Sate klopo ini bisa anda temui di Jalan Walikota Mustajab Nomor 36. Surabaya sebelah barat Balai Kota Surabaya.",
            "Sate Lisidu ini unik dalam segi tampilannya yaitu pipih & bersih dan ketika dibakar, pengisapannya pun dari atas sampai bawah yang menjadikan dagingnya menjadi bersih tanpa ada arang yang nempel.",
            "Sate Karak ini berbahan dasar sate usus dengan perpaduan nasi hitam dan ditambah pula parutan kelapa agar menjadi gurih. Nah bagi agan yang penasaran dengan rasa dan keunikan sate karak, sebaiknya segera mengunjungi alamat yang telah kami sebutkan.",
            "Sego Sambel ini perpaduan nasi putih dengan sambal dan lauk yang menggugah selera. Dengan menyantapnya, rasa lapar anda di malam hari akan hilang langsung dan menjadi kenyang.",
            "Lontong Kupang ini berbahan kerang dan lontong serta bumbu cita rasa yang unik. Lontong ini juga berbahan utama kupang putih yang mirip dengan kerang kemudian dimasak dan direbus dengan tambahan lontong petis dan perasan jeruk nipis.",
            "Lontong Balap ini perpaduan bahan kecambah yang bergizi, tahu, lontong dll. Jika agan sedang berada di Surabaya, jangan sampai agan tidak mampir ke tempat ini karena dijamin agan tidak akan menyesal kalau sudah merasakan rasa sedap lontong balap legendaris.",
            "Rujak Cingur ini yang berupa rujak dicampur dengan cingur atau hidung sapi. Walaupun harganya murah, tapi rasanya jangan diremehkan.",
            "Tahu Tek ini berbahan tahu goreng, lontong, dan kentang serta bumbu petis yang pedas tentunya sebagai pelengkap diatasnya di taburkan kerupuk agar sajiannya semakin nikmat. Walaupun tampilannya sederhana dan harganya murah",
            "Nasi Goreng Jnck ini makanan khas surabaya yang kurang enak didengar bagi kalangan masyarakat umum karena rasanya sangat pedas sampai orang yang memakan nasi goreng ini ingin teriak mengatakan janc**.",
            "Mie Akhirat ini terdiri dari 2 warna mie yaitu putih dan hitam yang berarti surga dan neraka. Makanan yang terletak di dekat bandara ini dari segi penamaan terinspirasi dari urusan dunia setelah kematian, yaitu akhirat.",
    };

    private static String[] hargaMakanan = {
            "Rp. 17.000 - 20.000/Porsi",
            "Rp. 25.000 - 35.000/Porsi",
            "Rp. 12.000 - 20.000/Porsi",
            "Rp. 11.000 - 20.000/Porsi",
            "Rp. 12.000 - 21.000/Porsi",
            "Rp. 12.000 - 21.000/Porsi",
            "Rp. 25.000 - 40.000/Porsi",
            "Rp. 12.000 - 15.000/Porsi",
            "Rp. 16.000 - 20.000/Porsi",
            "Rp. 15.000 - 20.000/Porsi",
    };

    private static int[] gambarMakanan = {
            R.drawable.sate_klopo,
            R.drawable.sate_lisidu,
            R.drawable.sate_karak,
            R.drawable.sego_sambel,
            R.drawable.lontong_kupang,
            R.drawable.lontong_balap,
            R.drawable.rujak_cingur,
            R.drawable.tahu_tek,
            R.drawable.nasi_goreng_jnck,
            R.drawable.mie_akherat
    };

    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < namaMakanan.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setNama_makanan(namaMakanan[position]);
            makanan.setDetail_makanan(detailMakanan[position]);
            makanan.setPhoto(gambarMakanan[position]);
            makanan.setHarga(hargaMakanan[position]);
            list.add(makanan);
        }
        return list;
    }
}