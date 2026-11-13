# ImplicitIntents

## Opis projekta

Projekt **ImplicitIntents** je Android aplikacija, izdelana v Android Studiu, ki prikazuje uporabo implicitnih namenov (Implicit Intents).

Implicitni nameni omogočajo, da aplikacija zahteva izvedbo določenega dejanja, Android operacijski sistem pa poišče ustrezno aplikacijo, ki lahko to dejanje izvede.

Aplikacija omogoča odpiranje spletnih strani, prikaz lokacij na zemljevidu in deljenje besedila z drugimi aplikacijami.

## Funkcionalnosti

Aplikacija vsebuje tri glavne funkcionalnosti:

### 1. Open Website
- Uporabnik vnese spletni naslov.
- Naslov se pretvori v objekt `Uri`.
- Uporabi se `Intent.ACTION_VIEW`.
- Z metodo `resolveActivity()` se preveri, ali obstaja primerna aktivnost za odpiranje povezave.
- Spletna stran se odpre v ustrezni aplikaciji.

### 2. Open Location
- Uporabnik vnese ime lokacije.
- Ustvari se URI v obliki `geo:0,0?q=iskana_lokacija`.
- Uporabi se `Intent.ACTION_VIEW`.
- Lokacija se odpre v aplikaciji za zemljevide.

### 3. Share This Text
- Uporabnik vnese poljubno besedilo.
- Za deljenje se uporabi `ShareCompat.IntentBuilder`.
- MIME tip je nastavljen na `text/plain`.
- Android prikaže seznam aplikacij, prek katerih lahko uporabnik deli besedilo.

## Uporabljene tehnologije

- Java
- Android Studio
- Android SDK
- XML
- Implicit Intents
- `Intent.ACTION_VIEW`
- `Uri`
- `PackageManager`
- `ShareCompat.IntentBuilder`

<img width="205" height="430" alt="Implic_inte1" src="https://github.com/user-attachments/assets/38c4c62e-b1ff-4b36-8470-2e2b086e29a5" />
<img width="205" height="430" alt="Implic_inte2" src="https://github.com/user-attachments/assets/f13fe110-35d9-4662-8e24-a7d5566758b5" />
<img width="205" height="430" alt="Implic_inte3" src="https://github.com/user-attachments/assets/d444cd48-6f82-4c33-8878-e1c4f2fac942" />
<img width="205" height="430" alt="Implic_inte4" src="https://github.com/user-attachments/assets/519cd69f-2699-4cf8-b54b-c30a5b837e5e" />
