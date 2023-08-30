public class Sum_Of_Squares {
    public static void main(String[] args) {
        int somaQuad = 0;
        int quadSoma = 0;
        int index = 0;

        while (index <= 10) {
            somaQuad = somaQuad + index * index;
            System.out.println("Soma Quad : " + somaQuad);
            quadSoma =  quadSoma + index;
            System.out.println("Quad Soma : " + quadSoma);
            index++;
            System.out.println("index : " + index);
        }

        quadSoma = quadSoma * quadSoma;
        int diff;
        diff = quadSoma - somaQuad;
        System.out.println("diff = " + diff);

    }
}
