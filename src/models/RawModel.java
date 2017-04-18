package models;

/**
 * Created by hrq on 2017-04-17.
 */
public class RawModel {
    private int vaoID;
    private int vertexCount;

    //konstruktor
    public RawModel(int vaoID, int vertexCount) {
        this.vaoID = vaoID;
        this.vertexCount = vertexCount;

    }
    //getters
    public int getVaoID() {
        return vaoID;
    }


    public int getVertexCount() {
        return vertexCount;
    }

}
