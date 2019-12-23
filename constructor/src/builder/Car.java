package builder;

/**
 * Created by Administrator on 2019/12/24.
 */
public class Car {
    private int tireNum;//轮胎个数
    private String powerType;//动力方式

    public int getTireNum() {
        return tireNum;
    }

    public void setTireNum(int tireNum) {
        this.tireNum = tireNum;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    @Override
    public String toString() {
        return "这是一辆" + tireNum + "轮" + powerType + "的车";
    }
}
