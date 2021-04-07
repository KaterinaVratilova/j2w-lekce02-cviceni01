package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Kontroler, který obsahuje dvě metody. Spring kontroler sám vytvoří a zvaolá správnou metodu v závislosti na tom, kterou adresu prohlížeč volá.
 *
 * Adresa {@code /} není pokrytá žádnou metodou kontroleru. Spring se v tom případě pokusí najít soubor {@code src/main/resources/static/index.html}
 * a odeslat prohlížeči ten. V našem projektu takový soubor je, tím pádem se na úvodní obrazovce zobrazí příslušná úvodní stránka.
 *
 * @author Filip Jirsák
 */
@Controller
public class DateTimeController {
  /**
   * České „locale“ – proměnnou použijeme dále ke specifikaci, že datum a čas chceme formátovat česky a pro ČR. Název měsíce tak bude česky.
   */
  private static final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
  /**
   * Formátovač pro datum. Datum bude česky a bude se vypisovat ve formátu {@code d. MMMM yyyy} – tedy den v měsíci následovaný tečkou, pak měsíc celým slovem
   * a nakonec čtyřmístný rok.
   */
  private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d. MMMM yyyy", LOCALE);
  /**
   * Formátovač pro čas. Opět dle českých zvyklostí. Formát {@code H:mm} znamená, že na začátku bude hodina ve 24hodinovém formátu bez úvodní nuly (tj. např.
   * 1 nebo 23), pak dvojtečka a za ní minuty s úvodní nulou (tj. třeba „00“).
   */
  private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("H:mm", LOCALE);

  /**
   * Metoda kontroleru zobrazující datum. Je Springem volaná v okamžiku, kdy prohlížeč požaduje adresu {@code /datum}.
   *
   * @return Sdružený objekt obsahující model a informace o view.
   */
  @GetMapping("/datum")
  public ModelAndView datum() {
    //Vytvoříme si sdružený objekt pro model a view. Použijeme view „datum“, tedy šablonu v souboru „src/main/resources/templates/datum.html“.
    ModelAndView result = new ModelAndView("datum");
    //Do modelu pod klíčem „datum“ vložíme aktuální datum zformátované dle českých zvyklostí.
    result.addObject("datum", LocalDate.now().format(DATE_FORMATTER));
    //Sdružený objekt vrátíme z metody, Spring jej vezme a zavolá příslušnou Thymeleaf šablonu a předá jí data z našeho modelu.
    return result;
  }

  /**
   * Metoda kontroleru zobrazující čas. Je Springem volaná v okamžiku, kdy prohlížeč požaduje adresu {@code /cas}.
   *
   * @return Sdružený objekt obsahující model a informace o view.
   */
  @GetMapping("/cas")
  public ModelAndView cas() {
    //Vytvoříme si sdružený objekt pro model a view. Použijeme view „datum“, tedy šablonu v souboru „src/main/resources/templates/datum.html“.
    ModelAndView result = new ModelAndView("cas");
    //Do modelu pod klíčem „datum“ vložíme aktuální čas zformátovaný dle českých zvyklostí.
    result.addObject("cas", LocalTime.now().format(TIME_FORMATTER));
    //Sdružený objekt vrátíme z metody, Spring jej vezme a zavolá příslušnou Thymeleaf šablonu a předá jí data z našeho modelu.
    return result;
  }
}
