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
            content = content + (wiersz.idWlasciciela + ';' + wiersz.idCzytelnika + ';' + wiersz.idTypuPrawa + ';' + '\n');
        }

        new ZapisDoPliku("PrawaCzytelnikow.txt", content);

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
        public int idWlasciciela;
        public int idCzytelnika;
        public int idTypuPrawa;

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
    }
}
