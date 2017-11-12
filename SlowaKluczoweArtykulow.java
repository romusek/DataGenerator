import java.util.ArrayList;
import java.util.Random;

public class SlowaKluczoweArtykulow
{
    public static void main(String[] sdfsfsvs)
    {
        new GenerateSlowaKluczoweArtykulow().generuj();
    }
}

class GenerateSlowaKluczoweArtykulow
{
    int licznik = 0;
    ArrayList<WierszSlowaKluczoweArtykulow> tabela = new ArrayList<>(Constants.liczbaSlowKluczowychArtykolow);
    public void generuj()
    {
        WierszSlowaKluczoweArtykulow wiersz;
        for (int i = 0; i < Constants.liczbaSlowKluczowychArtykolow; i++)
        {
            do
            {
                wiersz = new WierszSlowaKluczoweArtykulow(getIdSlowoKluczowe(), getIdArtykulu());
            }
            while (tabela.contains(wiersz));

            tabela.add(wiersz);
        }

        String content = new String();

        for (int i=0; i<Constants.liczbaSlowKluczowychArtykolow; i++)
        {
            wiersz = tabela.get(i);
            content = content + (wiersz.idSlowoKluczowe + ';' + wiersz. idArtykulu + '\n');
        }

        new ZapisDoPliku("SlowaKluczoweArtykulow.csv", content);

    }

    static Integer getIdSlowoKluczowe(){
        return new Random().nextInt(Constants.liczbaSlowKluczowych) + 1;
    }
    static Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }

    private class WierszSlowaKluczoweArtykulow
    {
        public int idSlowoKluczowe;
        public int idArtykulu;

        public WierszSlowaKluczoweArtykulow(int idAutora, int idArtykulu)
        {
            this.idSlowoKluczowe = idAutora;
            this.idArtykulu = idArtykulu;
        }

        @Override
        public boolean equals(Object obj)
        {
            WierszSlowaKluczoweArtykulow wiersz = (WierszSlowaKluczoweArtykulow) obj;
            return idSlowoKluczowe == wiersz.idSlowoKluczowe && idArtykulu == wiersz.idArtykulu;
        }
    }
}

