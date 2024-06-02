# Exam_Programming

## Information

**Examination in DAPE1400 - Programming**

**Grade**: A

**Form of assessment**: Written examination under supervision

**Date**: 12/12/2023

## Tasks

### Oppgave 1 (10%)
Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:
a)  Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
b)  Skriv ut annethvert element
c)  Skriv ut summen av alle positive tall i arrayet
d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
Bruk løkker og System.out for å skrive ut.

### Oppgave 2 (20%)
Lag en klasse kalt Liste for å behandle arrays.
Lag følgende statiske metoder i denne klassen som behandler arrays:
1)  Tar et heltallsarray inn og returnerer hvor mange elementer som er større enn null
2)  Tar et heltallsarray inn og finner ut hvor mange ganger et bestemt tall forekommer (tallet skal også  inn i metoden)
3) Tar et heltallsarray inn og finner det største tallet i arrayet
Til slutt skriv kode i main-metoden for å kalle de ulike metodene med et heltallsarray
Resultatet skal skrives ut på System.out.

### Oppgave 3 (20%)
Det skal lages kode for en klasse kalt Skatt. Den skal ha følgende attributter
- navn (tekst)
- adresse (tekst)
- lønn (desimaltall)
- skatt (desimaltall)
Det også lages en metode i denne klassen som heter beregn. Denne metoden skal så beregne skatten ut i fra lønnen etter følende formel:
Ved inntekter mindre enn 50.000 skal det ikke betales skatt.
Ved inntekter mellom 50.000 og 150.000 skal det betales 25% skatt på hele lønnen.
Inntekter over 150.000 skal det betales 35 % skatt på hele lønnen.
Metoden skal så sette den beregnede skatten i skatte-attributten. Det betyr at metoden ikke skal motta noe eller returnere noe.
En metode toString() skal også lages. Denne skal formatere resultatet slik:
Per Hansen, Osloveien 82 0150 Oslo
Lønn : 400000.0 Skatt : 140000.0
Kod klassen og metodene under. Bruk en konstruktør. Det er ikke nødvendig å kode get/set-metoder. Kod også kall til disse for å skrive resultatet til System.out.

### Oppgave 4 (20%)
Det er definert to klasser, Fag og Student. Se koden til venstre.
Lag et program som inneholder disse to klassene og en main-metode.
Lag konstruktører og get/set metoder for Fag og Student-klassene.
Lag toString() metoder i Fag- og Student-klassene slik at man får følgende ut på System.out når det opprettes et array med 10 plasser i faget og det legges inn to studenter og man skriver ut et fag:
Fag : Programmering, år : 2020
Student : Navn=Kari Olsen, StudNr=S234556
Student : Navn=Ole Hansen, StudNr=S356734
Skriv en main-metode for å få det overstående ut via System.out.

### Oppgave 5 (30%)
Det skal lages et program som registrer bøker i en boksamling. Klassene, attributtene og metodene som skal implementeres illustreres i overstående klasse-diagram. Lydbok og Papirbok arver Bok-klassen.  Det er bare metodene illustrert i klasse-diagrammet som skal implementeres.
I main-metoden skal det så opprettes et objekt av hver type (Lydbok og Papirbok). Disse skal så legges inn i en ArrayList av type Bok. Deretter skal attributtene skrives ut i en løkke ved hjelp av toString()-metodene.