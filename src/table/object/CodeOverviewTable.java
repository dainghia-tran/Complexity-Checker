package table.object;

public class CodeOverviewTable {
    private int lineNo;
    private String programStatements;
    private int cs;
    private int cv;
    private int cm;
    private int ci;
    private int ccp;
    private int ccs;
    private int tcps;

    public CodeOverviewTable(int lineNo, String programStatements, int cs, int cv, int cm, int ci, int ccp, int ccs, int tcps) {
        this.lineNo = lineNo;
        this.programStatements = programStatements;
        this.cs = cs;
        this.cv = cv;
        this.cm = cm;
        this.ci = ci;
        this.ccp = ccp;
        this.ccs = ccs;
        this.tcps = tcps;
    }
}
