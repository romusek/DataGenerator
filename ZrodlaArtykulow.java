import java.util.ArrayList;
import java.util.Random;

public class ZrodlaArtykulow
{
    public static void main(String[] sdfsfsvs)
    {
        new GenerateZrodlaArtykulow().generuj();
    }
}

class GenerateZrodlaArtykulow
{
    int licznik = 0;
    ArrayList<WierszZrodlaArtykulow> tabela = new ArrayList<>(Constants.liczbaZrodelArtykulow);
    public void generuj()
    {
        WierszZrodlaArtykulow wiersz;
        for (int i = 0; i < Constants.liczbaZrodelArtykulow; i++)
        {
            do
            {
                wiersz = new WierszZrodlaArtykulow(getIdArtykulu(), getIdZrodla());
            }
            while (tabela.contains(wiersz));

            tabela.add(wiersz);
        }

        String content = new String();

        for (int i=0; i<Constants.liczbaZrodelArtykulow; i++)
        {
            wiersz = tabela.get(i);
            content = content + (wiersz.idArtykulu.toString() + ';' + wiersz.idZrodla.toString() + '\n');
        }

        new ZapisDoPliku("ZrodlaArtykulow.csv", content);

    }

    Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }
    Integer getIdZrodla(){
        return new Random().nextInt(Constants.liczbaZrodel) + 1;
    }

    private class WierszZrodlaArtykulow
    {
        public Integer idArtykulu;
        public Integer idZrodla;

        public WierszZrodlaArtykulow(int idAutora, int idArtykulu)
        {
            this.idArtykulu = idAutora;
            this.idZrodla = idArtykulu;
        }

        @Override
        public boolean equals(Object obj)
        {
            WierszZrodlaArtykulow wiersz = (WierszZrodlaArtykulow) obj;
            return idArtykulu.equals(wiersz.idArtykulu) && idZrodla.equals(wiersz.idZrodla);
        }
    }
}

