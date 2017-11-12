import java.util.ArrayList;
import java.util.Random;

public class PrawaCzytelnikow {
    //static Integer idWlasciciela;
    public static void main(String[] sdfsfsvs)
    {
        new GeneratePrawaCzytelnikow().generuj();
    }

}
/*
*           TO SIĘ MOZE NAM SPIERDOLIC
* o co chodzi tu z idWlasciciela??? ilu jestr tych wlascicieli?
* z tego by wynikalo ze mimo wszystko mamy nie jednego wlasciciela
* moim zdaniem jest zbedne
* */
class GeneratePrawaCzytelnikow
{
    int licznik = 0;
    ArrayList<WierszPrawaCzytelnikow> tabela = new ArrayList<>(Constants.liczbaPrawCzytelnikow);
    public void generuj()
    {
        WierszPrawaCzytelnikow wiersz;
        for (int i = 0; i < Constants.liczbaPrawCzytelnikow; i++)
        {
            do
            {
                wiersz = new WierszPrawaCzytelnikow(getIdWlasciciela(), getIdCzytelnika(), getIdTypuPrawa());
            }
            while (tabela.contains(wiersz));

            tabela.add(wiersz);
        }

        String content = new String();

        for (int i=0; i<Constants.liczbaPrawCzytelnikow; i++)
        {
            wiersz = tabela.get(i);
            content = content + (wiersz.idWlasciciela.toString() + ';' + wiersz.idCzytelnika.toString() + ';'
                    + wiersz.idTypuPrawa.toString() + ';' + wiersz.getDate() + '\n');
        }

        new ZapisDoPliku("PrawaCzytelnikow.csv", content);

    }

    Integer getIdWlasciciela()
    {
        return new Random().nextInt(Constants.liczbaWlascicieli) + 1;
    }
    Integer getIdCzytelnika(){
        return new Random().nextInt(Constants.liczbaCzytelnikow) + 1;
    }
    Integer getIdTypuPrawa(){
        return new Random().nextInt(Constants.liczbaTypuPrawa) + 1;
    }

    private class WierszPrawaCzytelnikow
    {
        public Integer idWlasciciela;
        public Integer idCzytelnika;
        public Integer idTypuPrawa;

        public WierszPrawaCzytelnikow(int idWlasciciela, int idCzytelnika, int idTypuPrawa)
        {
            this.idWlasciciela = idWlasciciela;
            this.idCzytelnika = idCzytelnika;
            this.idTypuPrawa = idTypuPrawa;
        }

        @Override
        public boolean equals(Object obj)
        {
            WierszPrawaCzytelnikow wiersz = (WierszPrawaCzytelnikow) obj;
            return idWlasciciela == wiersz.idWlasciciela && idCzytelnika == wiersz.idCzytelnika && idTypuPrawa == wiersz.idTypuPrawa;
        }
        public String getDate(){
            Integer dzien = new Integer(new Random().nextInt(28) + 1);
            Integer miesiac = new Integer(new Random().nextInt(12) + 1);
            String rok = new Integer(new Random().nextInt(100) + 1901).toString();
            return new String(rok + (miesiac<10 ? "0" + miesiac.toString():miesiac.toString()) + (dzien<10 ? "0" +
                    dzien.toString():dzien.toString()));//RRRRMMDD
        }
    }
}
