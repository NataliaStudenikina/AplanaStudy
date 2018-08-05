/**
 * Задание № 5
 * Необходимо: Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно
 */
public class CalculatorOOP {
    public float value1;
    public float value2;

    public CalculatorOOP(float value1, float value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public float addUp(){
        return this.value1 + this.value2;
    } //метод сложения

    public float subtract() {
        return this.value1 - this.value2;
    } //метода вычитания

    public float multiplication (){
        return this.value1 * this.value2;

    } //метод умножения

    public float division (){
        if (value2 == 0){
            System.out.println("Деление на ноль запрещено");
            return 0;
        } //метод деления
        return this.value1 / this.value2;
    }
}



