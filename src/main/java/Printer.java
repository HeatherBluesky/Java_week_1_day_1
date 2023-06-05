public class Printer {
    private int sheetsOfPaper;
    private int pages;
    private int toner;

    public Printer(int sheetsOfPaper, int pages, int toner){
        this.sheetsOfPaper= sheetsOfPaper;
        this.pages = pages;
        this.toner = toner;
    }

    public int getStock(){
        return sheetsOfPaper;
    }

    public int getToner(){
        return toner;
    }

    public void readyToPrint(int pages) {
            this.sheetsOfPaper -= pages;
        }

    public void reduceToner(int pages) {
            this.toner -= pages;
        }
    }
