package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//Wiersze źle sformatowane znajdowały się w funkcji: public void countIn(int in)
//Kombinacja alt + <-- / -->  zmienia aktualne okno (Intellij)