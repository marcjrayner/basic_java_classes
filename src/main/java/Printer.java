public class Printer {
    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void print(int copies, int pages) {
        int totalPagesUsed = copies * pages;
        if (this.sheets >= totalPagesUsed) {
            this.sheets -= totalPagesUsed;
        }
    }
}
