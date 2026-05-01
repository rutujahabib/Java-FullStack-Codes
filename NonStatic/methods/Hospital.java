public class Hospital {
    String name;
    int doctorCount;
    boolean government;
    boolean kidneySurgery;
    boolean brainsurgery;
    
    public void display(){
        // name = "Gagalal Hospital";
        // doctorCount = 3;
        // government = true;
        // kidneySurgery = false;
        // brainsurgery= true;

        System.out.println("name: "+ name);
        System.out.println("Doctorcount: "+ doctorCount);
        System.out.println("government: "+ government);
    }
    public void showkidneySurgery(){
            System.out.println("Kidney Availability: "+ kidneySurgery);
    }

    public void showbrainsurgerydetails(){
            System.out.println("brain surgery availibilty: "+ brainsurgery);
    }
    public static void main(String[] args){
        Hospital hop1 = new Hospital();
        hop1.name = "Apollo hospital";
        hop1.doctorCount = 10;
        hop1.government = true;
        hop1.brainsurgery = true;
        hop1.kidneySurgery = false;
        hop1.display();
        hop1.showbrainsurgerydetails();
        hop1.showkidneySurgery();

        System.out.println("***************************");

        Hospital hop2 = new Hospital();
        hop2.name = "Yamuna Hospial";
        hop2.doctorCount = 12;
        hop2.brainsurgery= false;
        hop2.government = false;
        hop2.kidneySurgery = true;
        hop2.display();
        hop2.showbrainsurgerydetails();
        hop2.showkidneySurgery();
    }
}


// name: Apollo hospital
// Doctorcount: 10
// government: true
// brain surgery availibilty: true
// Kidney Availability: false
// ***************************
// name: Yamuna Hospial
// Doctorcount: 12
// government: false
// brain surgery availibilty: false
// Kidney Availability: true