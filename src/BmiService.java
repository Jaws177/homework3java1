public class BmiService {
    public int calculate(int height, int weight) {
        double converter = 100; //переменная для перевода сантиметров в метры
        double metres = height / converter; //переводим сантиметры в метры
        double square = Math.pow(metres, 2); //возводим метры в квадрат
        double index = weight / square; //вычисляем индекс
        return (int) index; //возвращаем значение, убрав знаки после запятой
    }
}
