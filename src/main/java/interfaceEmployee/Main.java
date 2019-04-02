package interfaceEmployee;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee hire1 = new SalariedEmployee("Avonte", "Cannon", 9090, 1000.00);
        hire1.makeDate(3, 5, 2019);

        System.out.println(hire1);


        HourlyEmployee hire2 = new HourlyEmployee("William", "Cropper", 9090, 30, 50);
        hire2.makeDate(3, 5, 2019);

        System.out.println(hire2);


        CommissionedEmployee hire3 = new CommissionedEmployee("Avonte", "Cannon", 9090, 0.10, 1000);
        hire3.makeDate(3, 5, 2019);

        System.out.println(hire3);


        BasePlusCommissionedEmployee hire4 = new BasePlusCommissionedEmployee("Avonte", "Cannon", 9090, 0.10, 1000, 1000);
        hire4.makeDate(3, 5, 2019);

        System.out.println(hire4);


        ICalculate[] iCalculates = new ICalculate[]{hire1, hire2, hire3, hire4};

        for (ICalculate fakeObject : iCalculates) {

            fakeObject.cutCheck();


        }

    }
}
