package site.wilgo.maratonajava.javacore.ZZGBuilder.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency{

    @Override
    public String getSymbol() {
        return "R$";
    }
}

class DollarUSA implements Currency{

    @Override
    public String getSymbol() {
        return "$";
    }
}

class Euro implements Currency{

    @Override
    public String getSymbol() {
        return "EURO$";
    }
}

