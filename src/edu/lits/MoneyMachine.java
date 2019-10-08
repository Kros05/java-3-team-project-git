package edu.lits;

public class MoneyMachine extends ATM {
    private String company;

    public MoneyMachine(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "MoneyMachine{" +
                "company='" + company + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }


}
