package inheritance;

public class VIPCustomer extends Customer {
   /*
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;
    */

    private int agentID;
    double saleRaio;

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRaio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public VIPCustomer() {

    }

    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price*saleRaio);
    }

    public int getAgentID(){
        return agentID;
    }

    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
