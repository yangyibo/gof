package org.yyb.responsibilitychain;

public abstract class Approver {

    Approver nextApprover;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
