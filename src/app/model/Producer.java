package app.model;

public interface Producer {

    /**
     * Metoda zwraca napisy do momentu osiagniecia konca inputu. Wtedy ma zwrocic wartosc null
     * @return zwraca text
     * @throws Exception dowolny wyjatek
     */
    String produce() throws Exception;

}
