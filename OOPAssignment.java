
package oopassignment;

public class OOPAssignment {

   
    public static void main(String[] args) {
        Student [] std = new Student[10];
        Staff [] staff = new Staff[10];


        std[0] = new Student("Ahsan","Sikander Bakht Street N.Nazimabad","BSCS",2,31000);
        std[1] = new Student("Ali","Hamid Masood Road N.Nazmimabad","BSCS",2,31000);
        std[2] = new Student("Haider","F.B Area","BSSE",2,31000);
        std[3] = new Student("Saad","Madras Society","MCS",1,34000);
        std[4] = new Student("Nawal","Madras Society","BSCS",4,25000);
        std[5] = new Student("Waseem","Gulshan-e-Maymar","BSCS",2,31000);
        std[6] = new Student("Abdur Rafay","Kaneez Fatima Society","BSCS",1,33000);
        std[7] = new Student("Farukh","Port Qasim","BS telecom",2,25000);
        std[8] = new Student("Malala","Gulstan-e-Jauhar","BSSE",2,31000);
        std[9] = new Student("Nafay","K.D.A society","BSSE",2,31000);



        staff[0] = new Staff("Malaika","Gulshan-e-Iqbal","UBIT",20000);
        staff[1] = new Staff("Zahid","Gulshan-e-Maymar","UBIT",21000);
        staff[2] = new Staff("Ashfaq","Model Colony","UBIT",19000);
        staff[3] = new Staff("Shireen","PSCHS society","UBIT",15000);
        staff[4] = new Staff("Ayub","Madras Society","UBIT",20000);
        staff[5] = new Staff("Marium","Buffer Zone","UBIT",21000);
        staff[6] = new Staff("Ahsan","N.Nazimabad","UBIT",17000);
        staff[7] = new Staff("Asghar","Hamid Masood Road","UBIT",21000);
        staff[8] = new Staff("Bilal","Malir Cantt","UBIT",20000);
        staff[9] = new Staff("Rabia","Gulistan-e-Jauhar","UBIT",20000);

        System.out.println("Students");
        for (int i=0;i<std.length;i++){
            System.out.println(std[i].toString());
        }


        System.out.println("Staff");
        for (int i=0;i<staff.length;i++){
            System.out.println(staff[i].toString());
        }



    }
}
    

