//A distância de Manhattan entre os pontos (x1, y1) e (x2, y2) é definida da seguinte forma:∣x2−x1∣+∣y2−y1∣

public static int distanciaManhattan(int x1, int y1, int x2, int y2) {
    // Este método deve retornar a distância de Manhattan
    int distancia = Math.abs(x2-x1) + Math.abs(y2-y1);
    return distancia;
}

