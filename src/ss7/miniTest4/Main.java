package ss7.miniTest4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        Material[] materials = new Material[10];
//        materials[0] = new Meat("1","ThitLon",LocalDate.of(2025, 1, 14),1000,1000);
//        materials[1] = new Meat("2","ThitCho",LocalDate.of(2025, 2, 12),1000,1000);
//        materials[2] = new Meat("3","ThitBo",LocalDate.of(2025, 3, 15),1000,1000);
//        materials[3] = new Meat("4","ThitChim",LocalDate.of(2025, 4, 16),1000,1000);
//        materials[4] = new Meat("5","ThitMeo",LocalDate.of(2025, 5, 17),1000,1000);
//
//        materials[5] = new CrispyFlour("6","Bot1",LocalDate.of(2025, 7, 17),1000,1000);
//        materials[6] = new CrispyFlour("7","Bot2",LocalDate.of(2025, 8, 17),1000,1000);
//        materials[7] = new CrispyFlour("8","Bot3",LocalDate.of(2025, 9, 17),1000,1000);
//        materials[8] = new CrispyFlour("9","Bot4",LocalDate.of(2025, 10, 17),1000,1000);
//        materials[9] = new CrispyFlour("10","Bot5",LocalDate.of(2025, 11, 17),1000,1000);

        ManageMaterial manageMaterial = new ManageMaterial();

        manageMaterial.addMaterial(manageMaterial.getSize(),new Meat("1","ThitLon",LocalDate.of(2025, 1, 14),1000,1000));
        manageMaterial.addMaterial(manageMaterial.getSize(),new Meat("2","ThitCho",LocalDate.of(2025, 2, 12),1000,1000));
        manageMaterial.addMaterial(manageMaterial.getSize(),new Meat("3","ThitBo",LocalDate.of(2025, 3, 15),1000,1000));
        manageMaterial.addMaterial(manageMaterial.getSize(),new Meat("4","ThitChim",LocalDate.of(2025, 4, 16),1000,1000));
        manageMaterial.addMaterial(manageMaterial.getSize(),new Meat("5","ThitMeo",LocalDate.of(2025, 5, 17),1000,1000));
        manageMaterial.addMaterial(manageMaterial.getSize(),new CrispyFlour("6","Bot1",LocalDate.of(2025, 7, 17),1000,1000));
        manageMaterial.addMaterial(manageMaterial.getSize(),new CrispyFlour("7","Bot2",LocalDate.of(2025, 8, 17),1000,1000));
        manageMaterial.addMaterial(manageMaterial.getSize(),new CrispyFlour("8","Bot3",LocalDate.of(2025, 9, 17),1000,1000));
        manageMaterial.addMaterial(manageMaterial.getSize(),new CrispyFlour("9","Bot4",LocalDate.of(2025, 10, 17),1000,1000));
        manageMaterial.addMaterial(manageMaterial.getSize(),new CrispyFlour("10","Bot5",LocalDate.of(2025, 10, 17),1000,1000));

        manageMaterial.delMaterial(9);

        manageMaterial.editMaterial(8,new CrispyFlour("8","Bot3",LocalDate.of(2025, 9, 17),1000,1000));

        manageMaterial.printMaterials();

        System.out.println("TONG TIEN LA: " + calcSum(manageMaterial.getMaterials()));
        System.out.println("CHENH LECH TIEN THUC TE VA GIAM GIA: "+ calcDiffDiscountAndRealCost(manageMaterial.getMaterials()) );
    }

    public static double calcSum( Material[] materials ){
        double sum = 0;

        for (Material material:materials){
            if (material instanceof Meat){
                sum+= ((Meat) material).getRealMoney();
            } else if (material instanceof CrispyFlour){
                sum+= ((CrispyFlour) material).getRealMoney();
            }
        }
        return sum;
    }

    public static double calcDiffDiscountAndRealCost( Material[] materials ){

        double diff = 0;

        for (Material material:materials){
            if (material instanceof Meat){
                diff+= (material.getCost()- ((Meat) material).getRealMoney());
            } else if (material instanceof CrispyFlour){
                diff+= (material.getCost()- ((CrispyFlour) material).getRealMoney());
            }
        }
        return diff;
    }
}
