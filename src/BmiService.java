public class BmiService {
    public int calculate(int a, int b) {
        double f = 100; //переменная для перевода сантиметров в метры
        double metres = a / f; //переводим сантиметры в метры
        double square = Math.pow(metres, 2); //возводим метры в квадрат
        double index = b / square; //вычисляем индекс
        return (int) index; //возвращаем значение, убрав знаки после запятой
    }
}
