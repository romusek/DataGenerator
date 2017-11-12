import java.util.ArrayList;
import java.util.Random;

public class PrzynaleznoscArtykulow {
    public static void main(String[] as){
        String content = new String();
        for (int i=0; i<Constants.liczbaPrzynaleznosciArtykulow; i++){
            content = content + getIdKategorii() + ';' + getIdArtykulu() + '\n';
        }
        new ZapisDoPliku("PrzynaleznoscArtykulow.csv", content);
    }
    static Integer getIdKategorii(){
        return new Random().nextInt(Constants.liczbaKategorii) + 1;
    }
    static Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }
}

class GeneratePrzynaleznoscArtykulow
{
    int licznik = 0;
    ArrayList<WierszPrzynaleznoscArtykulow> tabela = new ArrayList<>(Constants.liczbaPrzynaleznosciArtykulow);
    public void generuj()
    {
        WierszPrzynaleznoscArtykulow wiersz;
        for (int i = 0; i < Constants.liczbaPrzynaleznosciArtykulow; i++)
        {
            do
            {
                wiersz = new WierszPrzynaleznoscArtykulow(getIdKategorii(), getIdArtykulu());
            }
            while (tabela.contains(wiersz));

            tabela.add(wiersz);
        }

        String content = new String();

        for (int i=0; i<Constants.liczbaPrzynaleznosciArtykulow; i++)
        {
            wiersz = tabela.get(i);
            content = content + (wiersz.idKategorii + ';' + wiersz.idArtykulu+ ';' + '\n');
        }

        new ZapisDoPliku("PrzynaleznoscArtykulow.txt", content);

    }
    Integer getIdKategorii(){
        return new Random().nextInt(Constants.liczbaKategorii) + 1;
    }
    Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }

    private class WierszPrzynaleznoscArtykulow
    {
        public int idKategorii;
        public int idArtykulu;

        public WierszPrzynaleznoscArtykulow(int idKategorii, int idArtykulu)
        {
            this.idKategorii = idKategorii;
            this.idArtykulu = idArtykulu;
        }

        @Override
        public boolean equals(Object obj)
        {
            WierszPrzynaleznoscArtykulow wiersz = (WierszPrzynaleznoscArtykulow) obj;
            return idKategorii == wiersz.idKategorii && idArtykulu == wiersz.idArtykulu;
        }
    }
}
