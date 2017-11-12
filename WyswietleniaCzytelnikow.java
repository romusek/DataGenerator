import java.util.ArrayList;
import java.util.Random;

public class WyswietleniaCzytelnikow
{
    public static void main(String[] sdfsfsvs)
    {
        new GenerateWyswietleniaCzytelnikow().generuj();
    }
}

class GenerateWyswietleniaCzytelnikow
{
    int licznik = 0;
    ArrayList<WierszWyswietleniaCzytelnikow> tabela = new ArrayList<>(Constants.liczbaWyswietlenCzytelnikow);
    public void generuj()
    {
        WierszWyswietleniaCzytelnikow wiersz;
        for (int i = 0; i < Constants.liczbaWyswietlenCzytelnikow; i++)
        {
            do
            {
                wiersz = new WierszWyswietleniaCzytelnikow(getIdCzytelnikow(), getIdArtykulu(), getDate());
            }
            while (tabela.contains(wiersz));

            tabela.add(wiersz);
        }

        String content = new String();

        for (int i=0; i<Constants.liczbaWyswietlenCzytelnikow; i++)
        {
            wiersz = tabela.get(i);
            content = content + (wiersz.idCzytelnika.toString() + ';' + wiersz.idArtykulu.toString()+ ';' + wiersz.data + '\n');
        }

        new ZapisDoPliku("WyswietleniaCzytelnikow.csv", content);

    }

    Integer getIdCzytelnikow(){
        return new Random().nextInt(Constants.liczbaCzytelnikow) + 1;
    }
    Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }
    static String getDate(){
        Integer dzien = new Integer(new Random().nextInt(28) + 1);
        Integer miesiac = new Integer(new Random().nextInt(12) + 1);
        String rok = new Integer(new Random().nextInt(100) + 1901).toString();
        return new String(rok + (miesiac<10 ? "0" + miesiac.toString():miesiac.toString()) + (dzien<10 ? "0" +
                dzien.toString():dzien.toString()));//RRRRMMDD
    }

    private class WierszWyswietleniaCzytelnikow
    {
        public Integer idCzytelnika;
        public Integer idArtykulu;
        public String data;

        public WierszWyswietleniaCzytelnikow(int idAutora, int idArtykulu, String data)
        {
            this.idCzytelnika = idAutora;
            this.idArtykulu = idArtykulu;
            this.data = data;
        }

        @Override
        public boolean equals(Object obj)
        {
            WierszWyswietleniaCzytelnikow wiersz = (WierszWyswietleniaCzytelnikow) obj;
            return idCzytelnika.equals(wiersz.idCzytelnika) && idArtykulu.equals(wiersz.idArtykulu);
        }
    }
}

