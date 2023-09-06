package antlr.classess;

public class Condition extends Condition_Def {

    QcOrBig qcOrBig;
    QoOrSmal qoOrSmal;
    SmalOrEQUAL smalOrEQUAL;
    BigOrEQUAL bigOrEQUAL;
    EqualEqual equalEqual;
    NotEqual notEqual;
    Variablecondition variablecondition;

    public QcOrBig getQcOrBig() {
        return qcOrBig;
    }

    public QoOrSmal getQoOrSmal() {
        return qoOrSmal;
    }

    public SmalOrEQUAL getSmalOrEQUAL() {
        return smalOrEQUAL;
    }

    public BigOrEQUAL getBigOrEQUAL() {
        return bigOrEQUAL;
    }

    public EqualEqual getEqualEqual() {
        return equalEqual;
    }

    public NotEqual getNotEqual() {
        return notEqual;
    }

    public Variablecondition getVariablecondition() {
        return variablecondition;
    }

    public void setQcOrBig(QcOrBig qcOrBig) {
        this.qcOrBig = qcOrBig;
    }

    public void setQoOrSmal(QoOrSmal qoOrSmal) {
        this.qoOrSmal = qoOrSmal;
    }

    public void setSmalOrEQUAL(SmalOrEQUAL smalOrEQUAL) {
        this.smalOrEQUAL = smalOrEQUAL;
    }

    public void setBigOrEQUAL(BigOrEQUAL bigOrEQUAL) {
        this.bigOrEQUAL = bigOrEQUAL;
    }

    public void setEqualEqual(EqualEqual equalEqual) {
        this.equalEqual = equalEqual;
    }

    public void setNotEqual(NotEqual notEqual) {
        this.notEqual = notEqual;
    }

    public void setVariablecondition(Variablecondition variablecondition) {
        this.variablecondition = variablecondition;
    }

    @Override
    public String toString() {
        if(qcOrBig!=null)
        {
            return qcOrBig.toString();
        }
        if (qoOrSmal!=null)
        {
            return qoOrSmal.toString();
        }
        if(smalOrEQUAL!=null)
        {
            return smalOrEQUAL.toString();
        }
        if(bigOrEQUAL!=null)
        {
            return bigOrEQUAL.toString();
        }
        if(equalEqual!=null)
        {
            return equalEqual.toString();
        }
        if(notEqual!=null)
        {
            return notEqual.toString();
        }

            return variablecondition.toString();

    }
}
