package atvjava;

import atvjava.ENTIDADES.fornecedor;
import atvjava.ENTIDADES.produto;

public class TesteProduto {
    fornecedor forn1 = new fornecedor("00.595.222/0001-99","kabum","984132970");
    produto produto1 = new produto(1, "TV LCD",3.500,forn1);
    fornecedor forn2 = new fornecedor("543212345", "claudio", "1234567898");
    produto produto2 = new produto(2, "notebook", 2000, forn2);
    produto produto3 = new produto(3, "impressora", 232, forn2);

}
