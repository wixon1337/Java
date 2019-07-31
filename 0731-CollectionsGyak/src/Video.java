public class Video implements Kolcsonozheto {
    enum idoKorlatOptions {
        EGYNAPOS,
        KETNAPOS,
        KORLATLAN
    }

    enum korHatarOptions {
        _0, _12, _16, _18
    }

    private String filmCim;
    private boolean isKolcsoned;
    private idoKorlatOptions idoKorlat;
    private korHatarOptions korHatar;

    public Video(String filmCim, idoKorlatOptions idoKorlat, korHatarOptions korHatar) {
        this.filmCim = filmCim;
        this.isKolcsoned = true;
        this.idoKorlat = idoKorlat;
        this.korHatar = korHatar;
    }

    public boolean kikolcsonoz(int kor, int napra) throws HibasKolcsonzesException {
        if (this.isKolcsoned) return false;

        switch(this.korHatar) {
            case _12: if (kor < 12) throw new HibasKolcsonzesException("Túl fiatal!");
            break;
            case _16: if (kor < 16) throw new HibasKolcsonzesException("Túl fiatal!");
            break;
            case _18: if (kor < 18) throw new HibasKolcsonzesException("Túl fiatal!");
        }

        switch(this.idoKorlat) {
            case EGYNAPOS: if(napra != 1) throw new HibasKolcsonzesException("Hibas kölcsönzés!");
            break;
            case KETNAPOS: if(napra == 1 || napra == 2) throw new HibasKolcsonzesException("Hibas kölcsönzés!");
            break;
            case KORLATLAN: throw new HibasKolcsonzesException("Hibas kölcsönzés!");
        }
        return true;
    }
}
