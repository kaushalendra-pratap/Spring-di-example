package Com.sunglowsys.domain;

public class Address {
    private Long addId;
    private String addressLine1;
    private Long houseNo;
    private Long zipCode;
    private String country;

    public Address() {
        System.out.println("address is created");
    }

    public Address(Long addId, String addressLine1, Long houseNo, Long zipCode, String country) {
        this.addId = addId;
        this.addressLine1 = addressLine1;
        this.houseNo = houseNo;
        this.zipCode = zipCode;
        this.country = country;
    }

    public Long getAddId() {
        return addId;
    }

    public void setAddId(Long addId) {
        this.addId = addId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Long getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Long houseNo) {
        this.houseNo = houseNo;
    }

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void checkAddress() {
        System.out.println("AddId :" + 002L);
        System.out.println("AddressLine1 :" + "kasganj");
        System.out.println("HouseNO :" + 32L);
        System.out.println("ZipCode :" + 564330L);
        System.out.println("Country:" + "India");

    }
}
