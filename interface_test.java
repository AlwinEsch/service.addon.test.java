import kodi.*;
import kodi.gui.dialogs.TextViewer;
import kodi.gui.dialogs.YesNo;

public class Main {
  public static void main(String argv[])
  {
    kodi.Init(kodi.KODI_API, argv);

    kodi.Log(ADDON_LOG.ADDON_LOG_DEBUG, "Hello LOG_INFO");
    kodi.Log(ADDON_LOG.ADDON_LOG_WARNING, "Hello LOG_WARNING");
    kodi.Log(ADDON_LOG.ADDON_LOG_ERROR, "Hello LOG_ERROR");
    kodi.Log(ADDON_LOG.ADDON_LOG_FATAL, "Hello LOG_FATAL");
    kodi.Log(ADDON_LOG.ADDON_LOG_DEBUG, "Hello formatted entry: " + "tata " + 123 + " " +  0.10101);

    boolean shown = false;
    boolean shown2 = true;
    int cnt = 0;
    while (cnt++ < 5)
    {
      if (!shown)
      {
        boolean ret = YesNo.ShowAndGetInput(
            "Yes / No test call",   // The Header
            "You has opened Yes / No dialog for test\n\nIs this OK for you?", "", "");
        shown = true;
        shown2 = false;

        if (ret)
          kodi.Log(ADDON_LOG.ADDON_LOG_WARNING, "SHOW 1 true");
        else
          kodi.Log(ADDON_LOG.ADDON_LOG_WARNING, "SHOW 1 false");
      }

    if (!shown2)
    {
      shown2 = true;

      TextViewer.Show("The Wizard of Oz (1939 film)",
        "The Wizard of Oz is a 1939 American musical comedy-drama fantasy film " +
        "produced by Metro-Goldwyn-Mayer, and the most well-known and commercially " +
        "successful adaptation based on the 1900 novel The Wonderful Wizard of Oz " +
        "by L. Frank Baum. The film stars Judy Garland as Dorothy Gale. The film" +
        "co-stars Terry the dog, billed as Toto; Ray Bolger, Jack Haley, Bert Lahr, " +
        "Frank Morgan, Billie Burke, Margaret Hamilton, with Charley Grapewin and " +
        "Clara Blandick, and the Singer Midgets as the Munchkins.\n" +
        "\n" +
        "Notable for its use of Technicolor, fantasy storytelling, musical score and " +
        "unusual characters, over the years it has become an icon of American popular " +
        "culture. It was nominated for six Academy Awards, including Best Picture but " +
        "lost to Gone with the Wind. It did win in two other categories including Best " +
        "Original Song for \"Over the Rainbow\". However, the film was a box office " +
        "disappointment on its initial release, earning only $3,017,000 on a $2,777,000 " +
        "budget, despite receiving largely positive reviews. It was MGM's most " +
        "expensive production at that time, and did not completely recoup the studio's " +
        "investment and turn a profit until theatrical re-releases starting in 1949.\n" +
        "\n" +
        "The 1956 broadcast television premiere of the film on CBS re-introduced the " +
        "film to the wider public and eventually made the presentation an annual " +
        "tradition, making it one of the most known films in cinema history. The " +
        "film was named the most-viewed motion picture on television syndication by " +
        "the Library of Congress who also included the film in its National Film " +
        "Registry in its inaugural year in 1989. Designation on the registry calls " +
        "for efforts to preserve it for being \"culturally, historically, and " +
        "aesthetically significant\". It is also one of the few films on UNESCO's " +
        "Memory of the World Register.\n" +
        "\n" +
        "The Wizard of Oz is often ranked on best-movie lists in critics' and public " +
        "polls. It is the source of many quotes referenced in modern popular culture. " +
        "It was directed primarily by Victor Fleming (who left production to take " +
        "over direction on the troubled Gone with the Wind production). Noel Langley, " +
        "Florence Ryerson and Edgar Allan Woolf received credit for the screenplay, " +
        "but there were uncredited contributions by others. The songs were written " +
        "by Edgar \"Yip\" Harburg (lyrics) and Harold Arlen (music). The incidental " +
        "music, based largely on the songs, was composed by Herbert Stothart, with " +
        "interspersed renderings from classical composers.\n");

        kodi.Log(ADDON_LOG.ADDON_LOG_WARNING, "SHOW 2");
        shown = false;
      }

      sleep(2000);
    }

    kodi.Deinit();
  }

  private static void sleep(long millis) {
      try {
          Thread.sleep(millis);
      } catch (InterruptedException ignored) {
      }
  }
}
