public class Darts {
    public int rounds = 1;
    public int startScore = 301;
    public int scoreActual = 301;
    public int dartNumber = 3;
    public boolean isFirst = true;

    enum Multiplier{
        DOUBLE(2),
        TRIPLE(3);
        private int mult;

        Multiplier(int mult){
            this.mult = mult;
        }

        public int getMult() { return mult; }

    }


    public void dart(int num)  {
        if (!isFirst) {
            scoreActual = scoreActual - num;
            if (this.dartNumber > 1) {
                this.dartNumber--;
            } else {
                this.rounds++;
                this.dartNumber = 3;
            }
        }
    }

    public void dart (int num, Multiplier m){
        if(this.dartNumber > 1) {this.dartNumber--; } else {this.dartNumber = 3; this.rounds++;}
        if (m.getMult() == 2 && isFirst) {
            scoreActual = scoreActual - (num * m.mult);
            isFirst = false;
        } else if(scoreActual - num == 0 && m.getMult() == 2){
            scoreActual = scoreActual - num;
        } else if (!isFirst) {
            scoreActual = scoreActual - (num * m.mult);
        }

    }

    public int getScore(){ return isFirst ? startScore : scoreActual; }

    public boolean isFinished(){
        return scoreActual == 0 ? true : false;
    }

    public int getDartsLeft(){
        return dartNumber;
    }

    public int getRound(){
        return rounds;
    }

}