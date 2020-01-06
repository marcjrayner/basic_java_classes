public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getToner() {
        return this.toner;
    }

    public void print(int copies, int pages) {
        int totalPagesUsed = copies * pages;
        if (this.sheets >= totalPagesUsed && this.toner >= totalPagesUsed) {
            this.sheets -= totalPagesUsed;
            this.toner -= totalPagesUsed;
        }
    }
}
