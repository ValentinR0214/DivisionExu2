package mx.edu.utez.server.modules.dto;

public class NumsDTO {
    private Long num1;
    private Long num2;

    public NumsDTO() {
    }

    public NumsDTO(Long num1, Long num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Long getNum1() {
        return num1;
    }

    public void setNum1(Long num1) {
        this.num1 = num1;
    }

    public Long getNum2() {
        return num2;
    }

    public void setNum2(Long num2) {
        this.num2 = num2;
    }
}
