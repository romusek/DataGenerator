import java.util.Random;

public class PrawaCzytelnikow {
    //static Integer idWlasciciela;
    public static void main(String[] sdfsgfgb){
        String content = new String();
        for (int i=0; i<Constants.liczbaPrawCzytelnikow; i++){
            content = content + getIdWlasciciela() + ';' + getIdCzytelnika() + ';' + getIdTypuPrawa() + ';' + '\n';

        }
        new ZapisDoPliku("PrawaCzytelnikow.txt", content);
    }
    static Integer getIdWlasciciela(){
        return new Random().nextInt(Constants.liczbaWlascicieli) + 1;
    }
    static Integer getIdCzytelnika(){
        return new Random().nextInt(Constants.liczbaCzytelnikow);
    }
    static Integer getIdTypuPrawa(){
        return new Random().nextInt(Constants.liczbaTypuPrawa) + 1;
    }

}
/*
*           TO SIĘ MOZE NAM SPIERDOLIC
* o co chodzi tu z idWlasciciela??? ilu jestr tych wlascicieli?
* z tego by wynikalo ze mimo wszystko mamy nie jednego wlasciciela
* moim zdaniem jest zbedne
* */
