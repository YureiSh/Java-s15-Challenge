# Library OOP planlama

- Library Singleton olacak.
- Book abstract class alabilir.
- Person abstract class olabilir.
- Polymorphism uygulamamız istenmiş, bunu Booktan türeyen kitapların
instance'ını yaratırken kullanabiliriz?
- Set ve List kullanmamız istenmiş, aradaki fark:
Set tekrarlanmayacak verileri tutar, List tekrarlanabilir ama index'e dikkat eder set'e ziyaden.

Note: Set'i Reader'lar için, List'i booklar için kullanabiliriz.

- Veri saklamak için mapleri kullanmalısınız,
denmiş. member_Record için? İşlemleri sonuçta onunla yaparız.

- Abstract member_record yazılsın, ve ondan türeyen member_record
bilgisi reader'ın içinde tutulsun. Polymorph ile student ya da faculty
olduğunu biz vereceğiz. 

- Author'a da Reader'a da AbstractPerson olarak tanımladık. Her person'ın,
Fakülte ya da öğrenci üyelik kaydı olabilir. 

- Books issued'u AbstractBook list yapalım. Book'u da Map yapalım. 
1L id'li book gitti removelayıp işlem yapmak yerine updateleyip
this book is issued to: deyip kullanıcı koyalım
- Merak etme Reader -> memberRecord -> books issued

---

# Scratched Ideas

- Person Interface OLAMAZ.
name variable'ı var interface'ler variable almaz.
- 