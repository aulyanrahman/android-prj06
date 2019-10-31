package id.ac.poliban.dts.aulyanrahman.recyclertugas;

import java.util.ArrayList;
import java.util.List;

public class BolaData {
    private static String[] bolaNames = {
            "Arema FC", "Badak Lampung FC", "Bali United FC", "PS Barito Putera", "Bhayangkara FC", "Borneo FC",
            "Kalteng Putra FC", "Madura United", "Semen Padang FC", "Persebaya Surabaya", "Persela Lamongan", "Persib Bandung",
            "Persija Jakarta", "Persipura Jayapura", "PSM Makassar", "PSS Sleman", "PSIS Semarang", "PS Tira-Persikabo"
    };

    private static String[] bolaDetails = {
            "Arema FC, atau biasa disebut dan dikenal sebagai Arema Cronus, adalah sebuah klub sepak bola profesional yang berasal dari Malang, Jawa Timur, Indonesia. Arema didirikan pada tanggal 11 Agustus 1987, Arema mempunyai julukan Singo Edan.",
            "Badak Lampung FC adalah sebuah klub sepak bola Indonesia yang berkompetisi di Liga 1 dan bermarkas di Kota Bandar Lampung, Provinsi Lampung. Tim ini merupakan hasil akuisisi dari klub asal Papua, yaitu Perseru Serui yang mengalami krisis finansial.",
            "Bali United F.C. merupakan sebuah klub sepak bola Indonesia, yang bermarkas Stadion Kapten I Wayan Dipta, Kabupaten Gianyar, Provinsi Bali, Indonesia. Klub ini dulunya bernama Persatuan Sepak Bola Indonesia Samarinda yang merupakan eks tim Perserikatan dan Putra Samarinda dari Galatama.",
            "PS Barito Putera adalah klub sepak bola Indonesia berbasis di Kota Banjarmasin, Kalimantan Selatan. yang bermain di Liga 1 sejak musim 2013. Pada Divisi Utama Liga Indonesia musim 2011/2012 berhasil menjadi juara setelah mengalahkan Persita Tanggerang 2-1 di Stadion Manahan Solo.",
            "Bhayangkara FC adalah sebuah tim sepak bola Indonesia yang dimiliki oleh Polri yang berbasis di DKI Jakarta. Klub ini bermain di Liga 1. Klub ini merupakan hasil akuisisi dari klub Persikubar Kutai Barat yang saat itu masih berjuang di Divisi Utama.",
            "Borneo F.C. adalah klub sepak bola Indonesia yang berasal dari Samarinda, Kalimantan Timur. Klub ini bermain di Divisi Utama Liga Indonesia 2014 setelah mengakuisisi klub Perseba Super Bangkalan pada tanggal 7 Maret 2014, menggantikan Persisam Samarinda sebagai Klub asal samarinda, Kalimantan Timur.",
            "Kalteng Putra FC adalah klub sepak bola yang berasal dari Kota Palangka Raya, Kalimantan Tengah. Sekarang Kalteng Putra FC bermain di kompetisi Liga 1 setelah berhasil promosi dari Liga 2 musim sebelumnya. Kalteng Putra FC memiliki julukan Laskar Isen Mulang.",
            "Madura United FC merupakan klub sepak bola asal Indonesia yang berbasis di Pamekasan, Madura dengan menggunakan Stadion Gelora Ratu Pamelingan. Klub ini sebelumnya bernama Pelita Bandung Raya yang pada waktu itu berlaga di Liga Super Indonesia.",
            "Semen Padang Football Club adalah sebuah klub sepak bola Indonesia yang berasal dari Padang, Sumatra Barat. Klub ini merupakan anak perusahaan dari PT Semen Padang dan memainkan pertandingan kandangnya di GOR Haji Agus Salim di Padang.",
            "Persebaya Surabaya yang sempat merubah namanya menjadi Persebaya 1927 adalah sebuah klub Sepak bola profesional di Indonesia yang berbasis di Surabaya yang berdiri pada 18 Juni 1927 dengan nama Soerabajasche Indische Voetbal Bond dan sudah malang melintang dikancah sepak bola Indonesia.",
            "Persatuan Sepak Bola Lamongan dan mempunyai julukan Laskar Joko Tingkir adalah sebuah klub sepak bola Indonesia yang bermarkas di Lamongan, Jawa Timur. Persela dikelola oleh PT. Persela Jaya. Persela bermarkas di Stadion Surajaya dengan didukung supporter mereka, yaitu La Mania.",
            "Persib Bandung adalah klub sepak bola Indonesia yang berdiri pada 14 Maret 1933, berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Liga 1 2019 Indonesia. Julukan mereka adalah Maung Bandung dan Pangeran Biru. Sponsor utama dan terbesar masih di pegang Indofood dengan apparel jersey Sportama.",
            "Persija adalah sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga 1. Persija merupakan klub sepakbola paling sukses di sejarah sepakbola Indonesia dengan torehan 11 kali juara liga domestik hingga sejauh ini.",
            "Persatuan Sepak bola Indonesia Jayapura adalah sebuah klub sepak bola Indonesia yang bermarkas di Jayapura, Papua. Prestasi tertingginya hingga kini adalah menjadi empat kali juara Liga Indonesia dari tahun 2005 hingga 2013. Selain itu, Persipura juga pernah mencapai semi-final pada kompetisi AFC Cup.",
            "Persatuan Sepak bola Makassar adalah sebuah tim sepak bola Indonesia yang berbasis di Makassar, Sulawesi Selatan, Indonesia, yang dikenal pasukan Ramang atau Juku Eja. PSM Makassar saat ini bermain di Shopee Liga 1, setelah sebelumnya pernah bermain di Liga Primer Indonesia.",
            "Persatuan Sepak bola Sleman merupakan sebuah klub sepak bola yang berbasis di Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia. Klub yang didirikan pada 20 Mei 1976 ini merupakan salah satu klub sepak bola yang disegani di Indonesia dan memiliki julukan sebagai tim Elang Jawa atau Elja.",
            "Persatuan Sepak Bola Indonesia Semarang atau PSIS Semarang adalah klub sepak bola yang bermarkas di kota Semarang, Indonesia dengan tempat berlatih dan bertanding di Stadion Jatidiri Semarang. Julukan klub ini adalah Laskar Mahesa Jenar.",
            "TIRA PERSIKABO adalah klub sepak bola profesional yang berbasis di Kabupaten Bogor, Provinsi Jawa Barat, Indonesia yang berkompetisi di Liga 1. Didirikan pada tahun 2015 selama Piala Jenderal Sudirman 2015. Klub ini merupakan hasil akuisisi dari klub Persiram Raja Ampat."
    };

    private static int[] bolaImages = {
            R.drawable.arema,
            R.drawable.badaklampung,
            R.drawable.baliutd,
            R.drawable.barito,
            R.drawable.bhayangkara,
            R.drawable.borneo,
            R.drawable.kalteng,
            R.drawable.madura,
            R.drawable.padang,
            R.drawable.persebaya,
            R.drawable.persela,
            R.drawable.persib,
            R.drawable.persija,
            R.drawable.persipura,
            R.drawable.psmmakasar,
            R.drawable.pssleman,
            R.drawable.semarang,
            R.drawable.tirakabo
    };

    static List<Bola> getListData() {
        List<Bola> list = new ArrayList<>();
        for (int index = 0; index < bolaNames.length; index++) {
            list.add(new Bola(bolaNames[index], bolaDetails[index], bolaImages[index]));
        }
        return list;
    }
}