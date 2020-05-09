package table.object;

public class ChooseCodeTable {
    private int lineNo;
    private String programStatement;
    private int nkw;
    private int nid;
    private int nop;
    private int nnv;
    private int nsl;
    private int cs;

    public ChooseCodeTable(int lineNo, String programStatement, int nkw, int nid, int nop, int nnv, int nsl, int cs) {
        this.lineNo = lineNo;
        this.programStatement = programStatement;
        this.nkw = nkw;
        this.nid = nid;
        this.nop = nop;
        this.nnv = nnv;
        this.nsl = nsl;
        this.cs = cs;
    }
}
