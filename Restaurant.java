public class Restaurant implements Comparable<Restaurant>{
  private String name;
  private String zip;
  private String address;
  private String phone;

  public Restaurant(String name, String zip){
    if (name == null || zip.length > 5 ){
      throw new IllegalArgumentException();
    }

    this.name = name;
    this.zip = zip;
  }

    public Restaurant(String name, String zip. String address, String phone){
      if (name == null || zip.length > 5 || address  == "" || address == null || phone == null || phone == ""){
      throw new IllegalArgumentException();
    }

    this.address = address;
    this.phone = phone;
  }

  public void addInspection(Inspection inspect)



  public getName(){
    return name;
  }

  public getZip(){
    return zip;
  }

  public getAddress(){
     return address;
  }

  public getPhone(){
    return phone;
  }

  public void setName(String newName){
    this.name = newName; 
  }
  
  public void setZip(String newZip){
    this.zip = newZip;
  }

  public void setAddress(String newAddress){
    this.address = newAddress;
  }

  public void setPhone(String newPhone){
    this.phone = newPhone;
  }

}

@Override
public int compareTo(Restaurant res){
  
}