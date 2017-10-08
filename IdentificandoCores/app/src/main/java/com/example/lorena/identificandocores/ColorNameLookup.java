package com.example.lorena.identificandocores;


import java.util.ArrayList;

public class ColorNameLookup {

    private ArrayList<ColorName> initColorList() {
        ArrayList<ColorName> colorList = new ArrayList<ColorName>();
        colorList.add(new ColorName("Alice Azul","Pastel", 0xF0, 0xF8, 0xFF));
        colorList.add(new ColorName("Branco Antigo","Pastel", 0xFA, 0xEB, 0xD7));
        colorList.add(new ColorName("Água","Ciano", 0x00, 0xFF, 0xFF));
        colorList.add(new ColorName("Água-marinha","Ciano", 0x7F, 0xFF, 0xD4));
        colorList.add(new ColorName("Azul-celeste","Pastel", 0xF0, 0xFF, 0xFF));
        colorList.add(new ColorName("Bege","Pastel", 0xF5, 0xF5, 0xDC));
        colorList.add(new ColorName("Bisque","Pastel", 0xFF, 0xE4, 0xC4));
        colorList.add(new ColorName("Preto","Cinza", 0x00, 0x00, 0x00));
        colorList.add(new ColorName("Amêndoa Palida","Pastel", 0xFF, 0xEB, 0xCD));
        colorList.add(new ColorName("Azul","Azul", 0x00, 0x00, 0xFF));
        colorList.add(new ColorName("Violeta Azul","Roxo", 0x8A, 0x2B, 0xE2));
        colorList.add(new ColorName("Castanho","Vermelho", 0xA5, 0x2A, 0x2A));
        colorList.add(new ColorName("BurlyWood","Marrom", 0xDE, 0xB8, 0x87));
        colorList.add(new ColorName("Cadete Azul","Ciano", 0x5F, 0x9E, 0xA0));
        colorList.add(new ColorName("Verde amarelado","Verde", 0x7F, 0xFF, 0x00));
        colorList.add(new ColorName("Chocolate","Marrom", 0xD2, 0x69, 0x1E));
        colorList.add(new ColorName("Coral","Vermelho", 0xFF, 0x7F, 0x50));
        colorList.add(new ColorName("Centáurea-Azul","Azul", 0x64, 0x95, 0xED));
        colorList.add(new ColorName("Casca de Cordeiro","Pastel", 0xFF, 0xF8, 0xDC));
        colorList.add(new ColorName("Carmesim","Rosa", 0xDC, 0x14, 0x3C));
        colorList.add(new ColorName("Ciano","Ciano", 0x00, 0xFF, 0xFF));
        colorList.add(new ColorName("Azul Escuro","Azul", 0x00, 0x00, 0x8B));
        colorList.add(new ColorName("Ciano Escuro","Ciano", 0x00, 0x8B, 0x8B));
        colorList.add(new ColorName("GoldenRod Escuro","Marrom", 0xB8, 0x86, 0x0B));
        colorList.add(new ColorName("Cinza Escuro","Cinza", 0xA9, 0xA9, 0xA9));
        colorList.add(new ColorName("Verde Escuro","Verde", 0x00, 0x64, 0x00));
        colorList.add(new ColorName("Caqui Escuro","Marrom", 0xBD, 0xB7, 0x6B));
        colorList.add(new ColorName("Magenta Escuro","Roxo", 0x8B, 0x00, 0x8B));
        colorList.add(new ColorName("Verde Oliva Escuro","Verde", 0x55, 0x6B, 0x2F));
        colorList.add(new ColorName("Laranja Escuro","Laranja", 0xFF, 0x8C, 0x00));
        colorList.add(new ColorName("Orquídea Escuro","Roxo", 0x99, 0x32, 0xCC));
        colorList.add(new ColorName("Vermelho Escuro","Vermelho", 0x8B, 0x00, 0x00));
        colorList.add(new ColorName("Salmão Escuro","Vermelho", 0xE9, 0x96, 0x7A));
        colorList.add(new ColorName("Verde Mar Escuro","Verde", 0x8F, 0xBC, 0x8F));
        colorList.add(new ColorName("Azul Ardósia Escuro","Azul", 0x48, 0x3D, 0x8B));
        colorList.add(new ColorName("Cinza Ardósia Escuro","Verde", 0x2F, 0x4F, 0x4F));
        colorList.add(new ColorName("Turquesa Escuro","Ciano", 0x00, 0xCE, 0xD1));
        colorList.add(new ColorName("Violeta Escuro","Roxo", 0x94, 0x00, 0xD3));
        colorList.add(new ColorName("Rosa Profundo","Rosa", 0xFF, 0x14, 0x93));
        colorList.add(new ColorName("Céu Azul Profundo","Azul", 0x00, 0xBF, 0xFF));
        colorList.add(new ColorName("Cinza Escurecido","Cinza", 0x69, 0x69, 0x69));
        colorList.add(new ColorName("Azul Trapaceiro","Azul", 0x1E, 0x90, 0xFF));
        colorList.add(new ColorName("Tijolo de Fogo","Vermelho", 0xB2, 0x22, 0x22));
        colorList.add(new ColorName("Branco Floral","Pastel", 0xFF, 0xFA, 0xF0));
        colorList.add(new ColorName("Floresta Verde","Verde", 0x22, 0x8B, 0x22));
        colorList.add(new ColorName("Fúcsia","Roxo", 0xFF, 0x00, 0xFF));
        colorList.add(new ColorName("Gainsboro","Cinza", 0xDC, 0xDC, 0xDC));
        colorList.add(new ColorName("Fantasma Branco","Pastel", 0xF8, 0xF8, 0xFF));
        colorList.add(new ColorName("Ouro","Amarelo", 0xFF, 0xD7, 0x00));
        colorList.add(new ColorName("GoldenRod","Marrom", 0xDA, 0xA5, 0x20));
        colorList.add(new ColorName("Cinza","Cinza", 0x80, 0x80, 0x80));
        colorList.add(new ColorName("Verde","Verde", 0x00, 0x80, 0x00));
        colorList.add(new ColorName("Verde-Amaraelo","Verde", 0xAD, 0xFF, 0x2F));
        colorList.add(new ColorName("Melada","Pastel", 0xF0, 0xFF, 0xF0));
        colorList.add(new ColorName("Rosa Quente","Rosa", 0xFF, 0x69, 0xB4));
        colorList.add(new ColorName("Vermelho Indiano","Rosa", 0xCD, 0x5C, 0x5C));
        colorList.add(new ColorName("Anil","Roxo", 0x4B, 0x00, 0x82));
        colorList.add(new ColorName("Marfim","Pastel", 0xFF, 0xFF, 0xF0));
        colorList.add(new ColorName("Caqui","Amarelo", 0xF0, 0xE6, 0x8C));
        colorList.add(new ColorName("Lavanda","Pastel", 0xE6, 0xE6, 0xFA));
        colorList.add(new ColorName("Lavanda Envergonhado","Pastel", 0xFF, 0xF0, 0xF5));
        colorList.add(new ColorName("Verde Grama","Verde", 0x7C, 0xFC, 0x00));
        colorList.add(new ColorName("Limão Chiffon","Pastel", 0xFF, 0xFA, 0xCD));
        colorList.add(new ColorName("Azul Claro","Azul", 0xAD, 0xD8, 0xE6));
        colorList.add(new ColorName("Coral Claro","Rosa", 0xF0, 0x80, 0x80));
        colorList.add(new ColorName("Ciano Claro","Pastel", 0xE0, 0xFF, 0xFF));
        colorList.add(new ColorName("Amarelo Dourado Claro","Pastel", 0xFA, 0xFA, 0xD2));
        colorList.add(new ColorName("Cinza Claro","Cinza", 0xD3, 0xD3, 0xD3));
        colorList.add(new ColorName("Verde Claro","Verde", 0x90, 0xEE, 0x90));
        colorList.add(new ColorName("Rosa Claro","Rosa", 0xFF, 0xB6, 0xC1));
        colorList.add(new ColorName("Salmão Claro","Vermelho", 0xFF, 0xA0, 0x7A));
        colorList.add(new ColorName("Verde Mar Claro","Ciano", 0x20, 0xB2, 0xAA));
        colorList.add(new ColorName("Céu Azul Claro","Azul", 0x87, 0xCE, 0xFA));
        colorList.add(new ColorName("Cinza Ardósia Claro","Azul", 0x77, 0x88, 0x99));
        colorList.add(new ColorName("Aço Azul Claro","Azul", 0xB0, 0xC4, 0xDE));
        colorList.add(new ColorName("Amarelo Claro","Pastel", 0xFF, 0xFF, 0xE0));
        colorList.add(new ColorName("Limão","Verde",0x00, 0xFF, 0x00));
        colorList.add(new ColorName("Verde Limão","Verde", 0x32, 0xCD, 0x32));
        colorList.add(new ColorName("Linho","Pastel", 0xFA, 0xF0, 0xE6));
        colorList.add(new ColorName("Magenta","Roxo", 0xFF, 0x00, 0xFF));
        colorList.add(new ColorName("Castonha-Avermelhado","Vermelho", 0x80, 0x00, 0x00));
        colorList.add(new ColorName("Água-Marinha Média","Ciano", 0x66, 0xCD, 0xAA));
        colorList.add(new ColorName("Azul Médio","Azul", 0x00, 0x00, 0xCD));
        colorList.add(new ColorName("Orquídea Média","Roxo", 0xBA, 0x55, 0xD3));
        colorList.add(new ColorName("Roxo Médio","Roxo", 0x93, 0x70, 0xDB));
        colorList.add(new ColorName("Mar Verde Médio","Verde", 0x3C, 0xB3, 0x71));
        colorList.add(new ColorName("Azul Ardósia Médio","Roxo", 0x7B, 0x68, 0xEE));
        colorList.add(new ColorName("Primavera Verde Média","Verde", 0x00, 0xFA, 0x9A));
        colorList.add(new ColorName("Turquesa Médio","Ciano", 0x48, 0xD1, 0xCC));
        colorList.add(new ColorName("Violeta Vermelha Média","Rosa", 0xC7, 0x15, 0x85));
        colorList.add(new ColorName("Azul Meia-noite","Azul", 0x19, 0x19, 0x70));
        colorList.add(new ColorName("Creme de Hortelã","Pastel", 0xF5, 0xFF, 0xFA));
        colorList.add(new ColorName("Rosa Enevoado","Pastel", 0xFF, 0xE4, 0xE1));
        colorList.add(new ColorName("Moccasim","Pastel", 0xFF, 0xE4, 0xB5));
        colorList.add(new ColorName("Navajo Branco","Marrom", 0xFF, 0xDE, 0xAD));
        colorList.add(new ColorName("Azul Marinho","Azul", 0x00, 0x00, 0x80));
        colorList.add(new ColorName("Cordão Velho","Pastel", 0xFD, 0xF5, 0xE6));
        colorList.add(new ColorName("Oliva","Verde", 0x80, 0x80, 0x00));
        colorList.add(new ColorName("Oliva Monótono","Verde", 0x6B, 0x8E, 0x23));
        colorList.add(new ColorName("Laranja","Laranja", 0xFF, 0xA5, 0x00));
        colorList.add(new ColorName("Laranja Vermelho","Laranja", 0xFF, 0x45, 0x00));
        colorList.add(new ColorName("Orquídea","Roxo",  0xDA, 0x70, 0xD6));
        colorList.add(new ColorName("Pálido GoldenRod","Pastel",  0xEE, 0xE8, 0xAA));
        colorList.add(new ColorName("Verde Pálido","Verde",  0x98, 0xFB, 0x98));
        colorList.add(new ColorName("Turquesa Pálido","Pastel",  0xAF, 0xEE, 0xEE));
        colorList.add(new ColorName("Violeta Vermelha Pálido","Rosa",  0xDB, 0x70, 0x93));
        colorList.add(new ColorName("Creme de Papaia","Pastel",  0xFF, 0xEF, 0xD5));
        colorList.add(new ColorName("Sopro de Pêssego","Pastel",  0xFF, 0xDA, 0xB9));
        colorList.add(new ColorName("Peru","Marrom",  0xCD, 0x85, 0x3F));
        colorList.add(new ColorName("Rosa","Rosa",  0xFF, 0xC0, 0xCB));
        colorList.add(new ColorName("Ameixa","Roxo",  0xDD, 0xA0, 0xDD));
        colorList.add(new ColorName("Pó Azul","Pastel",  0xB0, 0xE0, 0xE6));
        colorList.add(new ColorName("Roxo","Roxo",  0x80, 0x00, 0x80));
        colorList.add(new ColorName("Vermelho","Vermelho",  0xFF, 0x00, 0x00));
        colorList.add(new ColorName("Castanho Rosado","Marrom",  0xBC, 0x8F, 0x8F));
        colorList.add(new ColorName("Azul Real","Azul",  0x41, 0x69, 0xE1));
        colorList.add(new ColorName("Sela Castanha","Marrom",  0x8B, 0x45, 0x13));
        colorList.add(new ColorName("Salmão","Vermelho",  0xFA, 0x80, 0x72));
        colorList.add(new ColorName("Castanho Arenoso","Marrom", 0xF4, 0xA4, 0x60));
        colorList.add(new ColorName("Verde Mar","Verde",  0x2E, 0x8B, 0x57));
        colorList.add(new ColorName("Concha do Mar","Pastel",  0xFF, 0xF5, 0xEE));
        colorList.add(new ColorName("Sienna","Marrom",  0xA0, 0x52, 0x2D));
        colorList.add(new ColorName("Prata","Cinza",  0xC0, 0xC0, 0xC0));
        colorList.add(new ColorName("Céu Azul","Azul",  0x87, 0xCE, 0xEB));
        colorList.add(new ColorName("Azul Ardósia","Azul",  0x6A, 0x5A, 0xCD));
        colorList.add(new ColorName("Cinza Ardósia","Azul",  0x70, 0x80, 0x90));
        colorList.add(new ColorName("Neve","Pastel",  0xFF, 0xFA, 0xFA));
        colorList.add(new ColorName("Primavera Verde","Verde",  0x00, 0xFF, 0x7F));
        colorList.add(new ColorName("Aço Azul","Azul",  0x46, 0x82, 0xB4));
        colorList.add(new ColorName("Brozado","Marrom",  0xD2, 0xB4, 0x8C));
        colorList.add(new ColorName("Cerceta","Ciano",  0x00, 0x80, 0x80));
        colorList.add(new ColorName("Cardo","Pastel",  0xD8, 0xBF, 0xD8));
        colorList.add(new ColorName("Tomate","Vermelho",  0xFF, 0x63, 0x47));
        colorList.add(new ColorName("Turquesa","Ciano",  0x40, 0xE0, 0xD0));
        colorList.add(new ColorName("Violeta","Roxo",  0xEE, 0x82, 0xEE));
        colorList.add(new ColorName("Trigo","Marrom",  0xF5, 0xDE, 0xB3));
        colorList.add(new ColorName("Branco","Cinza",  0xFF, 0xFF, 0xFF));
        colorList.add(new ColorName("Fumaça Branca","Pastel",  0xF5, 0xF5, 0xF5));
        colorList.add(new ColorName("Amarelo","Amarelo",  0xFF, 0xFF, 0x00));
        colorList.add(new ColorName("Amarelo-Verde","Verde",  0x9A, 0xCD, 0x32));
        return colorList;
    }

    public String getColorNameFromRgb(int r, int g, int b) {
        ArrayList<ColorName> colorList = initColorList();
        ColorName closestMatch = null;
        int minMSE = Integer.MAX_VALUE;
        int mse;
        for (ColorName c : colorList) {
            mse = c.computeMSE(r, g, b);
            if (mse < minMSE) {
                minMSE = mse;
                closestMatch = c;
            }
        }

        if (closestMatch != null) {
            return closestMatch.getName();
        } else {
            return "Cor não encontrada.";
        }
    }

    public String getColorTomFromRgb(int r, int g, int b) {
        ArrayList<ColorName> colorList = initColorList();
        ColorName closestMatch = null;
        int minMSE = Integer.MAX_VALUE;
        int mse;
        for (ColorName c : colorList) {
            mse = c.computeMSE(r, g, b);
            if (mse < minMSE) {
                minMSE = mse;
                closestMatch = c;
            }
        }

        if (closestMatch != null) {
            return closestMatch.getTom();
        } else {
            return "Tom não encontrado.";
        }
    }


    public String getColorNameFromHex(int hexColor) {
        int r = (hexColor & 0xFF0000) >> 16;
        int g = (hexColor & 0xFF00) >> 8;
        int b = (hexColor & 0xFF);
        return getColorNameFromRgb(r, g, b);
    }


    public class ColorName {
        public int r, g, b;
        public String name,tom;

        public ColorName(String name, String tom, int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
            this.name = name;
            this.tom = tom;
        }

        public int computeMSE(int pixR, int pixG, int pixB) {
            return (int) (((pixR - r) * (pixR - r) + (pixG - g) * (pixG - g) + (pixB - b)
                    * (pixB - b)) / 3);
        }

        public int getR() {
            return r;
        }

        public int getG() {
            return g;
        }

        public int getB() {
            return b;
        }

        public String getName() {
            return name;
        }
        public String getTom() {
            return tom;
        }
    }
}
