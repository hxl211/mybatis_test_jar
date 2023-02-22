package pojo;

public class Car {
    private Long id;
    private int carNum;
    private String brand;
    private double guidePrice;
    private String produceTime;
    private String carType;

    public Car() {
    }

    public Car(Long id, int carNum, String brand, double guidePrice, String produceTime, String carType) {
        this.id = id;
        this.carNum = carNum;
        this.brand = brand;
        this.guidePrice = guidePrice;
        this.produceTime = produceTime;
        this.carType = carType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(double guidePrice) {
        this.guidePrice = guidePrice;
    }

    public String getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(String produceTime) {
        this.produceTime = produceTime;
    }

    public String getCar_type() {
        return carType;
    }

    public void setCar_type(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", carNum=" + carNum + ", brand='" + brand + '\'' + ", guidePrice=" + guidePrice + ", produceTime='" + produceTime + '\'' + ", car_type='" + carType + '\'' + '}';
    }
}
