import java.util.ArrayList;
import java.util.Random;

public class ArtykulyAutorow
{
    public static void main(String[] sdfsfsvs)
    {
        new GenerateArtykulyAutorow().generuj();
    }
}

class GenerateArtykulyAutorow
{
    int licznik = 0;
    ArrayList<WierszArtykulyAutorow> tabela = new ArrayList<>(Constants.liczbaArtykulow);
    public void generuj()
    {
        WierszArtykulyAutorow wiersz;
        for (int i = 0; i < Constants.liczbaArtykulow; i++)
        {
            do
            {
                wiersz = new WierszArtykulyAutorow(getIdAutora(), getIdArtykulu());
            }
            while (tabela.contains(wiersz));

            tabela.add(wiersz);
        }

        String content = new String();

        for (int i=0; i<Constants.liczbaArtykulow; i++)
        {
            wiersz = tabela.get(i);
            content = content + (wiersz.idAutora + ';' + wiersz. idArtykulu+ ';' + '\n');
        }

        new ZapisDoPliku("ArtykulyAutorow.csv", content);

    }

    Integer getIdAutora()
    {
        return new Random().nextInt(Constants.liczbaAutorow) + 1;
    }

    Integer getIdArtykulu()
    {
        licznik++;
        return licznik;
    }

    private class WierszArtykulyAutorow
    {
        public int idAutora;
        public int idArtykulu;

        public WierszArtykulyAutorow(int idAutora, int idArtykulu)
        {
            this.idAutora = idAutora;
            this.idArtykulu = idArtykulu;
        }

        @Override
        public boolean equals(Object obj)
        {
            WierszArtykulyAutorow wiersz = (WierszArtykulyAutorow) obj;
            return idAutora == wiersz.idAutora && idArtykulu == wiersz.idArtykulu;
        }
    }
}
