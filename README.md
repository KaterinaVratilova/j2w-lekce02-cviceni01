# Lekce 2 – datum a čas

Úvodní webová stránka bude obsahovat dva odkazy – na stránku s aktuálním datem a stránku s aktuálním časem. Dále budou na webu dvě stránky – stránka na adrese
`/datum` bude zobrazovat aktuální datum, stránka na adrese `/cas` bude zobrazovat aktuální čas (v okamžiku načtení stránky). V úvodní webové stránce je vložen
CSS framework [Bootstrap](https://getbootstrap.com). 

1. Udělej fork zdrojového repository do svého účtu na GitHubu.
1. Naklonuj si repository **ze svého účtu** na GitHubu na lokální počítač.
1. Úvodní stránka `static/index.html` už je připravená.
1. Vytvoř kontrolér – třídu `cz.czechitas.java2webapps.lekce2.controller.MainController`.
1. V kontroléru budou dvě metody – jedna bude navázána na cestu `/datum`, druhá na cestu `/cas`.
1. Obě metody budou vracet `ModelAndView`, view bude pro každou metodu jiné.
1. Metoda pro výpis data vloží do modelu datum zformátované v českém formátu:
   ```java
   final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
   final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d. MMMM yyyy", LOCALE);
   LocalDate.now().format(DATE_FORMATTER)
   ```
1. Metoda pro výpis času vloží do modelu čas (hodiny a minuty) zformátované v českém formátu:
   ```java
   final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
   final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("H:mm", LOCALE);
   LocalTime.now().format(TIME_FORMATTER);
   ```
1. Pro zobrazení velkého nápisu lze použít následující třídy z Bootstrapu:   
   ```html
   <h1 class="display-1 fw-bold">Nápis</h1>
   ```
1. Zkontroluj výsledek v prohlížeči.

## Mohlo by se hodit
* odkaz na stránku [Lekce 2](https://java.czechitas.cz/2022-podzim/java-2-online/lekce-2.html)
* CSS framework [Bootstrap](https://getbootstrap.com)
* balík [java.time](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/package-summary.html)
* třída [java.time.format.DateTimeFormatter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html)
