# Tasks

## Nivell 1: JUnit

### Exercici 1

- Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
- Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'.

### Exercici 2

- Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
- Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre 
  de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.

### Exercici 3
  
- Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException. 
- Verifica el seu correcte funcionament amb un test jUnit.
  
## Nivell 2: Hamcrest

### Exercici 1

Defineix un Matcher personalitzat per a Hamcrest que proporcioni el Matcher de longitud per a un String.

Volem usar la classe ->FeatureMatcher.

Amb FeatureMatcher podem ajustar un Matcher existent, decidir quin camp de l'Objecte prova ha de coincidir i proporcionar un missatge d'error agradable. El constructor de FeatureMatcher té els següents arguments en aquest ordre:

- El matcher que volem embolicar.
- Una descripció de la funció que provem.
- Una descripció del possible mismatch (desajustament).

L'únic mètode que hem de sobreescriure és featureValueOf (T actual), que retorna el valor que es passarà al mètode match () / matchesSafely (). Utilitza el seu comparador personalitzat en una prova per a comprovar si la cadena "Mordor" té una longitud de 8.

Ajusta la prova si és necessari.