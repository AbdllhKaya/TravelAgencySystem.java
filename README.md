Turizm Acente Sistemi

Bu projenin temel amacı, otel sektöründe faaliyet gösteren işletmenin günlük operasyonlarını daha etkili bir şekilde yönetmesini sağlamak ve müşteri rezervasyon süreçlerini optimize etmektir. 

Patika Turizm Acentesi pek çok otel ile anlaşma yaparak otellerin odalarını müşterilere rezerve etmektedir. Acente tarafından admin yetkisine sahip ilk kişi yazılımcı tarafından veri tabanına kaydedilecektir. Admin yetkisine sahip kişi de sisteme login olup hem admin hem acente çalışanı ekleyebilecektir. Acente çalışanları sisteme otel, oda kaydedecek ve müşterilerin taleplerine göre oda araması yapıp rezervasyon işlemi yapacaktır. Müşterilerin sisteme erişimi olmadığını, telefon veya yüz yüze destek aldığı bir senaryo düşünün.

Otel Yönetim Sistemi, kullanıcı dostu bir arayüzle acente çalışanlarına esnek fiyatlandırma, detaylı otel ve oda yönetimi, rezervasyon kolaylığı ve otomatik hesaplama gibi özellikler sunarak bu amaçları gerçekleştirmeyi hedeflemektedir.

Uygulanacak projede iki farklı kullanıcı tanımlanacaktır. Bunlar admin ve acente çalışanıdır. Bu kullanıcıların yetkileri aşağıdaki gibidir:

Admin

Kullanıcı Yönetimi: Admin yetkisi ile giriş yapıldığında admin ekranı açılacak. Bu ekrandan
Username: 1
Password: 1
bilgileri ile giriş yaparak;
Acente çalışanı listeleme,
Ekleme, 
Silme, 
Güncelleme ve 
Kullanıcının rolüne (admin, personel) göre filtreleme yapılmalıdır.

Acente Çalışanı (Personel)

Username: 2
Password: 2
Bilgileri ile giriş yaparak;
Otel Yönetimi: Otel listeleme, ekleme
Oda Yönetimi: Oda listeleme, ekleme
Dönem Yönetimi: Dönem listeleme, ekleme
Fiyat Yönetimi
Oda Arama
Rezervasyon işlemleri: Rezervasyon listeleme, ekleme, silme, güncelleme

Kullanıcı Yönetimi

Kullanıcı yönetimi, admin tarafından sisteme erişecek kullanıcıları ekleme, çıkarma ve düzenleme işlemlerini gerçekleştirilir. Kullanıcılar username ve password girerek sisteme giriş yapar.

Admin, sisteme yeni bir kullanıcı eklerken kullanıcının rolünü (admin, personel) belirler.
Admin, mevcut kullanıcıların bilgilerini (ad, soyad, şifre vb.) düzenleyebilir.
Admin, kullanıcı hesabını silebilir.
Admin, kullanıcının rolüne (admin, personel) göre filtreleme yapabilir..


Otel Yönetimi

Acente anlaşmalı olduğu otelleri, konum bilgileri ve diğer özellikleri ile birlikte sistemden yönetmeli. Otel eklenirken Otel Adı, Adres, E-posta, Telefon, Yıldız, Tesis Özellikleri, Pansiyon tipleri gibi diğer tanımlamalar yapılır.

Otel ekranı, otellerin listelendiği bir ekranı içerir. Bu ekran üzerinden otel ekleme işlemi gerçekleştirilebilir. Aynı zamanda var olan otellere sahip olduğu pansiyon tipi, tesis özelliği ve dönem bilgisi kaydedilmelidir.


Sistemde olması beklenen Pansiyon Tipleri:

Ultra Her şey Dahil
Her şey Dahil
Oda Kahvaltı
Tam Pansiyon
Yarım Pansiyon
Sadece Yatak
Alkol Hariç Full credit


Sistemde olması beklenen Tesis Özellikleri:

Ücretsiz Otopark
Ücretsiz WiFi
Yüzme Havuzu
Fitness Center
Hotel Concierge
SPA
7/24 Oda Servisi


Örnek Otel Verisi;

Otel Adı: Kodluyoruz Life İstanbul
Şehir: İstanbul
Bölge: Beyoğlu
Tam Adres: Şahkulu, Şişhane Metro Durağı, Meşrutiyet Cd. No:125, 34421
E-posta: info@kodluyoruzorg
Telefon: 0212 xxx xx xx
Yıldız: 5 Yıldızlı
Tesis Özellikleri

Ücretsiz Otopark
SPA
7/24 Oda Servisi
Pansiyon Tipleri
Oda Kahvaltı
Yarım Pansiyon


Dönem Yönetimi

Otellere ait tarihsel dönemler eklenir ve oda fiyatlandırmalarında bu dönemler dikkate alınır. Buradaki amaç değişken bir fiyatlandırma sunabilmektir. Yaz aylarında otel fiyatları daha yüksek iken, bu durum kış ayları için daha azdır. Fiyatlandırmalar turizm sektöründe dönemsel olarak yapılır. Dönemler iki tarih aralığı olarak tanımlanır.

Dönemleri tarih aralığı olarak acente personeli girer. Oda fiyatlandırmaları bu dönemlere göre değişim gösterir.



Örnek Dönemler:

01/01/2021 - 31/05/2021
01/06/2021 - 01/12/2021


Oda Yönetimi

Acente çalışanı otellerden rezerv ettiği odaları sisteme ekler ve bu odalar üzerinden fiyatlandırma sağlar. Otellerin sahip olduğu oda tipleri tek kişilik oda (Single room), çift kişilik oda (Double room), junior suite oda, suite oda olacak şekilde 4 tip ile kısıtlı olacaktır. Aynı tipteki odaları sisteme tekrar tekrar eklemek yerine stok mantığı kullanılmaktadır. Ayrıca odalara ait özelliklerde girilmelidir. Oda özellik bilgileri aşağıda anlatılmaktadır.Oda ekranı, tüm odaların listelendiği bir ekranı içerir. Acente personeli, bu ekran üzerinden otellere oda eklemesi ve rezervasyon için oda arama işlemleri yapabilir. Oda ekleme sayfasına gidildiğinde ise otel, 4 tane oda tipinden bir tanesi, otele ait sisteme kayıtlı pansiyon tipinden bir tanesi ve otele ait sisteme kayıtlı dönemlerden bir tanesi seçilir. Yapılan seçimlere göre odanın yetişkin için gecelik fiyat bilgisi, çocuk için gecelik fiyat bilgisi ve stok adedi girilir. Ayrıca aşağıdaki oda özelliklerinden yatak sayısı, metrekare bilgisi, ve diğer oda özelliklerinden odada olup olmama bilgisi sisteme kaydedilmelidir. Oda listeleme ekranında odaya ait tüm bilgiler gösterilmelidir.Sistemde olması beklenen Oda Özellikleri :

Yatak Sayısı
Metrekare
Televizyon (Var, Yok)
Minibar (Var ,Yok)
Oyun Konsolu (Var, Yok)
Kasa (Var, Yok)
Projeksiyon (Var, Yok)
Bir odanın kapasitesi yatak sayısına bağlıdır. 2 yataklı bir odaya 2 misafir eklenebilir.



Oda Fiyatlandırmaları

Odalar gecelik fiyat olarak hesaplanır. Oda fiyatları otel için eklenmiş olan dönemlere, pansiyon tiplerine göre farklı olacaktır. Yetişkin ve çocuk için olmak üzere farklı fiyat tanımlanacaktır.



Oda Arama ve Rezervasyon İşlemleri

Acente çalışanı sistem üzerinden

Girdiği tarih aralığına,
Şehire,
Otel adına
göre oda arayabilmelidir.

Yukarıda verilen 3 arama ölçütünden sadece birinin girilmesi, sadece ikisinin girilmesi veya üçünün de girilmesi durumlarında arama yapılabilmelidir. Bunun için gerekli dinamik sql sorgusu yazmalısınız.


Oda Arama Algoritması

Acente gerekli oda arama bilgileri girdikten sonra, sistemde tanımlı olan odaları listeleyebilir.

Odaların listede çıkması için:

Odaya ait otelin istenilen şehir içinde olmalıdır.
İstenilen tarih aralığına göre otelin dönem bilgisi olmalıdır. Örneğin: giriş tarihi: 09/06/2021, çıkış tarihi: 12/06/2021 olan bir arama için, otellerin o tarih aralığında bir dönemleri olmalıdır.
Eğer otele ait dönem var ise, odanın da ilgili dönemlerde pansiyon tiplerine göre fiyat bilgisi olmalıdır ki müşteriye fiyat bilgisi verilebilsin.
Odanın stok sayısı 0'dan büyük olmalı.


Örnek Arama Verisi

Şehir: İstanbul
Giriş Tarihi: 01/04/2021
Çıkış Tarihi: 03/04/2021
Misafir Bilgisi: 2 Yetişkin, 1 Çocuk


Fiyat Hesaplama

Fiyatlar misafir bilgisi, kalınacak gece sayısı ve oda fiyatı üzerinden hesaplanır.

Bu bilgilere göre

İlk önce girilen şehirdeki oteller bulunur.
Bulunan otele ait stoğu olan odalar bulunur.
Odaların ilgili tarih aralığında dönem fiyat bilgisi var ise fiyat hesaplaması yapılır.

Fiyat hesaplaması otelin dönemine, pansiyon tipine, yetişkin ve çocuk sayısına, ve kalınacak geceye göre hesaplanır. 

Örneğin yaz dönemi yarım pansiyon için gecelik yetişkin ücreti 1500₺ olan bir otel odasında iki kişi üç gece konaklayacak ise ücret 9000₺ olarak hesaplanmalıdır.

Fiyat hesabını girilen bilgilere göre sistem otomatik hesaplamalıdır.


Rezervasyon İşlemi

Acente kullanıcısı istenilen özelliklere sahip odaları listeledikten sonra müşterinin istediği oda için rezervasyon işlemine geçer. Rezervasyon işlemine geçildiğinde toplam fiyat otomatik hesaplanmalı ve müşterilerden birinin iletişim bilgileri alınıp rezervasyon tamamlanır. 

Rezervasyon tamamlamak için:

Müşteri iletişim bilgileri
Misafir Ad, Soyad ve T.C. Kimlik Bilgileri
girerek sistem üzerinden satışı tamamlar. Eğer satış tamamlanırsa ilgili odanın stoğu 1 azalmış olur.

Acente çalışanları sistem üzerinde yapılan rezervasyonları listeleyebilecek, güncelleyebilecek ve silebilecektir. Silinen rezervasyonlarda ilgili odanın stoğu 1 arttırılmalıdır.

Kullanılan Teknolojiler

Java,
Java Swing (GUI),
PostgreSQL

