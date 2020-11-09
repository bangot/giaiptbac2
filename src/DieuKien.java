public class DieuKien {

    Phuongtrinhbac2 pt=new Phuongtrinhbac2();
    public void nhappt(){
        pt.nhap();
    }
    public void kiemtr() {
        if (pt.a == 0) {
            if (pt.b == 0) {
                System.out.print("pt vo so nghiem");
            } else {
                System.out.print("phuong trinh 1 n" + pt.nghiemduynhat());
            }
        } else {
            if (pt.tinhdelta() == 0) {
                System.out.print("pt co nghiem kep" + pt.nghiemkep());
            } else {
                System.out.println("pt co 2 nghiem pb");
                pt.nghiemphanbiet();
            }
        }
    }
}
