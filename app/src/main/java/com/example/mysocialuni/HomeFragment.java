package com.example.mysocialuni;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private Button profilButton;
    private Button akademikTakvimButton;
    private Button yemekhaneButton;
    private Button btnKulüpler;
    private FrameLayout btnResimli2;
    private FrameLayout btnResimli1;
    private RecyclerView recyclerView;
    private Typeface tf1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        profilButton = view.findViewById(R.id.profil_button);
        akademikTakvimButton = view.findViewById(R.id.btnAkademikTakvim);
        yemekhaneButton = view.findViewById(R.id.btnYemekhane);
        btnResimli1 = view.findViewById(R.id.btnResimli1);
        btnKulüpler = view.findViewById(R.id.btnKulupler);
        btnResimli2 = view.findViewById(R.id.btnResimli2);

        tf1 = Typeface.createFromAsset(requireContext().getAssets(), "fonts/yazı_tipi1.ttf");
        TextView homeText = view.findViewById(R.id.home_text);
        homeText.setTypeface(tf1);

        btnKulüpler.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ASKulüplerActivity.class);
            startActivity(intent);
        });

        btnResimli2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ASTanıtımActivity.class);
            startActivity(intent);
        });

        profilButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ProfileMenuActivity.class);
            startActivity(intent);
        });

        akademikTakvimButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ASAkademikTakvimActivity.class);
            startActivity(intent);
        });

        yemekhaneButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ASYemekhaneActivity.class);
            startActivity(intent);
        });

        btnResimli1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ASHaberlerActivity.class);
            startActivity(intent);
        });

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        List<ASDuyurularModel> duyurular = new ArrayList<>();
        duyurular.add(new ASDuyurularModel("26", "Mayıs", "Kariyer Yolculuğun Burada Başlıyor", "",R.drawable.as_duyurular_png1));
        duyurular.add(new ASDuyurularModel("11", "Mayıs", "Rektörümüz Prof. Dr. Buğra ÖZEN'in Anneler Günü Mesajı",
                "Toplumun temel yapı taşını oluşturan; fedakârlığın, sevginin, merhametin ve şefkatin sembolü olan annelerimiz, bizlere yalnızca yaşamı armağan etmekle kalmamış, aynı zamanda değerlerimizi, insan olmanın derin anlamını ve koşulsuz sevgiyi de öğretmişlerdir.\n\n" +
                        "Gelecek nesillerin şekillenmesinde en büyük paya sahip olan anneler, bireylerin karakter ve kişilik gelişiminde belirleyici bir rol üstlenmektedir. Onların emeği, toplumsal yapının güçlenmesinde vazgeçilmez bir unsurdur.\n\n" +
                        "Bu özel günde, başta aziz şehitlerimizin emanetleri olan kıymetli annelerimiz olmak üzere, tüm annelerimizin Anneler Günü’nü en içten duygularımla kutluyor; sağlık, huzur ve mutluluk diliyorum.\n\n" +
                        "Hayatımızda derin izler bırakan, bugün aramızda olmayan tüm annelerimizi rahmet ve minnetle anıyor; üniversitemizde görev yapan annelerimiz ile yüreğinde annelik sevgisini taşıyan tüm kadınların Anneler Günü’nü içtenlikle kutluyorum.\n\n" +
                        "Prof. Dr. Buğra ÖZEN\nİstanbul Sağlık ve Teknoloji Üniversitesi Rektörü",-1));

        duyurular.add(new ASDuyurularModel("23", "Nisan", "Rektörümüz Prof. Dr. Buğra ÖZEN'in 23 Nisan Ulusal Egemenlik ve Çocuk Bayramı Mesajı", "",R.drawable.as_duyurular_png2));
        duyurular.add(new ASDuyurularModel("18", "Nisan", "Mühendislik ve Doğa Bilimleri Fakültesi Mekatronik Mühendisliği Bölümü Araştırma Görevlisi İlanı Nihai Değerlendirme Sonuçları Açıklandı",
                "Mühendislik ve Doğa Bilimleri Fakültesi Mekatronik Mühendisliği Bölümünde açık bulunan araştırma görevlisi kadrosuna başvuran ve “Öğretim Üyesi Dışındaki Öğretim Elemanı Kadrolarına Yapılacak Atamalarda Uygulanacak Merkezi Sınav ile Giriş Sınavlarına İlişkin Usul ve Esaslar Hakkında Yönetmelik”e göre sınava girme hakkı kazanan adayların, 10.04.2025 tarihinde yapılan giriş sınavı değerlendirme sonucu aynı yönetmeliğin 12. maddesine göre aşağıda verilmiştir.\n\nMekatronik Mühendisliği Araştırma Görevlisi Nihai Değerlendirme Sonuçları için Tıklayınız.",-1));

        duyurular.add(new ASDuyurularModel("17", "Nisan", "Eczacılık Fakültesi Araştırma Görevlisi İlanı Nihai Değerlendirme Sonuçları Açıklandı",
                "Eczacılık Fakültesi'nde açık bulunan araştırma görevlisi kadrosuna başvuran ve “Öğretim Üyesi Dışındaki Öğretim Elemanı Kadrolarına Yapılacak Atamalarda Uygulanacak Merkezi Sınav ile Giriş Sınavlarına İlişkin Usul ve Esaslar Hakkında Yönetmelik”e göre sınava girme hakkı kazanan adayların, 08.04.2025 tarihinde yapılan giriş sınavı değerlendirme sonucu aynı yönetmeliğin 12. maddesine göre aşağıda verilmiştir.\n\n" +
                        "Analitik Kimya Anabilim Dalı\nBiyokimya Anabilim Dalı\nFarmakognozi Anabilim Dalı\nFarmakoloji Anabilim Dalı\nFarmasötik Kimya Anabilim Dalı\nFarmasötik Mikrobiyoloji Anabilim Dalı\nFarmasötik Teknoloji Anabilim Dalı\n\nAraştırma Görevlisi Nihai Değerlendirme Sonuçları için Tıklayınız.",-1));

        duyurular.add(new ASDuyurularModel("16", "Nisan", "Mühendislik ve Doğa Bilimleri Fakültesi Endüstri Mühendisliği Bölümü Araştırma Görevlisi İlanı Nihai Değerlendirme Sonuçları Açıklandı",
                "Mühendislik ve Doğa Bilimleri Fakültesi Endüstri Mühendisliği Bölümünde açık bulunan araştırma görevlisi kadrosuna başvuran ve “Öğretim Üyesi Dışındaki Öğretim Elemanı Kadrolarına Yapılacak Atamalarda Uygulanacak Merkezi Sınav ile Giriş Sınavlarına İlişkin Usul ve Esaslar Hakkında Yönetmelik”e göre sınava girme hakkı kazanan adayların, 10.04.2025 tarihinde yapılan giriş sınavı değerlendirme sonucu aynı yönetmeliğin 12. maddesine göre aşağıda verilmiştir.\n\nEndüstri Mühendisliği Bölümü Araştırma Görevlisi Nihai Değerlendirme Sonuçları için Tıklayınız.",-1));
        ASDuyurularAdapter adapter = new ASDuyurularAdapter(duyurular, requireContext());

        recyclerView.setAdapter(adapter);

        return view;
    }
}
