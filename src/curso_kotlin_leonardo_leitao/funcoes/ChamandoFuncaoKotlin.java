package curso_kotlin_leonardo_leitao.funcoes;

import funcoes.SegundoElementoListKt;
import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("João", "Maria", "Pedro");
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}
