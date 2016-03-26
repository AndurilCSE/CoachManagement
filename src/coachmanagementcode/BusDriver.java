package coachmanagementcode;

/**
 * Created by shiyam on 2/2/16.
 */
public class BusDriver {

    private String companycode;
    private String name;
    private String address;
    private String tpNumber;

    BusDriver(String companycode,String name,String address,String tpNumber){
        this.setCompanycode(companycode);
        this.setName(name);
        this.setAddress(address);
        this.setTpNumber(tpNumber);
    }

    BusDriver(String companycode,String name,String address){
        this(companycode, name, address, "");
    }

    BusDriver(String companycode,String name){
        this( companycode, name, "","");

    }
    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTpNumber() {
        return tpNumber;
    }

    public void setTpNumber(String tpNumber) {
        this.tpNumber = tpNumber;
    }
}
