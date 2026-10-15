public class EquipmentJava {
String equipmentId;
String equipmentName;
int availableQuantity;

public Equipment(String equipmentId,String equipmentName,int availableQuantity)
{
    this.equipmentId=equipmentId;
    this.equipmentName=
            equipmentName;
    this.availableQuantity=
            availableQuantity;

}
public void
    displayEquipmentDetail(){
    System.out.println("Equipment ID:"equipmentId);
    System.out.println("Name:"+equipmentName);
    System.out.println("Available Quantity:"+availableQuantity);

}
public void borrowOneltem(){
    if (availableQuantity>0) {
        availableQuantity--;
        System.out.println("Equipment Barrowed Successfully!");
        System.out.println("Remaining Quantity:" + availableQuantity);
    } else {
        System.out.println("Sorry, equipment is not available.");

    }
}
public void returnOnetem(){
    availableQuantity++;
    System.out.println("Equipment Returned Successfully!");
    System.out.println("Available quantity:"+availableQuantity);

}
}
