🎥 System Rezerwacji Miejsc w Kinie

System Rezerwacji Miejsc w Kinie to aplikacja konsolowa napisana w Javie, która pozwala użytkownikom rezerwować miejsca w kinie. Aplikacja umożliwia wyświetlanie dostępnych miejsc, rezerwowanie wybranych miejsc oraz ich anulowanie. Projekt ten wykorzystuje tablice dwuwymiarowe do zarządzania stanem sali kinowej.

📋 Funkcjonalności

Wyświetl salę kinową:
użytkownik może zobaczyć aktualny stan miejsc w kinie.
Wolne miejsca są oznaczone jako [O], a zarezerwowane jako [X].

Rezerwuj miejsce: użytkownik może zarezerwować jedno lub więcej miejsc, podając ich współrzędne (rząd i kolumnę).
System sprawdza dostępność miejsc przed rezerwacją.

Anuluj rezerwację: użytkownik może anulować rezerwację, podając współrzędne zarezerwowanych miejsc.

📦 Wykorzystywane technologie

Java: Implementacja projektu.

Tablice dwuwymiarowe: Reprezentacja miejsc w sali kinowej.

Programowanie obiektowe: Projektowanie klas zarządzających rezerwacjami.

⚙️ Jak uruchomić projekt?

Skonfiguruj środowisko

Zainstaluj JDK (Java Development Kit) w wersji 8 lub nowszej.
Upewnij się, że masz skonfigurowaną Javę na swoim komputerze.

Uruchom projekt

Skopiuj kod projektu na swój komputer.

Otwórz projekt w IntelliJ IDEA lub innym środowisku wspierającym Javę.

Uruchom klasę CinemaReservationSystem (punkt wejścia do programu).

🧩 Struktura projektu

CinemaReservationSystem: Klasa zarządzająca salą kinową, zawierająca tablicę dwuwymiarową reprezentującą miejsca.

Funkcjonalności:
Wyświetlanie stanu sali,
rezerwacja miejsc,
anulowanie rezerwacji.

📚 Przykład działania

Wyświetlenie pustej sali:

![image](https://github.com/user-attachments/assets/0d201ed8-3873-4a65-8f03-4d85674039ee)

Dodanie dwóch rezerwacji:

![image](https://github.com/user-attachments/assets/6b17850c-eae3-457a-9469-20d524867eeb)

Wyświetlenie układu sali oraz ilość zajętych miejsc: 

![image](https://github.com/user-attachments/assets/c773fb13-40b8-4280-a4fd-eb37247b43c4)

Anulowanie rezerwacji:

![image](https://github.com/user-attachments/assets/1ee39afa-a1da-4ff8-a50e-705b591ea816)

Aktualizacja ilości miejsc i zamknięcie aplikacji:

![image](https://github.com/user-attachments/assets/4c89f881-06f0-418a-b75a-6b250a33faa7)


🚀 Pomysły na rozwój

Obsługa wielu sal kinowych: Możliwość wyboru sali kinowej przed rezerwacją miejsc.

Rezerwacja grupowa: Automatyczna rezerwacja kilku miejsc obok siebie dla grupy użytkowników.

Zapisywanie stanu sali: Możliwość zapisywania rezerwacji do pliku i wczytywania ich przy ponownym uruchomieniu aplikacji.

Interfejs graficzny: Rozszerzenie aplikacji o GUI.
