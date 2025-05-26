package com.example.mysocialuni;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ASHaberlerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.as_haberler_button);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ASHaberlerModel> haberList = new ArrayList<>();
        // Örnek veriler (RESİMLER ZORUNLU)
        haberList.add(new ASHaberlerModel(
                "17",
                "Mayıs",
                "NEXTMED Öğrenci Sempozyumu'nda \"Tıbbın Geleceği\" Konuşuldu",
                "İstanbul Sağlık ve Teknoloji Üniversitesi Tıp Fakültesi ve ile Öğrenci Bilimsel Araştırma Kulübü tarafından düzenlenen “NEXTMED Öğrenci Sempozyumu” 17 Mayıs 2025 Cumartesi günü Sütlüce Yerleşkesi Oditoryumu’nda gerçekleşti. “Tıbbın Geleceği” temasıyla düzenlenen sempozyum, alanında uzman isimleri ve geleceğin hekim adaylarını bir araya getirerek tıbbın bilimsel, teknolojik ve etik boyutlarını ele aldı.\n\n" +
                        "Açılış konuşmasını gerçekleştiren Rektör Yardımcısı ve Tıp Fakültesi Dekanı Prof. Dr. Zeynep Çiğdem Kayacan bu yıl ikinci gerçekleşen etkinliğin önemine dikkat çekerken katılımcı tüm konuşmacılara, katılımcılara teşekkür etti.\n\n" +
                        "İlk oturum konuşmacısı online olarak sempozyuma katılan Dr. Muzaffer Kaşer oldu. “Tıpta Akademik Kariyer Gelişimi” başlıklı sunumuyla genç hekim adaylarına yol haritası sundu. Deneyimlerini ve dünyadaki tıp eğitimi hakkında bilgi veren Dr. Muzaffer Kaşer, katılımcıların sorularını da cevapladı.\n\n" +
                        "Dr. Öğr. Üyesi Gözde Korkmaz’ın oturumunda “Genom Terziliği” başlığı altında kişiselleştirilmiş tıbbın olanakları paylaşıldı ve gen tedavisine yönelik bilimsel araştırmalara değinildi.\n\n" +
                        "Sonrasında ise Prof. Dr. Onur Egemen, mikroskop altında yürütülen ileri düzey cerrahi tekniklerini aktardı. Cerrahi işlemlere yönelik video serilerini de aktaran Prof. Dr. Onur Egemen işlemlere dair merak edilen noktaları da katılımcılarla paylaştı.\n\n" +
                        "Yapay zekânın tıbba etkisi\n\n" +
                        "Prof. Dr. N. Serap Şengör, “Yapay Sinir Ağları ve Derin Öğrenme” sunumunda yapay zekânın tıbba etkisini değerlendirirken tıp alanındaki yapay zekâ uygulamalarını vurguladı. Prof. Dr. Coşkun Yorulmaz, “Tıbbi Dedektifler” başlığı ile adli tıp ve olay yeri incelemenin detaylarını aktaran sunumuyla kritik bilgiler paylaştı. Dosyalar üzerindeki detayları paylaşan Prof. Dr. Coşkun Yorulmaz, öğrencilere derslerinde dikkat etmeleri gereken konu başlıklarını vererek adli tıp alanında ilerlemek isteyen hekim adaylarına önerilerde bulundu.\n\n" +
                        "Oktar Güloğlu ise dikkat çeken “Aşkın Nörobiyolojisi” başlıklı konuşmasında duyguların sinir bilimsel boyutunu ele aldı.\n\n" +
                        "Sempozyum geleceğin hekimlerine ilham kaynağı oldu\n\n" +
                        "Bildiri sunumları oturumu ile öğrencilerin bilimsel üretimlerini paylaşmalarına da olanak tanındı. Sunumlar ardından düzenlenen ödüllü yarışma ile katılımcılara hediyeleri verildi.\n\n" +
                        "Kapanışın ardından atölye katılımcıları Dr. Öğr. Üyesi Nevin Küçükçallı eşliğinde “Adli Tıp Atölyesi”ni, Dr. Öğr. Üyesi İdilhan Baloğlu Ar ile “Pulmoner Oskültasyon Atölyesi”ni, Dr. Öğr. Üyesi Metin Şenol gözetiminde “Sütür Atölyesi”ni, Dr. Öğr. Üyesi Gkionoul Nteli Chatzioglou ile “3D Anatomi Modelleme Atölyesi”ni, Prof. Dr. Gültekin Karakuş ile “Vaka Atölyesi: Kardiyoloji Atölyesi”ni ve Baristalık 101 Atölyesini tamamladı.\n\n" +
                        "Sempozyum kapsamında Oditoryum Fuaye Alanında ise gün boyu devam eden “Da Vinci Robotik Cerrahi Atölyesi” ile de katılımcılar cerrahi cihazı deneyimleme şansını yakaladı.\n\n" +
                        "NEXTMED Öğrenci Sempozyumu, öğrenciler ve akademisyenler arasında bilimsel bir köprü kurarak multidisipliner bir etkileşim ortamı sundu. Tıbbın geleceğini şekillendirmeyi hedefleyen bu sempozyum, katılımcılara ilham verirken, aynı zamanda kariyer yollarını da aydınlatmış oldu.",
                R.drawable.as_haberler_png1
        ));
        haberList.add(new ASHaberlerModel(
                "16",
                "Mayıs",
                "DermoVision Kongresi’nde Eczacılık ve Kozmetik Sektörü Buluştu",
                "İstanbul Sağlık ve Teknoloji Üniversitesi Eczacılık Kulübü tarafından düzenlenen DermoVision Kongresi, 16 Mayıs 2025 Cuma günü Sütlüce Kampüsü Oditoryumunda gerçekleştirildi. Kongre; eczacılık ve dermokozmetik alanının uzman isimleri bir araya getirdi. Açılış konuşmalarıyla başlayan DermoVision Kongresi, gün boyunca yoğun ilgiyle takip edildi ve fitokozmetik ürünlerden güneş koruyucularına, etiket bilincinden saç ve cilt sağlığına kadar pek çok güncel alan uzman eczacılar tarafından ele alındı.\n\n" +
                        "İlk oturumda Dr. Ecz. Ebru Özdemir Nath, “Fitokozmetik Ürünlerin Gelişimi” başlığı altında bitkisel temelli kozmetik ürünlerin tarihsel gelişimini ve bilimsel arka planını katılımcılarla paylaştı. Ardından Ecz. Semina Berfin Memiş, “Etkili Güneş Kremleri: Bilimin Işığında Koruma” sunumuyla yaz aylarına girerken güneş korumasının önemine dikkat çekti.\n\n" +
                        "“Vizyon Koltuğu” söyleşisi gerçekleşti\n\n" +
                        "Sabah oturumlarının ardından gerçekleşen “Vizyon Koltuğu” panelinde, Ecz. Hatice Sarıyer moderatörlüğünde Dermoskin CEO’su ile sektörün bugünü ve geleceği üzerine etkileyici bir söyleşi gerçekleştirildi. Öğrenciler merak ettiği konuları Ecz. Hatice Sarıyer’e sorma fırsatı yakaladı.\n" +
                        "“Kozmetik Etiketleri: Bilinçli Tercihin Anahtarı” başlıklı sunumuyla Ecz. Müge İpek Kaysı, tüketicilerin ürün etiketlerini nasıl doğru okuyabileceği konusunda farkındalık yaratarak, dikkat etmesi gereken kısımları da paylaştı.\n\n" +
                        "Ardından Ecz. Deniz Mortazazadeh, “Doğadan İlhamla: Kozmetikte Benim Yolum” sunumunda doğayla uyumlu formülasyonları ve kişisel kozmetik yolculuğunu anlattı. Programın ilerleyen oturumlarında ise Ecz. Ruken Bozdağ Yılmaz, “Sağlıklı Saç Derisi: Güçlü Saçların Temeli” başlıklı sunumunda saç derisinin korunmasının saç sağlığı üzerindeki etkilerine değindi.\n\n" +
                        "Kapanış öncesi gerçekleşen son sunumda ise Dr. Ecz. Tuğba Buse Şentürk, “Cilt Tipine Göre Ürün Seçimi: Doğru Bakımın Şifresi” başlığıyla katılımcılara cilt analizine dayalı bakım önerileri sundu.\n\n" +
                        "Dermovision Kongresi, kapanış konuşmalarıyla tamamlanırken, bilgi dolu ve ilham verici içeriğiyle katılımcıların beğenisi kazandı. Eczacılık ve kozmetik dünyasının geleceğini yansıtan etkinlik birbirinden farklı konu başlıklarını ele aldı.",
                R.drawable.as_haberler_png2
        ));
        haberList.add(new ASHaberlerModel(
                "14",
                "Mayıs",
                "Beyaz Önlük Töreniyle Geleceğin Eczacıları Mesleğe Adım Attı",
                "İstanbul Sağlık ve Teknoloji Üniversitesi (İSTÜN), 2024-2025 Akademik Yılı Eczacılık Fakültesi Türkçe ve İngilizce 1. sınıf öğrencileri için Beyaz Önlük Giyme Töreni 14 Mayıs Dünya Eczacılar Günü’nde gerçekleşti. Protokol katılımı, öğrencilerimizin ve ailelerinin yoğun ilgisi ile düzenlenen tören Sütlüce Kampüsü Oditoryumunda gerçekleşti. Törenin sunuculuğunu ise Tıp Fakültesi öğretim üyelerimizden Dr. Öğr. Üyesi Ömer Önder Önder üstlendi.\n\n" +
                        "Beyaz Önlük Giyme Töreni’ne; Rektörümüz Prof. Dr. Buğra Özen, Rektör Yardımcısı Prof. Dr. Necati Örmeci, Rektör Yardımcısı, Tıp Fakültesi Dekanı Prof. Dr. Zeynep Çiğdem Kayacan, Eczacılık Fakültesi Dekanı Prof. Dr. Ahmet Oğul Araman, Sağlık Bilimleri Fakültesi Dekanı Prof. Dr. Nilgün Sema Genç, Mühendislik ve Doğa Bilimleri Fakültesi Dekanı Prof. Dr. Şükrü Alp Baray, Eczacılık Fakültesi öğretim üyeleri ile öğrencilerimiz ve aileleri katıldı.\n\n" +
                        "Saygı Duruşu ve İstiklal Marşı'nın okunmasının ardından, tören Eczacılık Fakültesi Dekanı Prof. Dr. Ahmet Oğul Araman’ın açılış konuşmasıyla başladı. Prof. Dr. Araman, öğrencilere hitap ederken beyaz önlüğün tarihinden bahsederken şunları söyledi; “Hepinizin büyük hayaller kurmasını temenni ediyor, beyaz önlüklerinizi giydikten sonra kirletmemenizi de bekliyoruz. Giyeceğiniz bu önlükler bilgiyi ve size duyulan güveni simgelediğini hiçbir zaman unutmayın. Akademisyenlerimizin rehberliğinde devam edecek yolculuğunuzda her zaman yanınızda olduğumuzu hatırlatmak istiyorum. Hepinize başarılar diliyor, sizlere destek veren ailelerinize de teşekkür ediyorum.”\n\n" +
                        "Rektör Yardımcısı Prof. Dr. Necati Örmeci öğrencileri tebrik etti ve şöyle devam etti; “Bugün burada, geleceğin eczacılarıyla bir arada olmaktan büyük mutluluk duyuyorum. Beyaz önlük, sadece bir giysi değil; aynı zamanda sorumluluğun, bilimin ve insanlığa hizmetin sembolü. Öğrencilerimizin bu gurur verici yolculukta ilk adımlarını attığı bu gün sizlerin yanında olmak oldukça anlamlı. Tüm öğrencilerimizi kutluyorum.” dedi.\n\n" +
                        "Eczacılık Fakültesi Beyaz Önlük Giyme Töreni kapsamında konuşan Rektörümüz Prof. Dr. Buğra Özen öğrencileri kutlarken şunları söyledi; “Öncelikle tüm öğrencilerimizi kutluyorum. Bu tören meslek hayatınızda iz bırakacak anlamlı günlerden biri. Mesleğin getirdiği sorumluluğu her zaman üzerinizde taşıyacağınızı biliyoruz. Salonda bulunan her öğrencimizin yanında olan büyük bir fedakârlıkla onları destekleyen kıymetli aileleri var. Öğrencilerimizin bu aşamaya getiren ailelerimize de ayrıca teşekkür ediyoruz. Başarılarınızın artarak devam etmesini diliyor ve hepinizi kutluyorum.”\n\n" +
                        "Eczacılık Fakültesine Yükseköğretim Kurumları Sınavı (YKS) sonuçlarına göre birincilikle yerleşen öğrencilere beyaz önlüklerini Rektörümüz Prof. Dr. Buğra Özen giydirdi ve hediyeleri verdi.\n\n" +
                        "Törende; Rektör Yardımcısı Prof. Dr. Necati Örmeci, Rektör Yardımcısı, Tıp Fakültesi Dekanı Prof. Dr. Zeynep Çiğdem Kayacan, Eczacılık Fakültesi Dekanı Prof. Dr. Ahmet Oğul Araman, Sağlık Bilimleri Fakültesi Dekanı Prof. Dr. Nilgün Sema Genç, Mühendislik ve Doğa Bilimleri Fakültesi Dekanı Prof. Dr. Şükrü Alp Baray ile öğretim üyelerinin öğrencilerimize beyaz önlüklerini giydirmesi ve toplu fotoğraf çekimi ile sona erdi.",
                R.drawable.as_haberler_png3
        ));
        haberList.add(new ASHaberlerModel(
                "13",
                "Mayıs",
                "Sağlık Bilimleri Fakültesi’nde Hemşirelik Öğrencilerinin Beyaz Önlük Coşkusu",
                "İstanbul Sağlık ve Teknoloji Üniversitesi (İSTÜN), 2024-2025 Akademik Yılı Sağlık Bilimleri Fakültesi Hemşirelik Bölümü Beyaz Önlük Giyme Töreni 13 Mayıs Salı günü gerçekleşti. Öğrencilerimizin ve ailelerinin yoğun katılımı ile düzenlenen tören Sütlüce Kampüsü Oditoryumunda yapıldı. Törenin sunuculuğunu ise Tıp Fakültesi öğretim üyelerimizden Dr. Öğr. Üyesi Ömer Önder Önder üstlendi.\n\n" +
                        "Beyaz Önlük Giyme Töreni’ne; Rektörümüz Prof. Dr. Buğra Özen, Sağlık Bilimleri Fakültesi Dekanı Prof. Dr. Nilgün Sema Genç, Tıp Fakültesi Dekan Yardımcısı Prof. Dr. Yaşar Meryem Ünlüçerçi, Sağlık Bilimleri Fakültesi öğretim üyeleri ile öğrencilerimiz ve aileleri katıldı.\n\n" +
                        "Saygı Duruşu ve İstiklal Marşı'nın okunmasının ardından, tören Sağlık Bilimleri Fakültesi Dekanı Prof. Dr. Nilgün Sema Genç’in açılış konuşmasıyla başladı. Hemşireler Haftası kapsamında konuşmasında tarihi anekdotlara da değinen Prof. Dr. Nilgün Sema Genç öğrencilere önemli bir mesleğe adım attıklarını ifade ederken şöyle dedi; “Beyaz önlükleriniz ile meslek ilkelerine ve etik değerlere bağlı olmanızı temenni ediyorum. Sadece beyaz bir önlük giymiyor bir mesleği ve sorumluluğu da yükleniyorsunuz.”\n\n" +
                        "Florence Nightingale ile başlayan ve modern hemşirelik temellerine değinen Prof. Dr. Genç; sağlık hizmetlerinde hijyenin hayati önemini vurguladı. Türkiye’nin ilk profesyonel hemşiresi Safiye Hüseyin Elbi’nin sağlık hizmetlerindeki öncü rolünü hatırlattı. Hemşireler Haftasını kutlayan Prof. Dr. Genç, tüm öğrencileri tebrik etti.\n\n" +
                        "Rektörümüz Prof. Dr. Buğra Özen Hemşirelik Bölümü öğrencilerinin heyecanına ortak olduklarını söylerken şöyle konuştu; “Öğrencilerimiz için mutlu ve gururlu olduğumuz günlerden birini yaşıyoruz. Hepinizin hayatında ve anlamlı bir ana tanıklık ediyoruz. Bu törenin, Hemşireler Haftasında düzenlenmesi sebebi ile de mesleki yolculuğunuzu simgeleyen oldukça anlamlı anlardan biri olacağına inanıyorum. Florence Nightingale ile süregelen modern hemşirelik sürecinde canla başla çalışan sağlık çalışanlarına sizlerde ekleneceksiniz. Florence Nightingale’in ışığıyla ve Safiye Hüseyin Elbi’nin cesareti ile mesleğinizi icra edeceğinizi biliyorum. Şefkat ve özveri ile hastalara yaklaşacağınızda şüphemiz yok. Önlüklerinizi giyerken, bu kutsal meslekte kat edilen süreci de unutmamanızı diliyorum.” dedi.\n\n" +
                        "Prof. Dr. Özen öğrencilerin ailelerine de seslenerek; “Her bir öğrencimizin değerli aileleri var. Emek ve özverili ile çocuklarınıza katkı sunduğunuzu biliyoruz. Yaşadığınız gururu paylaşıyor, hepinize en içten teşekkürlerimizi iletiyorum.”\n\n" +
                        "Prof. Dr. Özen, törenin gerçekleşmesinde emeği geçen tüm akademik ve idari kadroya da teşekkürlerini ileterek konuşmasını tamamladı.\n\n" +
                        "Törende, Yükseköğretim Kurumları Sınavı (YKS) sonuçlarına göre bölüme birincilikle yerleşen öğrencilerin beyaz önlüklerini Rektörümüz Prof. Dr. Buğra Özen giydirdi ve hediyeleri verdi.\n\n" +
                        "Tören, Sağlık Bilimleri Fakültesi Dekanı Prof. Dr. Nilgün Sema Genç ile öğretim üyelerinin öğrencilerimize beyaz önlüklerini giydirmesi ve toplu fotoğraf çekimi ile sona erdi.",
                R.drawable.as_haberler_png4
        ));
        haberList.add(new ASHaberlerModel(
                "10",
                "Mayıs",
                "Geleceğin Teknolojileri ve Girişimcilik Vizyonu ISTECH '25 Teknoloji Zirvesinde Buluştu",
                "ISTECH '25 Teknoloji Zirvesi, İstanbul Sağlık ve Teknoloji Üniversitesi IEEE İSTÜN tarafından 10 Mayıs 2025 Cumartesi günü gerçekleşti. ISTECH’25 Teknoloji ve Girişimcilik Zirvesi, teknoloji ve inovasyon meraklılarını bir araya getirdi. Katılımcılar, blokzincirden yapay zekâya, siber güvenlikten etik teknoloji yaklaşımlarına kadar pek çok alanda ilham verici konuşmalar ve atölye çalışmalarıyla dolu bir gün geçirdi.\n\n" +
                        "Etkinlik Bilgisayar Mühendisliği Bölüm Başkanı Dr. Öğr. Üyesi Nazlı Tokatlı'nın açılış konuşmaları ile başladı ardından konuşmacıların oturumları ile devam etti.\n\n" +
                        "Demir Murat Aksoy, \"Teknoloji ile Değişen Dünya: Sosyal Fayda İçin Blokzincir Çözümleri\" başlıklı konuşmasında, blokzincir teknolojisinin yalnızca finans sektörüyle sınırlı kalmadığını, sosyal fayda sağlayan projeler için de güçlü bir araç olduğunu vurguladı.\n\n" +
                        "Kısa bir aranın ardından Eren Gözaydın, \"Siber Hayatta CEO Olmak: Siber Güvenlikte Girişimciliğin Sırları\" başlıklı sunumuyla, siber güvenlik alanındaki girişimcilik fırsatlarını ve bu alanda başarılı olmanın yollarını katılımcılarla paylaştı.\n\n" +
                        "Öğle öncesi bölüm, IdeaLab ISTECH’25 Proje Fikri Geliştirme Atölyesi ile devam etti. Katılımcılar, yenilikçi fikirlerini geliştirip uzmanlardan geri bildirim alma fırsatı buldu.\n\n" +
                        "“Zekâya Vicdan Katmak: Yapay Zekâda Etik Yaklaşımlar” başlıklı konuşmasında Şule Güner, yapay zekânın etik boyutunu masaya yatırdı.\n\n" +
                        "Günün dikkat çeken deneyimlerinden biri olan VR Station: Not Just a Game, A Perspective etkinliği ise katılımcılara sanal gerçekliğin sınırlarını ve toplumsal etkilerini farklı bir bakış açısıyla sundu.\n\n" +
                        "Etkinliğin son oturumlarından biri olan Anıl Baş’ın \"Ofansif Güvenlik: Hacker Gibi Düşünmek!\" sunumunda ise katılımcılar, siber güvenlikte saldırgan düşünme yöntemleriyle tanıştı.\n\n" +
                        "Günün son bölümünde bir kez daha düzenlenen Proje Fikri Geliştirme Atölyesi, katılımcıların öğrendiklerini pratiğe dökmesine olanak tanıdı.\n\n" +
                        "ISTECH’25 etkinliği kapanış konuşmalarıyla sona erdi. Katılımcılar, hem yeni teknolojilerle ilgili güncel bilgiler edindikleri hem de kendi fikirlerini geliştirme fırsatı buldukları bu verimli günün ardından zirveyi tamamladı.",
                R.drawable.as_haberler_png5
        ));
        haberList.add(new ASHaberlerModel(
                "05",
                "Mayıs",
                "İSTÜN’lü Öğrencilerden TÜBİTAK Başarısı",
                "Üniversitemiz öğrencileri, TÜBİTAK tarafından desteklenen öğrenci projeleri programlarında gösterdikleri başarıyla gurur kaynağımız oldu.\n\n" +
                        "TÜBİTAK Bilim İnsanı Destek Programları Başkanlığı (BİDEB) tarafından yürütülen 2209-A Üniversite Öğrencileri Araştırma Projeleri Destekleme Programı ve 2209-B Üniversite Öğrencileri Sanayiye Yönelik Araştırma Projeleri Desteği Programı kapsamında, İstanbul Sağlık ve Teknoloji Üniversitesi’nden toplam 29 öğrenci projesi destek almaya hak kazandı.\n\n" +
                        "TÜBİTAK 2209-A Programı çerçevesinde 25 proje, üniversitemiz öğrencileri tarafından başarıyla sunuldu ve desteklenmeye değer bulundu. Bu projelerden 21’i Mühendislik ve Doğa Bilimleri Fakültesi, 4’ü ise Sağlık Bilimleri Fakültesi öğrencileri tarafından hazırlandı. Program, öğrencileri bilimsel araştırma yapmaya teşvik etmeyi ve araştırma kültürünü üniversite düzeyinde yaygınlaştırmayı hedefliyor.\n\n" +
                        "Öğrencilerin sanayiyle iş birliği içinde yürüttüğü projelere odaklanan TÜBİTAK 2209-B Programı kapsamında ise Mühendislik ve Doğa Bilimleri Fakültesi öğrencilerimize ait 4 proje, destek almaya hak kazandı. Bu başarı, öğrencilerimizin sadece akademik alanda değil, aynı zamanda sanayi ile entegre bir şekilde çözüm üretebildiklerini de gösteriyor.",
                R.drawable.as_haberler_png6
        ));
        recyclerView.setAdapter(new ASHaberlerAdapter(this, haberList));

        // Geri butonu
        findViewById(R.id.geri_don_button).setOnClickListener(v -> finish());
    }
}