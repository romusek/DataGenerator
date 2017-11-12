import java.util.ArrayList;
import java.util.Random;

public class TransakcjeArtykulow
{
    public static void main(String[] sdfsfsvs)
    {
        new GenerateTransakcjeArtykulow().generuj();
    }
}

class GenerateTransakcjeArtykulow
{
    int licznik = 0;
    ArrayList<WierszTransakcjeArtykulow> tabela = new ArrayList<>(Constants.liczbaTransakcji);
    public void generuj()
    {
        WierszTransakcjeArtykulow wiersz;
        for (int i = 0; i < Constants.liczbaTransakcji; i++)
        {
            do
            {
                wiersz = new WierszTransakcjeArtykulow(licznik++, getIdArtykulu(), getDate());
            }
            while (tabela.contains(wiersz));

            tabela.add(wiersz);
        }

        String content = new String();

        for (int i=0; i<Constants.getLiczbaTransakcjiArtykulow; i++)
        {
            wiersz = tabela.get(i);
            content = content + (wiersz.idTransakcji.toString() + ';' + wiersz.idArtykulu.toString()+ ';'+ wiersz.data + '\n');
        }

        new ZapisDoPliku("TransakcjeArtykulow.csv", content);

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

    private class WierszTransakcjeArtykulow
    {
        public Integer idTransakcji;
        public Integer idArtykulu;
        public String data;

        public WierszTransakcjeArtykulow(int idAutora, int idArtykulu, String data)
        {
            this.idTransakcji = idAutora;
            this.idArtykulu = idArtykulu;
            this.data = data;
        }

        @Override
        public boolean equals(Object obj)
        {
            WierszTransakcjeArtykulow wiersz = (WierszTransakcjeArtykulow) obj;
            return idTransakcji.equals(wiersz.idTransakcji) && idArtykulu.equals(wiersz.idArtykulu);
        }
    }
}

