import java.util.ArrayList;
import java.util.Random;

public class WyswietleniaGosci
{
    public static void main(String[] sdfsfsvs)
    {
        new GenerateWyswietleniaGosci().generuj();
    }
}

class GenerateWyswietleniaGosci
{
    int licznik = 0;
    ArrayList<WierszWyswietleniaGosci> tabela = new ArrayList<>(Constants.liczbaWyswietlenGosci);
    public void generuj()
    {
        WierszWyswietleniaGosci wiersz;
        for (int i = 0; i < Constants.liczbaWyswietlenGosci; i++)
        {
            do
            {
                wiersz = new WierszWyswietleniaGosci(getIdGoscia(), getIdArtykulu());
            }
            while (tabela.contains(wiersz));

            tabela.add(wiersz);
        }

        String content = new String();

        for (int i=0; i<Constants.liczbaWyswietlenGosci; i++)
        {
            wiersz = tabela.get(i);
            content = content + (wiersz.idGoscia + ';' + wiersz.idArtykulu + '\n');
        }

        new ZapisDoPliku("WyswietleniaGosci.csv", content);

    }

    Integer getIdGoscia(){
        return new Random().nextInt(Constants.liczbaGosci) + 1;
    }
    Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }

    private class WierszWyswietleniaGosci
    {
        public int idGoscia;
        public int idArtykulu;

        public WierszWyswietleniaGosci(int idAutora, int idArtykulu)
        {
            this.idGoscia = idAutora;
            this.idArtykulu = idArtykulu;
        }

        @Override
        public boolean equals(Object obj)
        {
            WierszWyswietleniaGosci wiersz = (WierszWyswietleniaGosci) obj;
            return idGoscia == wiersz.idGoscia && idArtykulu == wiersz.idArtykulu;
        }
    }
}

