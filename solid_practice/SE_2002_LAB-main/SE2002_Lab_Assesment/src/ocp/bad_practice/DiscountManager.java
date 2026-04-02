public class DiscountManager {
    public double processDiscount(double price, String type) {
        if (type.equals("STUDENT")) {
            return price * 0.8;
        } else if (type.equals("VIP")) {
            return price * 0.7;
        }
        return price;
    }
}

/* her yeni değişiklik eklendiğinde OCP prensibine değişiklik yaşanmaktadır. Kalabalık if else we switch statementlarından
kurtulmak için ortak bir interface açılıp interface içindeki methoda göre concrete classlar revize edilir. interface e
bağlı olduğu için her yeni bir concrete class eklemesi kolaylaşır. Daha sonra main dosyadaki ana fonksiyon içinde
interface parametre gösterilerek tüm concrete classlar main fonksiyon içine kolaylıkla entegre edilebiilir.
 */